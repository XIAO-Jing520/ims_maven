package cn.xiao.common.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Addcookie {
    public static boolean AddCookie(HttpServletRequest request, HttpServletResponse response, String userId, String password) {

        boolean flag=true;
        System.out.println("进入Addcookie=========");
        String value = userId + "_" + password;
        Cookie cookie=getCookieName(request, response);
        if (cookie!=null) {
//            System.out.println("cookie不为空的情况下在增加cookie");
//            Cookie cookie1=new Cookie("userIdAndPassword",value);
//            cookie.setValue(value);
//            cookie.setPath(request.getContextPath());
//            cookie.setMaxAge(60 * 60 * 24 * 7);
//            response.addCookie(cookie);
            System.out.println("cookie不为空的情况下在增加cookie");
            cookie.setValue(value);
            return flag;
        }
        Cookie cookie1=new Cookie("userId_password",value);
        cookie1.setPath(request.getContextPath());
        cookie1.setMaxAge(60 * 60 * 24 * 7);
        response.addCookie(cookie1);
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies) {
            System.out.println(c.getName()+"   "+c.getValue());
        }
        return flag;


    }

    public static Cookie getCookieName(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies==null){return null;}
        for (Cookie c : cookies) {
            if (c.getName().equals("userId_password")) {
                String[] values = c.getValue().split("_");
                String userIdCookie = values[0];
                String passwordCookie = values[1];
                return c;
            }
        }
        return null;

    }
}
