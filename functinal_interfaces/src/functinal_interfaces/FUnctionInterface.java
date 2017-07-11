package functinal_interfaces;
import java.util.function.*;
import java.util.*;
public class FUnctionInterface {

	public static void main(String[] args) {
		Function<Integer, Integer> fun = x -> x*x;
		Function<String,Integer> fun1 = x-> x.length();
		
		System.out.println(fun.apply(5));
		System.out.println(fun1.apply("Hello how are you"));
		
		/*
		 * compose()
		 */
		System.out.println(fun.compose(fun1).apply("Hello"));
		
		/*
		 * andThen()
		 */
		System.out.println(fun.andThen(fun).apply(2));
		
		
		/*
		 * identity()
		 */
		Function<String, String> fun2 = Function.identity();
		
		System.out.println(fun2.apply("Hello how are you"));
		
		
		
		
		
		
		List<check> li = Arrays.asList(new check("Divaya"),
				new check("Arun"));
		
	//	Function<check, String> fun2 = x -> x.name.toLowerCase();
		show(li, x -> x.name.toLowerCase());
		
		
		
	}
	
	static void show(List<check> li, Function<check, String> e) {
		for(check x:li)
			System.out.println("Before :"+x.name+"  After "+e.apply(x));
	}
	static void show1(List<check> li, Function<check, String> e) {
		for(check x:li)
			System.out.println("Before :"+x.name+"  After "+e.apply(x));
	}
}


class check{
	String name;
	check(String name){
		this.name = name;
	}
}
