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
@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/AgeCalculatorServlet"})
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        
        request.setAttribute("age", age);
        
        int ageNo = 0;
        try {
        
            ageNo = Integer.parseInt(age);
        }
        catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid entry. Please enter a number");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
        }
        
        ageNo += 1;
       
        
        request.setAttribute("message", "Your age next birthday will be " + ageNo);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").
                forward(request, response);
        }
        
    }
