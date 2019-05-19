package database.data;

public class articles {
	public int id;
	public int iduser;
	public String title;
	public String content;
	public String date;
	
	
	public articles(int id, String title, String content, String date, int iduser){
        
        this.id = id;
        this.title = title;
        this.content = content;
        this.date=date;
        this.iduser=iduser;
    }
	
public articles( int id,String title, String content){
        
       
        this.title = title;
        this.content = content;
        this.id=id;
    }
     
    public int getId() {
        return id;
    }
    
    public int getIdu() {
        return iduser;
    }
     
    public String getTitle() {
        return title;
    }
    
    public String getContent(){
    	return content;
    }
    
    public String getDate(){
    	return date;
    }
 
    public int setId(int id) {
        return id;
    }
    
    public int setIdu(int iduser) {
        return iduser;
    }
 
    public void setContent(String content) {
        this.content=content;
    }
 
    public void setDate(String date) {
        this.date = date;
    }
}
