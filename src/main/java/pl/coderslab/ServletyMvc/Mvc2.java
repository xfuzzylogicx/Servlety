package pl.coderslab.ServletyMvc;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Mvc2")
public class Mvc2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        String start = request.getParameter("start");
        String end = request.getParameter("end");

        if(StringUtils.isBlank(start) || StringUtils.isBlank(end))
        {
            response.getWriter().append("Brak przesłanych zmiennych");
            return;
        }

        int startInt= Integer.parseInt(start)+10;
        int endInt= Integer.parseInt(end)+10;
        request.setAttribute("start", startInt);
        request.setAttribute("end", endInt);

        getServletContext().getRequestDispatcher("/jspMvc12.jsp").forward(request,response);
    }
}
