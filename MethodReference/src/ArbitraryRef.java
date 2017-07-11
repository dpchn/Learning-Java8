import java.util.*;
import java.util.function.*;

public class ArbitraryRef {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(54,656323,0,45,87,1874,178);
		
		/*
		 * Using Anonymous Class
		 */
		list.sort(new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			return i1.compareTo(i2);
		}	
		});
		
		/*
		 * USing Lambda
		 */
		
		list.sort((Integer i1, Integer i2)->i1.compareTo(i2));
		
		/*
		 * Using Arbitrary Object
		 */
		
		list.sort(Integer::compareTo);
		
		list.forEach(System.out::println);
	}
}
