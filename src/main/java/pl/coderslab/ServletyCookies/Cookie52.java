package pl.coderslab.ServletyCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie52")
public class Cookie52 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        Cookie[] cookies=request.getCookies();
        if (cookies==null || cookies.length==0)
        {
            response.getWriter().append("Cookies not found");
            return;
        }
        for(Cookie cookie: cookies)
        {

            if(cookie.getName().equals("User51"))
            {
                response.getWriter().append("Cookie name: ").append(cookie.getName()).append("</br>");
            }
        }
    }
}
