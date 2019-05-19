package role.user;

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
import database.data.articles;
@WebServlet("/go")
public class go extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		user user_now_s = (user) session.getAttribute("user_now_s");
		
		PrintWriter writer = response.getWriter();
		String url = "jdbc:mysql://localhost/blog?serverTimezone=Europe/Moscow&useSSL=false";
	     String username = "root";
	     String password = "12345";
	     String login = request.getParameter("login");
	        String pass = request.getParameter("pass");
		try{
           Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
           try (Connection conn = DriverManager.getConnection(url, username, password)){
                 
               String sql = "SELECT * FROM users WHERE login_u='"+login+"'and password_u='"+pass+"'";
               try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                   
                   ResultSet resultSet = preparedStatement.executeQuery();
                   if(resultSet.next()){

                      int prodId = resultSet.getInt("id_u");
                       
                      String u_name=resultSet.getString("name_u");
                      String u_surname=resultSet.getString("surname_u");
                      String u_email=resultSet.getString("email_u");
                      String u_login=resultSet.getString("login_u");
                      String u_pass=resultSet.getString("password_u");
                      Boolean u_access=resultSet.getBoolean("access");
                      String u_birthday=resultSet.getString("birthday");
                      
                   user_now_s=new user(prodId, u_login, u_pass, u_name, u_surname, u_email, u_birthday);
                   session.setAttribute("user_now_s", user_now_s);
                      user user_now= new user(prodId, u_login, u_pass, u_name, u_surname, u_email, u_access);
            request.setAttribute("user_now", user_now);
            
           // String sql1 = "SELECT * FROM articles WHERE UserAid='"+prodId+"'";
            
           //int id_a = resultSet.getInt("id_a");
            
            //String title_a=resultSet.getString("title_a");
            //String content_a=resultSet.getString("content_a");
           
            
         //articles art=new articles(id_a,title_a,content_a);
         //request.setAttribute("art_now", art);
            
            
            
            
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
