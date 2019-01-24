package pl.coderslab;

import org.apache.log4j.Logger;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

/*
Zadanie 3
        W projekcie stwórz servlet Get3, który ma pobierać dwie zmienne o nazwach width i height.
         Jeżeli informacje nie są przesłane to width = 5 i height = 10.
        Następnie wygeneruj tabliczkę mnożenia o podanej wysokości i szerokości i wyświetl ją w przeglądarce.
*/
public class _1_main
{

    //public static final Logger logger=Logger.getLogger(_1_main.class);
    public static void main(String[] args)
    {
        /*logger.info("log test");
        logger.error("err mesg");
        Connection connect = Jsoup.connect("http://www.onet.pl/");
        try {
            Document document = connect.get();
            Elements links = document.select("span.title");
            for (Element elem : links) {
                System.out.println(elem.text());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        multiplyMe(5,5);

    }
    public static void multiplyMe(int x, int y)
    {

        for(int i=1;i<=x;i++)
        {

            int j=1;
            for(;j<=y;j++)
            {
                System.out.print(i*j);
                System.out.print(";");
            }

            System.out.println();
        }
    }
}
