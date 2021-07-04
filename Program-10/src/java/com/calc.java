/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;


/**
 *
 * @author SKANDA
 */
@WebServlet(name = "calc", urlPatterns = {"/calc"})
public class calc extends HttpServlet {
    @EJB
    private CallogicLocal callogic;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        try {
            Double n1,n2, result;
            n1=Double.valueOf(request.getParameter("n1"));
            n2=Double.valueOf(request.getParameter("n2"));
            String opt=request.getParameter("operation");
            switch(opt){
                case "add":
                    result=callogic.add(n1, n2);
                    out.println("Result is "+result);
                    break;
                case "sub":
                    result=callogic.sub(n1, n2);
                    out.println("Result is "+result);
                    break;
                case "multi":
                    result=callogic.mul(n1, n2);
                    out.println("Result is "+result);
                    break;
                case "div":
                    result=callogic.div(n1, n2);
                    out.println("Result is "+result);
                    break;
                default:
                    out.println("ERROR!!");
                    break;
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            out.close();
        }
    }
}
