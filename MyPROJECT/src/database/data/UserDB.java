package database.data;
import java.sql.*;
import java.util.ArrayList;
import role.user.user;
public class UserDB {

	private static String url = "jdbc:mysql://localhost/blog?serverTimezone=Europe/Moscow&useSSL=false";
    private static String username = "root";
    private static String password = "12345";
    
    public static  int insertSelect(user user)
    {
    	int a=0;
    	try{
    		
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  String u_login=user.getLogin();
            	
                  System.out.println(u_login);
            	Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) id_u FROM users WHERE login_u='" +u_login+"'");
                resultSet.next();
                int count = resultSet.getInt(1);
                
            	if	(count>0)
            	{
            		a= 1;
            	}
            	else a= 0;
            	
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
       return a;
    }
    
    
    
    public static int insert(user userNew) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
                  
                String sql = "INSERT INTO users (name_u,  surname_u, email_u, login_u, password_u,access) Values (?, ?, ?, ?, ?, ?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, userNew.getName());
                    preparedStatement.setString(2, userNew.getSurname());
                    preparedStatement.setString(3, userNew.getEmail()); 
                    preparedStatement.setString(4, userNew.getLogin());
                    preparedStatement.setString(5, userNew.getPassword());
                    preparedStatement.setBoolean(6, userNew.getAccess());
                    //preparedStatement.setString(7, userNew.getBirthday());
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    
    
    public static int update(user upuser, int id) {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)){
            	Statement statement = conn.createStatement();
            	statement.executeUpdate("UPDATE users SET name_u = '"+upuser.getName()+"', surname_u = '"+upuser.getSurname()+"' , email_u = '"+upuser.getEmail()+"', login_u = '"+upuser.getLogin()+"', password_u = '"+upuser.getPassword()+"', birthday = '"+upuser.getBirthday()+"' WHERE id_u = '"+id+"'");
               
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
}
