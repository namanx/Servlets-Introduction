
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author ntgun
 */
public class SecondServlet extends GenericServlet {
    
    @Override
    public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
    {
        System.out.println("This servlet is made using Generic Servlet..");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("What a beautiful day !");
    }
        
    }

