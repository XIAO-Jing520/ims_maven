package cn.xiao.common.Interceptor;

import cn.xiao.common.cookie.Addcookie;
import cn.xiao.identity.bean.User;
import cn.xiao.identity.dao.UserDao;
import cn.xiao.identity.service.InterF.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;


public class Interceptor implements HandlerInterceptor {

    @Autowired
    private UserServiceI userServiceI;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("进入Interceptor===================");
        User user = (User) request.getSession().getAttribute("user_session");
        if (user == null) {
            Cookie cookie = Addcookie.getCookieName(request, response);
            if (cookie == null) {
                request.setAttribute("message", "您尚未登录，请登录");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
                System.out.println("进入InterceptorcookieNull===================");
                return false;
            } else {

                String[] values = cookie.getValue().split("_");
                String userIdCookie = values[0];
                System.out.println("userIdCookie"+userIdCookie);
                User user1 =userServiceI.selectId(User.class,userIdCookie);
//                System.out.println(user1);
                request.getSession().setAttribute("user_session",user1);
                System.out.println("进入Interceptorcookie===================");
                return true;
            }

        } else return true;
    }

}
