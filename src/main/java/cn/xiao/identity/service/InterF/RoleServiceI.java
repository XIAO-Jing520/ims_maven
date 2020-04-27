package cn.xiao.identity.service.InterF;

import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.Role;
import cn.xiao.identity.bean.User;

import javax.servlet.http.HttpSession;
import java.util.List;
public interface RoleServiceI {
    List<Role> selectAllRole(PageModel pageModel);

    void addRole(Role role, HttpSession session);

    void updateRole(Role role, HttpSession session);

    void deleteRoles(String[] roleIds);

    Role selectRole(Class clazz,long id);

    List<User> selectRoleUser(String id, PageModel pageModel);

    List<User> selectRoleUserNot(String id, PageModel pageModel);

    void addRoleBind(String[] userIds, String id);

    void removeRoleBind(String[] userIds, String id);

}
