import java.util.function.*;
import java.util.*;

class Student{
	int age;
	String name;
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
}
public class IntUnaryOperatorInterface {

	public static void main(String[] args) {
		List<Student> stu = Arrays.asList(new Student(15, "Himanshu"),
				new Student(10, "Dhanush"),
				new Student(5, "Praveen"),
				new Student(25, "Chatanya"),
				new Student(6, "Rahul"),
				new Student(30, "Kridai"),
				new Student(10, "Ramesh"));
		
		
	}
}
