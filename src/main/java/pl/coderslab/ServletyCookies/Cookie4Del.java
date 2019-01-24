package pl.coderslab.ServletyCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cookie4Del")
public class Cookie4Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name= request.getParameter("name");
        Cookie[] cookies=request.getCookies();
        if (cookies==null || cookies.length==0)
        {
            response.getWriter().append("Cookies not found");
            return;
        }
        for(Cookie cookie: cookies)
        {
            if(cookie.getName().equals(name.toString()))
            {
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                response.getWriter().append("Deleted: ").append(cookie.getName());
            }
        }
    }
}
