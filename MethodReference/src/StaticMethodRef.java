import java.util.Arrays;
import java.util.List;
import java.util.function.*;
public class StaticMethodRef {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person(45,"Amrit"),
				new Person(25,"Mer"),
				new Person(40,"Prit"),
				new Person(456,"Kul"));
		
		/*
		 * Using Lambda Expression
		 */
		list.forEach(x->StaticMethodRef.print(x));
		
		
		/*
		 * Using Method Reference
		 */
		
		list.forEach(StaticMethodRef::print);
		
	}
	
	static void print(Person p) {
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
