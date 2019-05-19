package role.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import role.user.go;
import role.user.user;
import database.data.UserDB;
import javax.servlet.http.Cookie;
import function.date_new;
@WebServlet("/edit")
public class edit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
	
		
	
        getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
	}
	String url = "jdbc:mysql://localhost/blog?serverTimezone=Europe/Moscow&useSSL=false";
    String username = "root";
    String password = "12345";
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
         
			int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String email = request.getParameter("email");
            String login = request.getParameter("login");
            String password = request.getParameter("pass");
            String birthday = request.getParameter("date_");
            
          date_new dn=new date_new();
            String new_date=dn.date_up(birthday);
            System.out.println(new_date);
            user user_edit = new user(id, login, password, name, surname,email, new_date);
            UserDB.update(user_edit,id);
            response.sendRedirect(request.getContextPath() + "/pageofuser.jsp");
        }
        catch(Exception ex) {
             
            getServletContext().getRequestDispatcher("/notfound.jsp").forward(request, response);   
        }
    }
	}


