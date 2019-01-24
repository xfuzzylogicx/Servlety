package pl.coderslab.Filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Filter_z1_encoding implements Filter {

    String charsetEncoding="utf-8";
    String contentType="text/html";

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding(charsetEncoding);
        resp.setCharacterEncoding(charsetEncoding);
        resp.setContentType(contentType);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

        //charsetEncoding=
    }

}
