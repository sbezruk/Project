package laba2;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Comparator;
public class Zadanie5_2 {

	public static void main(String[] args) {
		Comparator<Student> promp= new SortCompare().thenComparing(new NameComparator());
		TreeSet<Student> students=new TreeSet<Student>(promp);
			
			students.add(new Student("Bezruk", "Svetlana", "ESTM", 1));
			students.add(new Student("Biriukov", "Dmytro", "ESTM", 1));
			students.add(new Student("Volkov", "Mychailo", "ESTM", 1));
			students.add(new Student("Grechko", "Anna", "ESTM", 1));
			students.add(new Student("Evdokhin", "Endry", "ESTM", 1));
			students.add(new Student("Oborin", "Mikchael", "ESTM", 1));
			students.add(new Student("Iefymenko", "Andre", "ESTM", 1));
			students.add(new Student("Derkach", "Alisa", "ESTM", 1));

			 for(Student familia : students) {
					System.out.println(familia.getName()+" "+familia.getSurname());
				}

	}

}
