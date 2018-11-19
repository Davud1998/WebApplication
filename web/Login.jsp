<%-- 
    Document   : Login
    Created on : Nov 7, 2018, 10:41:08 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3 align="center">Login</h3>
        
    <form action="Login" method="Post">
    <input type="text" name="email" placeholder="E-mail" />
    <input type="password" name="password" placeholder="Password" />
    <input type="submit" name="sign_in" value="Sign in"/><br>
    <a href="insert.jsp" link="regist.jsp">You don't have an account?</a>
    </form>
    </body>
</html>
