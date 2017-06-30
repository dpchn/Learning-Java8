import java.util.*;
public class TreeSet_class {

	public static void main(String args[]) {
		TreeSet<String> ts = new TreeSet();
		
		ts.add("Shiva");
		ts.add("Shiva");
		ts.add("Shivani");
		ts.add("Shivalik");
		ts.add("Shivak");
		
		Iterator<String> it = ts.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		System.out.println(ts.size());
		System.out.println(ts.last());
		System.out.println(ts.first());
	}
}
