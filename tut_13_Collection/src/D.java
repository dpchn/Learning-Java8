//List
import java.util.*;
public class D {
	public static void main(String args[]){
		D d =new D();
		D d1 =new D();
		List<String> l = new ArrayList<String>();
		l.add("Ashi");
		l.add("Ashi");
		l.add("Ashish");
		l.add("Abhishek");
		l.add(2, "Arushi");
		
		Iterator i =  l.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
		System.out.println(l.get(2));
		System.out.println(l.remove(1));
		System.out.println(d==d);
	}

}
