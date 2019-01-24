package pl.coderslab.ServletySession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*W projekcie stwórz trzy servlety Sess01Set, Sess01Get, Sess01Del. Następnie:
        Pierwszy ma nastawiać informacje w sesji pod kluczem counter na 0.
        Drugi ma wyświetlać zawartość sesji pod kluczem counter i zwiększać ją o 1.
        Jeżeli nie ma takich danych w sesji, to strona powinna wyświetlić odpowiednią informację.
        Trzeci ma usuwać dane z sesji (tylko te trzymane pod kluczem counter).
*/
@WebServlet("/Sess01Del")
public class Sess01Del extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession sess = request.getSession();
        sess.removeAttribute("counter");
        response.getWriter().append("Deleted counter");

    }
}
