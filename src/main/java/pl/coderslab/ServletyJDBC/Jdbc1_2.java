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

@WebServlet("/Jdbc1_2")
public class Jdbc1_2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String title=request.getParameter("title");
        String author=request.getParameter("author");
        String isbn=request.getParameter("isbn");
        Book newBook= new Book(title,author, isbn);
        request.setAttribute("book",newBook);
        /* zadanie jdbc**************************************************************/
        BookDao.getInstance().save(newBook);
        //BookDao.getInstance().remove(4);//zmienic
        /* zadanie jdbc**************************************************************/
        getServletContext().getRequestDispatcher("/jspMvc13.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        getServletContext().getRequestDispatcher("/jspJDBC1.jsp").forward(request,response);
    }
}
