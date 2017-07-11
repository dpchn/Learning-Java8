package functinal_interfaces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;;
public class ConsumerInterface {

	
	
	
	public static void main(String[] args) {
		
	/*	List<student_detail> stuList = new ArrayList<>(Arrays.asList(
				new student_detail(10, "arun"),
				new student_detail(9, "durga"),
				new student_detail(8, "ashish"),
				new student_detail(11, "someone")
		));
		*/
		List<student_detail> stuList = new ArrayList<>();
		stuList.add(new student_detail(10, "arun"));
		stuList.add(new student_detail(9, "durga"));
		stuList.add(new student_detail(8, "ashish"));
		stuList.add(new student_detail(10, "arun"));
		stuList.add(new student_detail(10, "arun"));
		
		Consumer<List<student_detail>> nameFilter = (t) -> {
			Iterator<student_detail> iterator = t.iterator();
			while (iterator.hasNext()) {
				student_detail sd = iterator.next();
				if (!sd.name.startsWith("a")) {
					iterator.remove();
				}

			}
		};
		
		Consumer<List<student_detail>> ageFilter = (t) -> {
			Iterator<student_detail> iterator = t.iterator();
			while (iterator.hasNext()) {
				student_detail sd = iterator.next();
				if (sd.age > 10) {
					iterator.remove();
				}

			}
		};
		
		Consumer<List<student_detail>> printList = (t) -> {
			Iterator<student_detail> iterator = t.iterator();
			while (iterator.hasNext()) {
				student_detail sd = iterator.next();
				System.out.println(sd.name +" "+sd.age);

			}
		};
		
		nameFilter.andThen(ageFilter).andThen(printList).accept(stuList);
		
		//nameFilter.accept(stuList);
		
		
		/*Consumer<Integer> consumer =(a)-> System.out.println("VAlue is "+a);
		consumer.accept(45);
		
		Consumer<String> consumer1 =(a)-> System.out.println("VAlue is "+a.toUpperCase());
		consumer1.accept("hello");
		
		
		consumer.andThen(consumer).accept(42);
		
		
		 * Pass COnsumer as parameter
		 
		
		cal c= new cal();
		c.calculator(x->System.out.println(x), 45);
	
		
		
		List<student_detail> st = Arrays.asList(new student_detail(41, "Himanshu"),
				new student_detail(21, "Arpit"));
		
		
		acceptAll(st, x->System.out.println(x.name));
		
		acceptAll(st, x->System.out.println(x.age));
		
		acceptAll(st, x->System.out.println(x.name+" "+x.age));
		*/
		
		
		
	}
	
	static void acceptAll(List<student_detail> s, Consumer<student_detail> e) {
		for(student_detail x:s)
			e.accept(x);
		
	}
}



class cal{
	void calculator(Consumer<Integer> a, int b) {
		a.accept(b);
	}
}


class student_detail{
	int age;
	String name;
	student_detail(int age, String name){
		this.name = name;
		this.age = age;
	}
}