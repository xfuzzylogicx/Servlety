package pl.coderslab.ServletyPost;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/ServletPost4")
public class ServletPost4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        Random random= new Random();
        int randNum=random.nextInt(6)+5;
        response.getWriter().append(String.valueOf(randNum));

        StringBuilder stringBuilder= new StringBuilder("<form method='post'>");
        for(int i=0;i<randNum;i++)
        {
            stringBuilder.append("<input name='numbers'/><br/>");
        }
        stringBuilder.append(" <input type='submit'/></form>");
        response.getWriter().append(stringBuilder);//dokonczyc reszte zadania
    }
}
