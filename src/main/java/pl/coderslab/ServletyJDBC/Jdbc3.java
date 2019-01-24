package pl.coderslab.ServletyJDBC;

import pl.coderslab.Book;
import pl.coderslab.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/Jdbc3")
public class Jdbc3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String isbn=request.getParameter("isbn");
        if(isbn!=null)
        {
            response.getWriter().append("cos jest");
            return;
        }
        List<Book> allBooks= BookDao.getInstance().findAll();
        request.setAttribute("Books",allBooks);
        request.getRequestDispatcher("/jspJDBC3.jsp").forward(request,response);
    }
}
