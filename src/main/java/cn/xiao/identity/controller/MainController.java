package cn.xiao.identity.controller;

import cn.xiao.identity.bean.Module;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.service.InterF.PopedomServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;


@Controller
public class MainController {
    @Autowired
    private PopedomServiceI popedomServiceI;

    @RequestMapping("/main.action")
    public String mainController(Model model, HttpServletRequest request) {

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user_session");
         //根据用户id获取该用户拥有哪些操作权限
        Map<Module, List<Module>> maps = popedomServiceI.getUserMenuOperas(user.getUserId());
        model.addAttribute("maps", maps);
        //获取用户操作权限
        List<String> operas = popedomServiceI.findOperas(user.getUserId());
        session.setAttribute("operas", operas);
        return "/comn/main";

    }
}
