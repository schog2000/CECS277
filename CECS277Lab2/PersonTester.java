package CECS277Lab2;
import java.util.Arrays;

public class PersonTester {
	public static void main(String[] args) {
		Measurable[] person = new Measurable[3];
	    person[0] = new Person("Ricky", "Bobby", 34);
	    person[1] = new Person("Lebron", "James", 50);
	    person[2] = new Person("Michael", "Jackson", 10);
	    Arrays.sort(person);
	    for(int i = 0;i<person.length;i++) {
	    	System.out.println(person[i]);
	    }
	}
}
