//hashSet
import java.util.*;
public class B {

	public static void main(String args[]) {
		HashSet<String> hs = new HashSet();
		hs.add("Hello");
		hs.add("Hello");
		hs.add("Hi");
		hs.add("Bye");
		hs.add("Deepak");
		
		for(String x: hs)
			System.out.println(x);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(11);
		hs1.add(12);
		hs1.add(11);
		hs1.add(13);
		hs1.add(20);
		hs1.add(1);
		
		Iterator it = hs1.iterator();
		System.out.println("Length of hs1 = "+ hs1.size());
		while(it.hasNext())
			System.out.println(it.next());
		
		HashSet h = (HashSet) hs1.clone();
		System.out.println(h.isEmpty());
		System.out.println(h.contains(12));
	}
	
}
