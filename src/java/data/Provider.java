/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServlet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Provider extends HttpServlet {
    String dbUrl="jdbc:derby://localhost:1527/sample";
    String user="app";
    String pass="app";
    Connection conn=null;
    public Connection Connect(){
         try {  
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            conn=DriverManager.getConnection(dbUrl,user,pass);
            System.out.println("Connection successed!");

        } catch (Exception ex) {
            System.out.println("Connection failure!");
                    
        }
        return conn;
    }
    public void InsertUserData(String user_name,String password,String email,String bd){
        Connect();
        try{
        Statement statement=conn.createStatement();
            int executeUpdate=statement.executeUpdate("insert into user_data  values('"+user_name+"','"+password+"','"+email+"','"+bd+"')");
            conn.close();
        }catch(Exception e){
            out.print("Something went wrong");
        }
    }   
    public void Delete(String user_name){
        Connect();  
        try{
           Statement st = conn.createStatement();
           int exup=st.executeUpdate("DELETE FROM user_data WHERE user_name = '"+user_name+"'");
            conn.close();
        }catch(Exception ex){
             out.print("Something went wrong");
        }
        
    }
    public void Update(String user_name,String password,String email){
        Connect();
    }
    public void Search(String user_name,String password,String email){
        Connect();
    }
  
     boolean Check(String email,String password){
         Connect();  
        try{
           Statement st = conn.createStatement();
           ResultSet rs=st.executeQuery("select * FROM user_data where email='"+email+"'");
           while(rs.next()){
                String pass=rs.getString("password");
                String email_sql=rs.getString("email");
                if (password.equals(pass)){
                    return true;
                }else{
                    return false;
                }
                   
            }
        }catch(Exception ex){
             out.print("Something went wrong");
        }
       return false;
    }
}
