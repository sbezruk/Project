package laba2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class Zadanie2 {

	public static void main(String[] args) {
		  ArrayList<Integer> arr1 = new ArrayList<Integer>();
		  ArrayList<Integer> arr2 = new ArrayList<Integer>();
		  arr1.add(1);
		  arr1.add(2);
		  
		  System.out.println("Equals: " +arr1.equals(arr2) );
		  
		  ArrayList<Student> students=new ArrayList<Student>();
			
			students.add(new Student("Bezruk", "Svetlana", "ESTM", 1));
			students.add(new Student("Biriukov", "Dmytro", "ESTM", 1));
			students.add(new Student("Volkov", "Mychailo", "ESTM", 1));
			students.add(new Student("Grechko", "Anna", "ESTM", 1));
			students.add(new Student("Evdokhin", "Endry", "ESTM", 1));
			students.add(new Student("Oborin", "Mikchael", "ESTM", 1));
			students.add(new Student("Iefymenko", "Andre", "ESTM", 1));
			students.add(new Student("Derkach", "Alisa", "ESTM", 1));
			
			Student st=new Student("Iefymenko", "Andre", "ESTM", 1);
			System.out.println("Does myHashSet contain ? " + students.contains(st));
			students.remove(st);
			for(Student stud: students) {
				System.out.printf(stud.name+" "+stud.surname+"%n" );
				
				
			}
			
			
	}

}
