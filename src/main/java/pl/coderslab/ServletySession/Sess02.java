package pl.coderslab.ServletySession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
        W projekcie stwórz servlet Sess02. Następnie:
        Dodaj do niego formularz z możliwością wpisania oceny.
        Po zatwierdzeniu formularza dodaj ocenę do sesji. Oceny trzymaj w tablicy,
        którą będziesz wkładać do sesji. Zadbaj o walidację wprowadzanych ocen (nie mniej niż 1 i nie więcej niż 6).
        Wylicz średnią z ocen (pamiętaj o właśnie dodanej ocenie).
        Wszystkie zapamiętane oceny i ich średnia powinny być wyświetlane pod formularzem.*/
@WebServlet("/Sess02")
public class Sess02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");


        HttpSession session= request.getSession();
        List<Integer>marks;
        if(session.getAttribute("marks")==null)
        {
            marks=new ArrayList<>();
        }
        else
        {
            marks=(List<Integer>)session.getAttribute("marks");
        }
        int markInt=Integer.parseInt(request.getParameter("mark"));
        marks.add(markInt);
        session.setAttribute("marks",marks);
        response.sendRedirect("Sess02");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().append("<form method='POST'><label>Ocena: <input type='number' name='mark'></label><input type='submit'></form>");

        HttpSession session =request.getSession();
        List<Integer> marks=(ArrayList<Integer>)session.getAttribute("marks");
        response.getWriter().append(marks.toString());
        //wyswietlanie sredniej dodac
    }

}
