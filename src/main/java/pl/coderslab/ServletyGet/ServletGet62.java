package pl.coderslab.ServletyGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/*Drugi Get62 powinien odebrać przesłane poprzez GET dane z pierwszego Get61 i wygenerować 5 linków,
 gdzie każdy z nich ma przenosić do trzeciego Get63 przekazując metodą GET następujące dane:
        year - dane przesłane z poprzedniej strony
        mix - losowa wartość z zakresu od -10 do 10*/
@WebServlet("/ServletGet62")
public class ServletGet62 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        {
            Random rand = new Random();
            int i = rand.nextInt(21) - 10;
            response.getWriter().append("<a href=/ServletGet63?year=")
                    .append(request.getParameter("year"))
                    .append("&mix=")
                    .append(String.valueOf(i))
                    .append(">Link").append(request.getParameter("year")).append("</a>")
                    .append("</br>");
        }
    }
}
