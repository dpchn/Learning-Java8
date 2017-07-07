import java.util.*;
import java.util.function.*;

public class StaticMethodReference {

	static boolean check(int a, int b) {
		return a+b > 50;
	}
	
	
	static List<Integer> findNUmber(List<Integer> l, BiPredicate<Integer, Integer> predicate){
		List<Integer> list = new ArrayList<Integer>();
		/*
		 * Using Predicate;
		 */
		for(Integer i : l)
			if(predicate.test(i, i+1))
				list.add(i);
		return list;
		
		/*for(Integer i : l)
			if(check(i, i+1))
				list.add(i);
		return list;*/
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
		System.out.println(findNUmber(list, (a, b)->StaticMethodReference.check(a, b)));
		
		System.out.println(findNUmber(list, StaticMethodReference::check));
	}
}
