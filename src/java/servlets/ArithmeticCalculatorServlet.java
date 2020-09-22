/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 831690
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

   
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        int firstNo = 0;
        int secondNo = 0;
        int calculation;
        try {
        
            firstNo = Integer.parseInt(first);
            secondNo = Integer.parseInt(second);
        }
        catch (NumberFormatException e) {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        if (request.getParameter("operation").equals("+")) {
            
            calculation = firstNo + secondNo;
            
            request.setAttribute("message", calculation);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        else if (request.getParameter("operation").equals("-")) {
            
            calculation = firstNo - secondNo;
            
            request.setAttribute("message", calculation);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        else if (request.getParameter("operation").equals("*")) {
            
            calculation = firstNo * secondNo;
            
            request.setAttribute("message", calculation);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
        else if (request.getParameter("operation").equals("%")) {
            
            calculation = firstNo / secondNo;
            
            request.setAttribute("message", calculation);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").
                forward(request, response);
        }
        
    }
}
