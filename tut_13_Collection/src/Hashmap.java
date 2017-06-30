import java.util.*;
public class Hashmap {

	public static void main(String args[]) {
		HashMap<Integer, String> hm = new HashMap();
		
		hm.put(11, "Hey");
		hm.put(22, "Hi");
		hm.put(11, "Bye");
		hm.put(33, "Bye");
		hm.put(11, "Hey");
		hm.put(44,null);
		hm.put(45,null);
		
		
		for(Map.Entry s : hm.entrySet()){
			System.out.println(s);
			System.out.println(s.getKey()+" "+s.getValue());
		}
		System.out.println(hm);
	}
}
