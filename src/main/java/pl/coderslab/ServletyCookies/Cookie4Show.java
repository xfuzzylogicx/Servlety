package pl.coderslab.ServletyCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Cookie4Show")
public class Cookie4Show extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        Random random=new Random();
        String name="CookieTest"+random.nextInt(6);
        Cookie cookieTest = new Cookie(name, "CodersLab");
        cookieTest.setMaxAge(24*60*60);
        response.addCookie(cookieTest);

        Cookie[] cookies=request.getCookies();
        if (cookies==null || cookies.length==0)
        {
            response.getWriter().append("Cookies not found");
            return;
        }
        for(Cookie cookie: cookies)
        {

                response.getWriter().append("Cookie name: ").append(cookie.getName()).append("</br>");
        }
        for(Cookie cookie: cookies)
        {
            response.getWriter()
                    .append("<a href='/Cookie4Del?name=")
                    .append(cookie.getName())
                    .append("'>Click me</a></br>");
        }

    }
}
