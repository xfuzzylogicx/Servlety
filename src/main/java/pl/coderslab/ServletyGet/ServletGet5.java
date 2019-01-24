package pl.coderslab.ServletyGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/ServletGet5")
public class ServletGet5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        String company=request.getParameter("company");
        String[] learn=request.getParameterValues("learn");

        response.getWriter().append("Company: ").append("</br>").append("&nbsp;&nbsp; -").append(company).append("</br>")
                .append("Learn: ").append("</br>");
        for (String e:learn)
        {
            response.getWriter().append("&nbsp;&nbsp;- ").append(e).append("</br>");
        }
    }
}
