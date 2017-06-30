
//Linkedlist
import java.util.*;
public class A {

	
	int age;
	String name;
	A(int a, String n){
	  	age = a;
	  	name= n;
	}
	
	public static void main(String args[]) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("Hello");
		l.add("hi");
		l.add("Bye");
		
		Iterator<String> i = l.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(11);
		li.add(12);
		li.add(13);
		li.add(14);
		
		Iterator ii = li.iterator();
		
		while(ii.hasNext())
			System.out.println(ii.next());
		
		for(Integer x: li)
			System.out.println(x);
		
		A a = new A(20, "Suresh");
		A a1 = new A(25, "Rameresh");
		A a2 = new A(230, "Durgesh");
		
		LinkedList<A> lo = new LinkedList();
		
		lo.add(a);
		lo.add(a1);
		lo.add(a2);
		
		for(A x : lo)
			System.out.println(x.age+" "+x.name);
		
	}
}

