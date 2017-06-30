import java.util.*;
public class TreeMap_class {

	public static void main(String args[]) {
		TreeMap<String, String> th = new TreeMap();
		
		th.put("One", "Hello");
		th.put("Two", "Hey");
		th.put("Three", "Hi");
		th.put("Four", "Bye");
		System.out.println(th);
		
		
		for(Map.Entry x: th.entrySet())
			System.out.println(x.getKey()+" "+x.getValue());
		System.out.println("Total Keys "+th.keySet());
		System.out.println("Total values "+th.values());
		
	}
}
