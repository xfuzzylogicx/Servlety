package pl.coderslab.ServletyPost;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletPost3")
public class ServletPost3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double numberA=Integer.parseInt(request.getParameter("numberA"));
        double numberB=Integer.parseInt(request.getParameter("numberB"));
        double numberC=Integer.parseInt(request.getParameter("numberC"));

        double pierwiastek1=0;
        double pierwiastek2=0;

        Double delta= Math.pow(numberB, 2)-4*numberA*numberC;
        response.getWriter().append(delta.toString());

        if (delta<0)
        {
            response.getWriter().append(" delta <0. ");
        }
        else if (delta==0)
        {
            pierwiastek1= (-numberB/(2*numberA));
            response.getWriter().append(" Delta=0 pierwiastek=").append(String.valueOf(pierwiastek1));
        }
        else
        {
            pierwiastek1= (-numberB-Math.pow(delta,1/2))/(2*numberA);
            pierwiastek2= (-numberB+Math.pow(delta,1/2))/(2*numberA);
            response.getWriter()
                    .append(" Delta>0 pierwiastek1=")
                    .append(String.valueOf(pierwiastek1))
                    .append(" pierwiastek2=")
                    .append(String.valueOf(pierwiastek2));
        }

    }

}
