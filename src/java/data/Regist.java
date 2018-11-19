/*All the Liscence rights belong to the Davud Davudov
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Davud
 */
@WebServlet(name = "Regist", urlPatterns = {"/Regist"})
public class Regist extends Provider { 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_name=request.getParameter("username");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String password2=request.getParameter("password2");
        String bd=request.getParameter("bday");
        String submit=request.getParameter("signup_submit");
        InsertUserData(user_name, password, email,bd);

    }
}
