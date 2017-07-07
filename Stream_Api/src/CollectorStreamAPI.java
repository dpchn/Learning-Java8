import java.util.stream.*;
import java.util.*;
import java.util.function.Predicate;
public class CollectorStreamAPI {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,45,78,63,1,4,85,1,58);
		
		int sum = list.stream().reduce(0, (x, y)->x+y);
		System.out.println(sum);
		
		List<String> strings = Arrays.asList("Hello "," Hi"," "," Bye","");
		
		String str = strings.stream().reduce("", (x,y)->x.concat(y));
		System.out.println(str);
		
/*		List<Student> students = Arrays.asList(new Student(112, "Hemi", "A"),
				new Student(102, "Anshul", "B"),
				new Student(100, "Sagar", "C"),
				new Student(132, "Geta", "B"),
				new Student(152, "Rita", "B"),
				new Student(112, "Sita", "C"),
				new Student(105, "Shahi", "A"),
				new Student(101, "Sai", "A"));
		
		List<Student> li = (List<Student>) students.stream().collect(Collectors.groupingBy(x->x.className));
		
		Iterator<Student> it = li.iterator();
		while(it.hasNext())
			System.out.println(it.next().id);*/
		
		
		System.out.println(strings.stream().filter(x->!x.isEmpty()).collect(Collectors.toList()));
	}

}

class Student{
	int id;
	String name, className;
	
	Student(int id, String name, String className){
		this.id = id;
		this.name = name;
		this.className = className;
	}
	
}
