package laba2;
import java.util.HashSet;

public class Program2 {

	public static void main(String[] args) {
		HashSet<Student> students=new HashSet<Student>();
		
		students.add(new Student("Bezruk", "Svetlana", "ESTM", 1));
		students.add(new Student("Biriukov", "Dmytro", "ESTM", 1));
		students.add(new Student("Volkov", "Mychailo", "ESTM", 1));
		students.add(new Student("Grechko", "Anna", "ESTM", 1));
		students.add(new Student("Evdokhin", "Endry", "ESTM", 1));
		students.add(new Student("Oborin", "Mikchael", "ESTM", 1));
		students.add(new Student("Iefymenko", "Andre", "ESTM", 1));
		students.add(new Student("Derkach", "Alisa", "ESTM", 1));
	
		Student st=new Student("Iefymenko", "Andre", "ESTM", 1);
		Student st1=new Student("Iefymenko", "Andre", "KN", 1);
		System.out.println("Does myHashSet contain ? " + students.contains(st));
		System.out.println("Does myHashSet contain ? " + students.contains(st1));
		
		students.remove(st);
		for(Student stud: students) {
			System.out.printf(stud.name+" "+stud.surname+"%n" );
			
			
		}
	}

	
}
