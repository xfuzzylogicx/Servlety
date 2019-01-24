package pl.coderslab.ServletyCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie51")
public class Cookie51 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        Cookie cookieTest = new Cookie("User51", "CodersLab");
        cookieTest.setMaxAge(24*60*60);
        response.addCookie(cookieTest);

        response.getWriter()
                .append("<a href='/Cookie52'>Click me(/Cookie52)</a></br>");

        //dokonczyc
    }
}
