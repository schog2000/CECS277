package CECS277Lab2;
import java.lang.System;

public class Person implements Measurable, Comparable {
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		firstName="the";
		lastName="person2";
		age = 0;
	}

	public Person(String firstName, String lastName, int age){
		   this.firstName = firstName;
		   this.lastName = lastName;
		   this.age = age;
	}

	public String getFirstName() { return firstName; }

	public String getLastName() { return lastName; }
	   
	public int getAge() {return age;}
	
	public int getMeasure() {
		return age;
	}
	public String toString()
	   {
	      return "Name: " + firstName + " " + lastName + " Age: " + age;
	   }
	
	public int compareTo(Object otherObject) {
		 Person other = (Person) otherObject;
		 if(getFirstName().charAt(0) < other.getFirstName().charAt(0)) {return -1;}
		 if(getFirstName().charAt(0) > other.getFirstName().charAt(0)) {return 1;}
		 return 0;
	}
	   
}
