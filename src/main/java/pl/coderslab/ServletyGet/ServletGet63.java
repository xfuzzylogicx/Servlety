package pl.coderslab.ServletyGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletGet63")
public class ServletGet63 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int newYear=Integer.parseInt(request.getParameter("year"))+Integer.parseInt(request.getParameter("mix"));
        response.getWriter().append("Rok to: ")
                .append(String.valueOf(newYear));
    }
}
