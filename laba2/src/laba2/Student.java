package laba2;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	

public String name;
public String surname;
public String group;
public int numberBrigada;

public Student(String name, String surname, String group, int numberBrigada) {
	
	this.name = name;
	this.surname = surname;
	this.group = group;
	this.numberBrigada = numberBrigada;
}

public void Student(String name, String surname, String group, int numberBrigada) {
	
	this.name = name;
	this.surname = surname;
	this.group = group;
	this.numberBrigada = numberBrigada;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
public int getNumberBrigada() {
	return numberBrigada;
}
public void setNumberBrigada(int numberBrigada) {
	this.numberBrigada = numberBrigada;
}

@Override
public boolean equals(Object obj) {
	if(obj==this) {
		return true;
	}
	if(obj==null || obj.getClass()!= this.getClass()) {
		return false;
		
	}
	
	Student guest=(Student)obj;
	return numberBrigada==guest.numberBrigada
			&& (name==guest.name 
			|| (name != null && name.equals(guest.getName())) 
			&& ( surname ==guest.surname 
			|| (surname != null && surname.equals(guest.getSurname()))) 
			&& (group==guest.group || (group!=null &&group.equals(guest.getGroup()))));
	
	
}

@Override
public int hashCode() {
	final int prime=31;
	int result =1;
	result=prime*result+((name==null)? 0 : name.hashCode());
	result=prime*result+numberBrigada;
	result=prime*result+((surname==null)? 0 : surname.hashCode());
	result=prime*result+((group==null)? 0 : group.hashCode());
	return result;
}
public int compareTo(Student that) {
	int result =1;
	result= name.compareTo(that.getName());
	/*result= surname.compareTo(that.getSurname());
	result=group.compareTo(that.getGroup());
	if (this.numberBrigada<that.getNumberBrigada())
		result=-1;
	else
		if (this.numberBrigada>that.getNumberBrigada())
			result=1;
		else
			result=0;*/
	return result;
}



}
