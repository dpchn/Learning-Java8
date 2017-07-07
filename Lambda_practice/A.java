import java.util.*;


@FunctionalInterface
interface employee{
	void show();  
}

class staff{
	Integer age;
	String name;
	
	staff(int age, String name){
		this.age = age;
		this.name = name;
		}
}



public class A {
	
	
	int compareByAge(staff s1, staff s2) {
		return s1.age.compareTo(s2.age);
	}
public static void main(String args[]) {
	List<staff> list = new ArrayList<>();
	
	list.add(new staff(12, "Ridhi"));
	list.add(new staff(10, "Sidhi"));
	list.add(new staff(5, "Didhi"));
	list.add(new staff(25, "Gidhi"));
	
	
	
	
	
	Collections.sort(list, (e1,e2)->e1.age.compareTo(e2.age));
	
	for(staff s : list)
		System.out.println(s.name+"  "+s.age);

	
}
}


