package functinal_interfaces;
import java.util.function.*;
public class BipredicateINterface {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p1 = (a,b) -> a>b;
		BiPredicate<Integer, Integer> p2 = (a,b)-> a==b;
		BiPredicate<Integer, Integer> p3 = (a,b)-> a!=b;
		
		/*
		 * and()
		 */
		System.out.println(p1.test(14, 2));
		System.out.println(p1.and(p2).test(14, 2));
		System.out.println(p1.and(p2).test(5, 5));
		
		/*
		 * or()
		 */
		System.out.println(p1.or(p2).test(5, 5));
		System.out.println(p1.and(p3).test(5, 5));
		
		/*
		 * negate()
		 */
		System.out.println(p1.negate().test(5, 5));
		System.out.println(p2.negate().test(5, 5));
		System.out.println(p3.negate().test(5, 5));
	}
}
