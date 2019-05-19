package role.user;
import java.io.Serializable;
public class user implements Serializable {
	 private int id;
	    private String login;
	    private String password;
	    private String name;
	    private String surname;
	    private String email;
	    private Boolean access;
	    private String birthday;

	    public user(int id,String login,String password,String name,String surname,String email,Boolean access){
	        this.id=id;
	        this.login=login;
	        this.password=password;
	        this.name=name;
	        this.surname=surname;
	        this.email=email;
	        this.access=access;
	        
	    }
	    
	    public user(int id,String login,String password,String name,String surname,String email, String birthday){
	        this.id=id;
	        this.login=login;
	        this.password=password;
	        this.name=name;
	        this.surname=surname;
	        this.email=email;
	        
	        this.birthday=birthday;
	        
	    }
	    public user(String login,String password,String name,String surname,String email,Boolean access){
	        
	        this.login=login;
	        this.password=password;
	        this.name=name;
	        this.surname=surname;
	        this.email=email;
	        this.access=access;
	       
	        
	    }

	    public int getId(){
	        return id;
	    }

	    public String getBirthday() {
	    	return birthday;
	    }
	    
	    public void setId(int id){
	        this.id=id;
	    }
	    
	    public void setB(String birthday) {
	    	this.birthday=birthday;
	    }

	    public Boolean getAccess(){
	        return access;
	    }

	    public void setAccess(Boolean access){
	        this.access=access;
	    }

	    public String getLogin(){
	        return login;
	    }

	    public void setLogin(String login){
	        this.login=login;
	    }

	    public String getPassword(){
	        return password;
	    }

	    public void setPassword(String password){
	        this.password=password;
	    }

	    public String getName(){
	        return name;
	    }

	    public void setName(String name){
	        this.name=name;
	    }

	    public String getSurname(){
	        return surname;
	    }

	    public void setSurname(String surname){
	        this.surname=surname;
	    }

	    public String getEmail(){
	        return email;
	    }
	   

	    public void setEmail(String email){
	        this.email=email;
	    }
}
