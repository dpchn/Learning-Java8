import java.util.*;
public class HashTable_class {

	public static void main(String args[]) {
		Hashtable<String, Integer> ht = new Hashtable();
		
		ht.put("One", 1);
		//ht.put("One", 1);
		ht.put("Two", 2);
		//ht.put("Two", 1);
		ht.put("Three", 3);
	//	ht.put("One", 4);
		//ht.put("NULL", null); null is not allowed
		
		for(Map.Entry x : ht.entrySet())
			System.out.println(x);
		
	}
}
