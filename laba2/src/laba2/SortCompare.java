package laba2;
import java.util.Comparator;
public class SortCompare implements Comparator<Student>{
	public int compare (Student a, Student b) {
		
		if(a.getSurname().length()>b.getSurname().length())
			return 1;
		else if (a.getSurname().length()<b.getSurname().length())
			return -1;
		else return 0;
	}
}
