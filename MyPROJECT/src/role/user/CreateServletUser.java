package role.user;

import java.io.IOException;
import java.util.ArrayList;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import database.data.UserDB;
import java.io.PrintWriter;
import function.date_new;

@WebServlet("/CreateServletUser")
public class CreateServletUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/registration.html").forward(request, response);
	}

	
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int i=0;
		PrintWriter writer = response.getWriter();
		
		try {
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String email = request.getParameter("email");
            String login = request.getParameter("login");
            String password = request.getParameter("pass");
            //String birthday = request.getParameter("date");
            //date_new dn=new date_new();
            //String new_date=dn.date_up(birthday);
           Boolean access=true;
           
           boolean result = email.matches("^[\\w]([\\w-]{1,19})@([a-z]{3,8})\\.([a-z]{2,3})$");
	        boolean result1 = name.matches("^[A-Z][a-z-A-Z`]{1,20}$");
	        boolean result2 = surname.matches("^[A-Z][a-z-A-Z`]{1,20}$");
	        boolean result3 = password.matches("^[\\w]{5,20}$");
	        boolean result4 = login.matches("^[A-Za-z_]([A-Za-z\\d_]{2,19})$");
	        
	        if(result == true){
	        	 i++;
	        }
	        else{
	        	 writer.println("<h2><span style=color:red;>Check email!</span></h2>"); 	 
	        }
	        
	        if(result1 == true){
	        	 i++;
	        }
	        else{
	        	 writer.println("<h2><span style=color:red;>Check name!</span></h2>"); 	 
	        }
	        
	        if(result2 == true){
	        	 i++;
	        }
	        else{
	        	 writer.println("<h2><span style=color:red;>Check surname!</span></h2>"); 	 
	        }
		
	        if(result3 == true){
	        	 i++;
	        }
	        else{
	        	 writer.println("<h2><span style=color:red;>Check pussword!</span></h2>"); 	 
	        }
	        
	        if(result4 == true){
	        	 i++;
	        }
	        else{
	        	 writer.println("<h2><span style=color:red;>Check login!</span></h2>"); 	 
	        }
		   
	        
	        if (i==5) { 
	        	// date_new dn=new date_new();
	            //String new_date=dn.date_up(birthday);
            user NewUser = new user(login, password ,name, surname, email, access );
            //UserDB d=new UserDB();
        	int a=UserDB.insertSelect(NewUser);
            
            
          
           
            
            
            
        	if (a==1){
        		writer.println("<h1>such user already exists</h1>");
        	writer.println("<a href=index.jsp>Go to login page</a>");}
        	else{
        		UserDB.insert(NewUser);
	        writer.println("<h1>you registered</h1>");
	        writer.println("<a href=index.jsp>Go to login page</a>");}
	        }
	        
	        else
	        {
	        	
	        	writer.println("<h1><span style=color:red;>check the data!</span></h1>");
	        	
	        	writer.println("<a href=registration.html>Go to registration</a>");
	        	/*response.sendRedirect(request.getContextPath()+"/Registration.jsp");*/ 	
	        }
	        
        }
        catch(Exception ex) {
             
            getServletContext().getRequestDispatcher("/registration.html").forward(request, response); 
        }
	}

}
