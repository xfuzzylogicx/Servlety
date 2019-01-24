package pl.coderslab.ServletyPost;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletPost2")
public class ServletPost2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String userText=request.getParameter("userText");

        //rozszerzyc slownik  przeklenstw pozniej i dodac ilosc *=dlugosc tokenajzerem na zajeciach bylo
        String[] censor =new String[2];
        censor[0]="cholera";
        censor[1]="klocek";

        if (request.getParameter("agree")==null)
        {
            for(int i=0;i<censor.length;i++)
            {
                userText = userText.toLowerCase().replace(censor[i], "*******");
            }
        }
        response.getWriter().append(userText);

    }


}
