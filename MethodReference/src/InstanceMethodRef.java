import java.util.function.*;
import java.util.*;
public class InstanceMethodRef {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person(45,"Amrit"),
				new Person(25,"Mer"),
				new Person(40,"Prit"),
				new Person(456,"Kul"));
		
		/*
		 * Using Lambda Expression
		 */
		list.forEach(x->new InstanceMethodRef().print(x));
		
		/*
		 * Using Method Reference
		 */
		
		System.out.println("--------------------------------");
		
		list.forEach(new InstanceMethodRef()::print);
	}
	
	void print(Person p) {
		System.out.println(p.name+" "+p.age);
	}
}


class Person{
	Integer age;
	String name;
	Person(Integer age, String name){
		this.age = age;
		this.name = name;
	}
}