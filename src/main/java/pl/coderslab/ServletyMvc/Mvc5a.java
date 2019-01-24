package pl.coderslab.ServletyMvc;

import org.apache.commons.lang3.StringUtils;
import pl.coderslab.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*Zadanie 5
        W projekcie stwórz servlet Mvc15 dostępny pod adresem /Mvc15.
        Servlet ma udostępniać możliwość dodawania nowej książki w sposób pojedynczy (obiekt Book),
         który następnie będzie zapisywany do sesji.
        Następnie stwórz Mvc152 dostępny pod adresem /Mvc152, który będzie udostępniał możliwość
        tworzenia 3 książek na raz - podobnie jak w poprzednim zadaniu, niezależnie od metody dodania
        książki ma ona zostać zapisana w sesji. Utworzone obiekty przechowuj w tablicy lub kolekcji.
        Stwórz servlet, który będzie wyświetlał w widoku listę wszystkich utworzonych książek.*/
@WebServlet("/Mvc5a")
public class Mvc5a extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        HttpSession session= request.getSession();


        List<Book> books=(List<Book>)session.getAttribute("books");
        if(books==null)
        {
            books=new ArrayList<>();
        }

            String title=request.getParameter("title");
            String author=request.getParameter("author");
            String isbn=request.getParameter("isbn");

            if(StringUtils.isNotBlank(title)&&StringUtils.isNotBlank(author)&&StringUtils.isNotBlank(isbn))
            {
                Book newbook=new Book(title,author,isbn);
                books.add(newbook);
                session.setAttribute("books",books);
            }
        getServletContext().getRequestDispatcher("/jspMvc15.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        /*HttpSession session= request.getSession();
        List<Book> books=(List<Book>)session.getAttribute("books");
        if(books==null ||books.isEmpty())
        {
            response.getWriter().append("Brak ");
            return;
        }
        request.setAttribute("books",books);*/
        getServletContext().getRequestDispatcher("/jspMvc15.jsp").forward(request,response);
    }
}
