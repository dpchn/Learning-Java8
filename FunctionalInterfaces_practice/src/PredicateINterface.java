import java.util.function.*;
import java.util.*;
public class PredicateINterface {

	public static void main(String[] args) {
		Predicate<Person> ageComparator = (x)-> x.age > 10;
		Predicate<Person> nameComparator = x -> x.name.startsWith("A");
		
		List<Person> persons= Arrays.asList(new Person(15, "Arti"),
				new Person(5, "Arti"),
				new Person(25, "Deepti"),
				new Person(9, "Mehak"),
				new Person(16, "Asu"),
				new Person(20, "aShsis"));
		
		Consumer<List<Person>> consumer = x -> System.out.println(x);
		
		
		List<Person> agelist = Check(persons, ageComparator);
		List<Person> namelist = Check(persons, nameComparator);
		
		//consumer.accept(namelist);
		System.out.println(namelist);
	
	}
	
	
	static List<Person> Check(List<Person> person, Predicate<Person> pre){
		
		List<Person>  result = new ArrayList();
		for(Person p : person) {
			if(pre.test(p))
				result.add(p);
		}
		
		return result;
	}
			
	
}

class Person{
	int age ;
	String name;
	/*int getMarks(){
		return age;
	}*/
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
}
