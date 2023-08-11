
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;



public class FirstServlet implements Servlet{
    ServletConfig confi;
    
    
    // life cycle methods
    public void init(ServletConfig confi){
        this.confi = confi;
        System.out.println("Creating Object...");
    }
    
    public void service(ServletRequest req , ServletResponse res) throws ServletException,IOException{
            System.out.println("Servicing..");
            // set the content type of the response
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            out.println("This is the output from the servlet method");
            out.println("<h1>Today's date and time is"+new Date().toString()+"</h1>");
    }
    
    public void destroy(){
        System.out.println("Going to destroy the Servlet");
    }
    
    
    // non-life cycle methods
    
    public ServletConfig getServletConfig(){
        return this.confi;
    }
    
    public String getServletInfo(){
        return "This Servlet is Created By Naman Guntiwar";
    }
}
