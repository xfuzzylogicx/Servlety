package pl.coderslab.ServletyGet;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*Zadanie 1 - rozwiązywane z wykładowcą
        W projekcie stwórz servlet Get1, który wczyta dwie zmienne: start i end .
        Po uruchomieniu aplikacji na serwerze, w przeglądarce wyświetlą się wszystkie liczby od start do end. (dla uproszczenia załóżmy, że będziemy przesyłać tylko liczby całkowite).
        Jeżeli zmienne nie są przesłane, to strona ma wypisać informację 'Brak przesłanych zmiennych'.*/
@WebServlet("/ServletGet1")
public class ServletGet1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String start=request.getParameter("start");
        String end=request.getParameter("end");

        if(StringUtils.isBlank(start) || StringUtils.isBlank(end))
        {
            response.getWriter().append("Brak przesłanych zmiennych");
            return;
        }
        try {
            int startNum=Integer.parseInt(start);
            int endNum=Integer.parseInt(end);

            if(startNum>=endNum)
            {
                response.getWriter().append("nieprawidłowe parametry");
                return;
            }
            for(int i=startNum;i<endNum;i++)
            {
                response.getWriter().append(String.valueOf(i)).append(", ");
            }
        } catch (NumberFormatException e) {
           response.getWriter().append("podaj liczbe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
