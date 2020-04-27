package cn.xiao.identity.service;

import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.Role;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.dao.InterF.RoleDaoI;
import cn.xiao.identity.dao.InterF.UserDaoI;
import cn.xiao.identity.service.InterF.RoleServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class RoleService implements RoleServiceI {
    @Autowired
    private RoleDaoI roleDaoI;
    @Autowired
    private UserDaoI userDaoI;

    @Override
    public List<Role> selectAllRole(PageModel pageModel) {


        List<Role> roles = roleDaoI.findByPage("from Role where delFlag='1'", pageModel, null);
        return roles;
    }

    @Override
    public void addRole(Role role, HttpSession session) {
        role.setCreateDate(new Date());
        role.setCreater((User) session.getAttribute("user_session"));
        roleDaoI.save(role);

    }

    @Override
    public void updateRole(Role role, HttpSession session) {


        Role role1 = roleDaoI.get(Role.class, role.getId());
        role1.setModifier((User) session.getAttribute("user_session"));
        role1.setName(role.getName());
        role1.setRemark(role.getRemark());
        role1.setModifyDate(new Date());
        System.out.println(role1.toString());
    }

    @Override
    public void deleteRoles(String[] roleIds) {
        System.out.println("deleteRoles----------------------------------------------");
        for (String id : roleIds) {
            Role role = roleDaoI.get(Role.class, Long.valueOf(id));
            role.setDelFlag(0);
        }
    }

    @Override
    public Role selectRole(Class clazz, long id) {

        Role role = (Role) roleDaoI.get(clazz, id);
        return role;
    }

    //查看绑定用户
    @Override
    public List<User> selectRoleUser(String id, PageModel pageModel) {
        return roleDaoI.selectRoleUser(id, pageModel);
    }

    //查看没有绑定的用户
    @Override
    public List<User> selectRoleUserNot(String id, PageModel pageModel) {
        return roleDaoI.selectRoleUserNot(id, pageModel);
    }

    //绑定用户
    @Override
    public void addRoleBind(String[] userIds, String id) {
        Role role = roleDaoI.get(Role.class, Long.valueOf(id));
        Set<User> users = role.getUsers();
        for (String id1 : userIds) {
            users.add(userDaoI.get(User.class, id1));
        }
    }

    @Override
    public void removeRoleBind(String[] userIds, String id) {
        Role role = roleDaoI.get(Role.class, Long.valueOf(id));
        Set<User> users = role.getUsers();
        for (String id1 : userIds) {
            users.remove(userDaoI.get(User.class, id1));
        }
    }


}
