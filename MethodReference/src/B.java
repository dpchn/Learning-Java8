import java.util.*;
import java.util.function.*;
public class B {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45,12,45,64,7,2,56,3,4,65,3,97,5);
		list.parallelStream().forEach(System.out::println);
		
		
	}
}
