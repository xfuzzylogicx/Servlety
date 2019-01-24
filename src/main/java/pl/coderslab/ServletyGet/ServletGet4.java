package pl.coderslab.ServletyGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
Zadanie 4
        W projekcie stwórz servlet Get4, dostępny pod adresem /Get4, oraz stronę HTML index.html
        , w której zawarty jest formularz przesyłany metodą GET z jednym polem page.
        Po uruchomieniu aplikacji na serwerze, uzupełnieniu i zatwierdzeniu formularza
        w przeglądarce wyświetli się informacja czy wartość została przesłana oraz wyświetlone
         zostaną dzielniki całkowite przesłanej liczby.
*/

@WebServlet("/ServletGet4")
public class ServletGet4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        String page=request.getParameter("page");
        response.getWriter().append("Page: ").append(page);

        int pageNumber=Integer.parseInt(page);
        response.getWriter().append("dzielniki: ");
        for (int i = 1; i <= pageNumber; i++) {
            if(pageNumber%i==0)
            {
                response.getWriter().append(String.valueOf(i)).append("</br>") ;//poprawic??
            }
        }
    }
}
