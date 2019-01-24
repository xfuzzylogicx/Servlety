package pl.coderslab.ServletySession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Sess01Get")
public class Sess01Get extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        HttpSession session = request.getSession();
        Object counter= session.getAttribute("counter");
        if (counter==null)
        {
            response.getWriter().append("Brak counter w sesji");
        }
        else
        {
            int counterInt=(int) counter;
            response.getWriter().append("Wartosc counter: ").append(String.valueOf(counterInt)).append("</br>");
            session.setAttribute("counter",++counterInt);
            response.getWriter().append("Wartosc counter(after): ").append(String.valueOf(counterInt)).append("</br>");
            response.getWriter().append("<a href='/Sess01Del'>Click me(/Sess01Del)</a></br>");
        }
    }
}
