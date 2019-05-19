package laba2;
import java.util.HashSet;
public class Program {

	public static void main(String[] args) {
		HashSet<String> familii=new HashSet<String>();
		
		familii.add("Abaimov");
		familii.add("Bezrukg");
		familii.add("Biriukov");
		familii.add("Bogush");
	    familii.add("Volkov");
	    familii.add("Avrasin");
	    familii.add("Grechko");
	    familii.add("Evdokhin");
	    familii.add("Derkach");
	    familii.add("Evsyushin");
	    familii.add("Iefymenko");
	    familii.add("Oborin");
	
	char[] glliter = { 'A', 'E', 'I', 'O', 'U' };
	
	for(String familia : familii) {
		System.out.println(familia);
	}
	
	System.out.println("------------------------------------------------");
	
	HashSet<String> famFound=new HashSet<String>();
	
	for(String familia : familii) {
		
		char[] srt=familia.toCharArray();
		for(int j=0;j<glliter.length; j++) {
			if (srt[0]==glliter[j])
				famFound.add(familia);
		}
	}
	
	familii.removeAll(famFound);
	
	for (String familia : familii) {
		System.out.println(familia);
	}
		
	}
}
