package com.app;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/loginServlet")
public class Filter1 extends HttpFilter implements Filter {

    /**
     * @see HttpFilter#HttpFilter()
     */
    public Filter1() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request,
            ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        String pwd = request.getParameter("txtPassword");

        if (pwd != null) {

            pwd = pwd.trim().toUpperCase();

            request.setAttribute("pass", pwd);
        }

        chain.doFilter(request, response);

        if (pwd != null) {
            pwd = pwd.trim().toLowerCase();
            response.getWriter().println(""+pwd);
        }

        //		String pwd1 = request.getParameter("txtPassword");
        //		pwd1 = pwd1.trim().toLowerCase();
        //		request.setAttribute("pass1", pwd1);
    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig)
            throws ServletException {
        // TODO Auto-generated method stub
    }

}