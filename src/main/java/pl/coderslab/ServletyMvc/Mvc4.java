package pl.coderslab.ServletyMvc;

import pl.coderslab.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*Zadanie 4
        W projekcie stwórz servlet Mvc14 dostępny pod adresem /Mvc14. Następnie:

        W widoku wyświetlanym metodą GET o nazwie form.jsp stwórz formularz zawierający pola o nazwach (title1, author1, isbn1), (title2, author2, isbn2), itd do 5. Formularz ma być przesłany metodą POST do servletu Mvc14.
        Zaimportuj wcześniej stworzoną klasę Book.
        W servlecie Mvc14 odbierz dane i na ich podstawie stwórz obiekty klasy Book.
        Obiekty umieść w liście lub tablicy, którą następnie przekaż do widoku result.jsp.
        W pętli wyświetl właściwości wszystkich obiektów title, author.*/
@WebServlet("/Mvc4")
public class Mvc4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        List<Book> books=new ArrayList<>();
        for (int i = 1; i <6 ; i++)
        {
            String title=request.getParameter("title"+i);
            String author=request.getParameter("author"+i);
            String isbn=request.getParameter("isbn"+i);

            if(title !=null && !title.isEmpty())
            {
                Book newBook=new Book(title,author,isbn);
                books.add(newBook);
            }

        }

        request.setAttribute("books",books);
        getServletContext().getRequestDispatcher("/jspMvc14.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        getServletContext().getRequestDispatcher("/jspMvc14.jsp").forward(request,response);
    }
}
