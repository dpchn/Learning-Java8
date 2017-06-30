//LinkedHashSet

import java.util.*;
public class C {

	int age;
	String name;
	C(int age, String name){
		this.age = age;
		this.name = name;
	}
	public static void main(String args[]) {
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("Hello");
		lhs.add("Deppak");
		lhs.add("Deppak");
		lhs.add("Bye");
		lhs.add("Ashu");
		
		for(String x: lhs)
			System.out.println(x);
		
		C c1 = new C(22, "Ashu");
		C c2 = new C(34, "Chnadra");
		C c3 = new C(34, "Chnadra");
		C c4 = new C(22, "Ashu");

		C c5 = new C(35, "Zu");
		
		LinkedList<C> lc = new LinkedList();
		lc.add(c1);
		lc.add(c2);
		lc.add(c2);
		lc.add(c3);
		lc.add(c4);
		lc.add(c5);
		for(C x: lc)
			System.out.println(x.age+" "+x.name);
	}
}
