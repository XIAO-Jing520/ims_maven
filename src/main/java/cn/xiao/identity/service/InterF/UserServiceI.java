package cn.xiao.identity.service.InterF;


import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.Role;
import cn.xiao.identity.bean.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserServiceI {

    User selectId(Class clazz, String id);

    void updateSelf(User user,HttpSession session);

    void update(User user);

    String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, String userId, String password, String vcode, String rem);

    List<User> selectAllUser(User user, PageModel pageModel);

    void activeUser(User user, PageModel pageModel);

    void addUser(User user,HttpSession session);

    void deleteUser(String[] str ,HttpSession session);
}
