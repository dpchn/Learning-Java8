import java.util.stream.BaseStream;
import java.util.*;
public class BaseStreamClass {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "hi", "", "Bye", "Hey", "","h","DF","SD","ds");
		Iterator<String> iterator = list.iterator();
		list.stream().filter(x->x.isEmpty());
		System.out.println(list.stream().filter(x->x.isEmpty()).count());
		System.out.println(list.stream().isParallel());
		System.out.println(list.parallelStream().isParallel());
	
		System.out.println(list.stream().unordered());
		
		Iterator<String> i = list.stream().unordered().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
