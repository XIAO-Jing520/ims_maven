package cn.xiao.identity.controller;

import cn.xiao.common.pager.PageModel;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.service.InterF.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/identity")
public class UserController {
    @Autowired
    private UserServiceI userServiceI;

    //用户分页查询
    @RequestMapping("/user/selectUser")
    public String selectUser(HttpServletRequest request, PageModel pageModel, User user) {

        System.out.println("selectUser--------------------------------------------------------------------------");
        List<User> users = userServiceI.selectAllUser(user, pageModel);
        request.setAttribute("users", users);
        for (User a : users) {
            System.out.println(a.getChecker());
        }
        return "/identity/user/user";
    }
    //加载更新用户界面

    @RequestMapping("/user/updateUserLoad")
    public String updateUserLoad(Model model, @RequestParam("id") String id) {

        System.out.println("加载更新用户界面----------------------------");
        User user = userServiceI.selectId(User.class, id);
        model.addAttribute("user", user);

        return "/identity/user/updateUser";
    }

    //更新用户
    @RequestMapping("/user/updateUser")
    public String updateUser(Model model, User user) {

        System.out.println("进入updateUser----------------------------------------------");
        System.out.println(user.getDept().getId());
        userServiceI.update(user);
        model.addAttribute("message", "更新成功");
        return "/identity/user/updateUser";
    }

    //预览用户
    @RequestMapping("/user/preUser")
    public String preUser(Model model, @RequestParam("id") String id, User user) {
        System.out.println(id);
        User user1 = userServiceI.selectId(User.class, id);
        model.addAttribute("user", user1);

        return "/identity/user/preUser";
    }

    //激活用户
    @RequestMapping("/user/activeUser")
    public String activeUser(User user, PageModel pageModel) {

        System.out.println("activeUser----------------------------------------------");
        userServiceI.activeUser(user, pageModel);
        return "forward:/identity/user/selectUser";
    }

    //进入添加用户界面
    @RequestMapping("/user/addUser")
    public String addUser(User user , HttpSession session,Model model) {

        System.out.println("addUser----------------------------------------------");

        if (user.getUserId() == null) {
            System.out.println("user---------------------null");
        }
        else{
            System.out.println(user);
            userServiceI.addUser(user,session);
            model.addAttribute("message","添加用户成功");
            System.out.println("添加成功------------------------------------");
        }
        return "/identity/user/addUser";

    }
    //账号查重
    @ResponseBody
    @RequestMapping(value = "/selAjaxId", produces = {"application/text;charset=utf-8"})
    public String selAjaxId(String id){
        System.out.println("进入selAjaxId--------------------------------------------");
        User user=userServiceI.selectId(User.class,id);
        if (user!=null){
            return "exit";
        }
        else return null;
    }

    //删除用户
    @RequestMapping("/user/deleteUser")
    public String deleteUser(@RequestParam("userIds") String[] str,HttpSession session) {

        System.out.println(Arrays.toString(str));
        System.out.println("deleteUser----------------------------------------------");
        userServiceI.deleteUser(str,session);
        return "forward:/identity/user/selectUser";
    }

}
