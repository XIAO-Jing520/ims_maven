package cn.xiao.identity.service;

import cn.xiao.common.cookie.Addcookie;
import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.dao.InterF.UserDaoI;
import cn.xiao.identity.service.InterF.UserServiceI;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class UserService implements UserServiceI {
    @Autowired
    private UserDaoI userDao;

    @Override
    public User selectId(Class clazz, String id) {
        User user = userDao.get(User.class, id);
        return user;
    }

    @Override
    public void updateSelf(User user, HttpSession session) {
//        String id=user.getUserId();
//        user.setUserId(id);
        System.out.println("进入updateSelf=============");
        User u = selectId(User.class, user.getUserId());
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setPhone(user.getPhone());
        u.setTel(user.getTel());
        u.setQqNum(user.getQqNum());
        u.setAnswer(user.getAnswer());
        u.setQuestion(user.getQuestion());
        u.setModifyDate(new Date());
        if (session != null) {
            User userMod = (User) session.getAttribute("user_session");
            session.setAttribute("user_session", u);
            u.setModifier(userMod);
        }


    }

    @Override
    public void update(User user) {
        System.out.println("进入updateService=====================================");
        User u = selectId(User.class, user.getUserId());
        u.setName(user.getName());
        u.setPassWord(u.getPassWord());

        System.out.println(user.getDept().getId());
        System.out.println(user.getDept());
        System.out.println(user.getJob().getCode() + "--------------------------");

        u.setDept(user.getDept());
        u.setJob(user.getJob());
        u.setEmail(user.getEmail());
        u.setPhone(user.getPhone());
        u.setTel(user.getTel());
        u.setQqNum(user.getQqNum());
        u.setAnswer(user.getAnswer());
        u.setQuestion(user.getQuestion());


    }

    @Override
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, String userId, String password, String vcode, String rem) {

        System.out.println("rem:" + rem.toString());
        User user = selectId(User.class, userId);
        if (user.getStatus() != 0) {
            if (!vcode.equals(session.getAttribute("vcode").toString())) {
                return "验证码错误";
            } else if (user == null) {
                return "账号不存在";
            } else if (!user.getPassWord().equals(password)) {
                return "密码小错误";
            }
            if (rem.equals("on")) {
                System.out.println(rem + "=======================");
                Addcookie.AddCookie(request, response, user.getUserId(), user.getPassWord());
            }
            session.setAttribute("user_session", user);
            return "";
        } else return "账号未激活";


    }

    @Override
    public List<User> selectAllUser(User user, PageModel pageModel) {
        List<Object> list = new ArrayList<>();
        System.out.println("进入selectAllUserService===============");
        StringBuffer hql = new StringBuffer();
        hql.append("from User  where delFlag = '1'");
        if (user != null) {
            if (!StringUtils.isEmpty(user.getName())) {
                hql.append("and name like ?");
                list.add("%" + user.getName() + "%");
            } else if (!StringUtils.isEmpty(user.getPhone())) {
                hql.append("and phone like ?");
                list.add("%" + user.getPhone() + "%");
            } else if (user.getDept() != null && user.getDept().getId() != null && user.getDept().getId() != 0) {
                hql.append("and dept.id = ?");
                list.add(user.getDept().getId());
            } else if (user.getJob() != null && !StringUtils.isEmpty(user.getJob().getCode()) && !user.getJob().getCode().equals("0")) {
                hql.append("and job.code = ?");
                System.out.println("user.getJob().getCode()" + user.getJob().getCode() + "------------------------------------------------");
                list.add(user.getJob().getCode());
            }
        }
        return userDao.findByPage(hql.toString(), pageModel, list);

    }

    @Override
    public void activeUser(User user, PageModel pageModel) {
        User user1 = userDao.get(User.class, user.getUserId());
        user1.setStatus(user.getStatus());
    }

    @Override
    public void addUser(User user, HttpSession session) {
        user.setCreater((User) session.getAttribute("user_session"));
        user.setCreateDate(new Date());
        userDao.save(user);

    }

    @Override
    public void deleteUser(String[] str, HttpSession session) {
        User user = (User) session.getAttribute("user_session");
        String userId = user.getUserId();
        List<User> users = new ArrayList<>();
        for (String a : str) {
            if (!a.equals(userId)) {
                users.add(selectId(User.class, a));
            }
        }
        userDao.deleteAll(users);
        System.out.println("删除成功---------");
    }


}
