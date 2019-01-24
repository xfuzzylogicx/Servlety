package pl.coderslab.ServletyGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
Zadanie 3
        W projekcie stwórz servlet Get3, który ma pobierać dwie zmienne o nazwach width i height.
         Jeżeli informacje nie są przesłane to width = 5 i height = 10.
        Następnie wygeneruj tabliczkę mnożenia o podanej wysokości i szerokości i wyświetl ją w przeglądarce.
*/

@WebServlet(name = "ServletGet3")
public class ServletGet3 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        String height=request.getParameter("heigth");
        String width=request.getParameter("width");

        int heightnumber=Integer.parseInt(height);
        int widthtnumber=Integer.parseInt(width);

        for (int i = 1; i <=widthtnumber; i++)
        {
            for (int j = 1; j <=heightnumber ; j++)
            {
                response.getWriter().append(String.valueOf(i)).append("*").append(String.valueOf(j))
                        .append("=").append(String.valueOf(widthtnumber*heightnumber));
            }//dokonczyc
        }

    }
}
