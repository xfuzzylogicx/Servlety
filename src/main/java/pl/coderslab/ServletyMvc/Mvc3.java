package pl.coderslab.ServletyMvc;

import pl.coderslab.Book;
import pl.coderslab.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*W projekcie stwórz servlet Mvc13 dostępny pod adresem /Mvc13. Następnie:

        W widoku stwórz formularz zawierający pola o nazwach (title, author, isbn). Formularz ma przesłać
        dane metodą POST do tego samego servletu (do metody doPost).
        Stwórz klasę Book zawierającą pola zgodne z polami wcześniej utworzonego formularza.
        Odbierz dane i na ich podstawie stwórz obiekt klasy Book.
        Przekaż obiekt do widoku result.jsp.
        Wyświetl właściwości nowo dodanego obiektu: title, author.*/

@WebServlet("/Mvc3")
public class Mvc3 extends HttpServlet {
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
        BookDao.getInstance().remove(4);//zmienic
        /* zadanie jdbc**************************************************************/
        getServletContext().getRequestDispatcher("/jspMvc13.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        getServletContext().getRequestDispatcher("/jspMvc13.jsp").forward(request,response);
    }
}
