package pl.coderslab.ServletyGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
Pierwszy Get61, powinien generować linki
        do drugiego Get62, przekazując metodą GET dane pod kluczem year (od 1980 do 2010).*/
@WebServlet("/ServletGet61")
public class ServletGet61 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        for (int i = 1980; i <=2010 ; i++)
        {
            response.getWriter().append("<a href=/ServletGet62?year=")
                    .append(String.valueOf(i))
                    .append(">Link").append(String.valueOf(i)).append("</a>")
                    .append("</br>");
        }
    }
}
