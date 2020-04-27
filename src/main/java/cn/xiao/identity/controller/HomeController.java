package cn.xiao.identity.controller;

import cn.xiao.identity.bean.User;
import cn.xiao.identity.service.InterF.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private UserServiceI userServiceI;


    @RequestMapping("/identity/user/updateSelf")
    public String updateSelf(User user, HttpSession session, Model model, HttpServletRequest request) {
        System.out.println(userServiceI);
        System.out.println("saveUser====================");
//        System.out.println(user);
        userServiceI.updateSelf(user,session);
        request.setAttribute("message","修改成功");
        return "/comn/home";
    }


}
