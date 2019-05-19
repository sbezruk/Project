import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Cookie;

import role.user.user;

public class DBarticles {

	
	String url = "jdbc:mysql://localhost/blog?serverTimezone=Europe/Moscow&useSSL=false";
    String username = "root";
    String password = "12345";
    
	try{
      Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
      try (Connection conn = DriverManager.getConnection(url, username, password)){
            
          String sql = "SELECT * FROM articles WHERE UserAid='"+id+"'";
          try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
              
              ResultSet resultSet = preparedStatement.executeQuery();
              if(resultSet.next()){

                 int id_a = resultSet.getInt("id_a");
                  
                 String title_a=resultSet.getString("title_a");
                 String content_a=resultSet.getString("content_a");
                
                 
              articles art=new articles(id_a,title_a,content_a);
              session.setAttribute("user_now_s", user_now_s);
                 user user_now= new user(prodId, u_login, u_pass, u_name, u_surname, u_email, u_access);
       request.setAttribute("user_now", user_now);
  getServletContext().getRequestDispatcher("/pageofuser.jsp").forward(request, response);
                  
                  
              }
              else
           	   writer.println("<h1>Incorrect login or password</h1>");
  	        writer.println("<a href=index.jsp>Go to login page</a>");
          }
      }
  }
  catch(Exception ex){
      System.out.println(ex);
  }
}
