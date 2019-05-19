package laba2;
import java.util.HashSet;
import java.util.TreeSet;

public class Program1 {

	public static void main(String[] args) {
		
		TreeSet<String> fam = new TreeSet<String>();
		fam.add("Abaimov");
		fam.add("Bezrukg");
		fam.add("Biriukov");
		fam.add("Bogush");
	    fam.add("Volkov");
	    fam.add("Avrasin");
	    fam.add("Grechko");
	    fam.add("Evdokhin");
	    fam.add("Derkach");
	    fam.add("Evsyushin");
	    fam.add("Iefymenko");
	    fam.add("Oborin");
	    
	    for(String familia : fam) {
			System.out.println(familia);
		}
	    System.out.println("------------------------------------------------");
		
	    HashSet<String> famRemove=new HashSet<String>();
	    int j = 0;
	    for(String familia : fam) {
	    	j++;
	    		famRemove.add(familia);
	    	   if(j==5)
	    		   break;	
		}
	   
	    fam.removeAll(famRemove);
	    
	    for(String familia : fam) {
			System.out.println(familia);
		}

	}

}
