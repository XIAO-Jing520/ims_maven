package cn.xiao.identity.controller;

import cn.xiao.identity.bean.User;
import cn.xiao.identity.service.InterF.UserServiceI;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @Autowired
    private UserServiceI userServiceI;

    @ResponseBody
    @RequestMapping(value = "/login", produces = {"application/text;charset=utf-8"})
    public String login(HttpServletRequest request, HttpServletResponse response, HttpSession session, @RequestParam("userId") String userId, @RequestParam("passWord") String password, @RequestParam("vcode") String vcode, @RequestParam("rem") String rem) {

        System.out.println("进入 loginController=============");
        String user = userServiceI.login(request,response,session, userId, password, vcode, rem);
        return user;
    }
    @RequestMapping("/loginOut")
    public String loginOut(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        session.removeAttribute("user_session");
        return "forward:/login.jsp";
    }


}
