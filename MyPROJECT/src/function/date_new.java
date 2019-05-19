package function;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date_new {
	
	public  String date_up(String dateold) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date date=sdf.parse(dateold);
        /*
         * Use format method of SimpleDateFormat class to format the date.
         */
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        String newdate=dt1.format(date);
        
		
	return newdate;	
	}
	
}
