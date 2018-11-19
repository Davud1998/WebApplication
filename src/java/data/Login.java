/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Button;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Davud
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends Provider {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String submit=request.getParameter("signup_submit");
        boolean flag=Check(email, password);
        if(flag==true){
        response.sendRedirect("main.html");
             
        }else{
            response.sendRedirect("Login.jsp");
            
        }
    }
}
