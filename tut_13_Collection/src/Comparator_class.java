import java.util.*;
public class Comparator_class {

	public static void main(String args[]) {
		Student s1 = new Student(11,"Dp");
		Student s2 = new Student(10,"Deepak");
		Student s3 = new Student(15,"Dinesh");
		Student s4 = new Student(3,"Dp");
		Student s5 = new Student(144,"Devendra");
		
		ArrayList<Student> al = new ArrayList();
		al.add(s1);
		al.add(s3);
		al.add(s2);
		al.add(s4);
		al.add(s5);
		
		System.out.println("Sorting by Age");
		Collections.sort(al, new AgeComprator());
		for(Student x: al)
			System.out.println(x.age+"  "+x.name);
		
		
		System.out.println("Sorting by Name....");
		Collections.sort(al, new NameComprator());
		Iterator it  = al.iterator();
		
		while(it.hasNext()){
		Student sd = (Student)it.next();
			System.out.println(sd.age+"  "+sd.name);
		}
		
	}
}


class Student {
	
	int age;
	String name;
	
	Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	
}

////////////////////AgeComparator
class AgeComprator implements Comparator{
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
			
			if(s1.age==s2.age)
				return 0;
			else if(s1.age>s2.age)
				return 1;
			return -1;		
	}
}


//////////////////////

class NameComprator implements Comparator{
	public int compare(Object o1, Object o2){
		
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
			
			return s1.name.compareTo(s2.name);		
	}
}
