package tut_15_Stream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class B {
	public static void main(String[] args) {
		
		
		List<Emp> list = Arrays.asList(new Emp(45, "SDDSS"),
				new Emp(45, "Sded"),
				new Emp(45, "dedSS"),
				new Emp(21, "rSS"),
				new Emp(44, "SDfefDSS"),
				new Emp(25, "Sdf"));
		List<String> li = new ArrayList<>();
		for(Emp e : list)
			li.add(e.name);
		/*
		 * Above is traditional method Now using Stream Api
		 */
		
		List<String> l = list.stream().map(e->e.name).filter(i->i.startsWith("S")).
							collect(Collectors.toList());
		
		System.out.println(l);
		List<Integer> list1 = Arrays.asList(545,24,6,8,19,7,2,45,645,656,165,615,55);
		
		List<Integer> even = list1.stream().map(x->x).filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(even);
		
		/*
		 * Build Stream
		 */
		
		Stream.of("Hello ","Hey ","Bye ").forEach(System.out::println);
	}

}


class Emp{
	int age;
	String name;
	Emp(int age, String name){
		this.age = age;
		this.name = name;
		
	}
}
