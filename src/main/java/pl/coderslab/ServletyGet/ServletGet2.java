package pl.coderslab.ServletyGet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/ServletGet2")
public class ServletGet2 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        Map<String,String[]> paramMap=request.getParameterMap();
        for(String key:paramMap.keySet())
        {
            response.getWriter().append(key)
                    .append(": ")
                    .append(Arrays.toString(paramMap.get(key))).append("</br>");
        }
    }
}
