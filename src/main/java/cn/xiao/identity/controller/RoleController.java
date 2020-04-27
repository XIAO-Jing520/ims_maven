package cn.xiao.identity.controller;

import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.Module;
import cn.xiao.identity.bean.Role;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.service.InterF.ModuleServiceI;
import cn.xiao.identity.service.InterF.RoleServiceI;
import cn.xiao.identity.service.InterF.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/identity")
public class RoleController {
    @Autowired
    private RoleServiceI roleServiceI;
    @Autowired
    private UserServiceI userServiceI;
    @Autowired
    private ModuleServiceI moduleServiceI;

    @RequestMapping("/role/selectRole")
    public String selectRole(HttpServletRequest request, PageModel pageModel) {

        List<Role> roles = roleServiceI.selectAllRole(pageModel);
        request.setAttribute("roles", roles);
        return "/identity/role/role";
    }

    //进入添加角色界面
    @RequestMapping("/role/addRole")
    public String addRole() {

        return "/identity/role/addRole";
    }

    //添加角色
    @RequestMapping("/role/addRole.action")
    public String addRoleOption(Role role, HttpSession session, Model model) {

        roleServiceI.addRole(role, session);
        model.addAttribute("message", "添加角色成功");
        return "/identity/role/addRole";
    }

    //删除角色
    @RequestMapping("/role/deleteRole.action")
    public String deleteRole(@RequestParam("roleIds") String[] roleIds, Model model) {
        System.out.println(Arrays.toString(roleIds));
        roleServiceI.deleteRoles(roleIds);
        model.addAttribute("message", "删除角色成功");
        return "forward:/identity/role/selectRole";
    }

    //进入修改角色界面
    @RequestMapping("/role/updateRole")
    public String updateRole(@RequestParam("id") long id, Model model) {

        System.out.println(id + "----------------------------------------------------");
        Role role = roleServiceI.selectRole(Role.class, id);
        model.addAttribute("role", role);
        return "/identity/role/updateRole";

    }

    //修改角色
    @RequestMapping("/role/updateRole.action")
    public String updateRole(String id, Role role, Model model, HttpSession session) {

        System.out.println(role.getId() + "  " + role.getName());
        if (role.getId() != null) {
            System.out.println("静茹updateRole----------------------------------------------");
            roleServiceI.updateRole(role, session);
            model.addAttribute("message", "修改角色成功");
        }
        return "/identity/role/updateRole";

    }


    //看看角色绑定的用户
    @RequestMapping("/role/selectRoleUser")
    public String bindUser(String id, Model model, PageModel pageModel) {
        System.out.println(id + "=------------------------------------");
        List<User> users = roleServiceI.selectRoleUser(id,pageModel);
        model.addAttribute("users", users);
        model.addAttribute("id", id);
        return "/identity/role/bindUser/roleUser";
    }
    //进入绑定用户界面
    @RequestMapping("/role/bindUser")
    public String bindUserOption(String id, Model model, PageModel pageModel) {
        System.out.println(id + "------------------------------------");
        List<User> users = roleServiceI.selectRoleUserNot(id,pageModel);
        model.addAttribute("users", users);
        model.addAttribute("id", id);
        return "/identity/role/bindUser/bindUser";
    }
    //绑定用户
    @RequestMapping("/role/addRoleBind")
    public String addRoleBind(String[] userIds, Model model, PageModel pageModel,String id) {
        roleServiceI.addRoleBind(userIds,id);
        model.addAttribute("message", "绑定用户成功");
        return "forward:/identity/role/bindUser";
    }
    //解除绑定用户
    @RequestMapping("/role/removeRoleBind")
    public String removeRoleBind(String[] userIds, Model model, PageModel pageModel,String id) {
        roleServiceI.removeRoleBind(userIds,id);
        model.addAttribute("message", "解除用户成功");
        return "forward:/identity/role/selectRoleUser";
    }

}
