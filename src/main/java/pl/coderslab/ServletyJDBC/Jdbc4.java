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

@WebServlet("/Jdbc4")
public class Jdbc4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String title =request.getParameter("titleSearch");
        List<Book> allBooks= BookDao.getInstance().findOne(title);
        request.setAttribute("Books",allBooks);
        request.getRequestDispatcher("/jspJDBC4.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        List<Book> allBooks= BookDao.getInstance().findAll();
        request.setAttribute("Books",allBooks);
        request.getRequestDispatcher("/jspJDBC4.jsp").forward(request,response);
    }
}
