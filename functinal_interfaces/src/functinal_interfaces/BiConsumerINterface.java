package functinal_interfaces;

import java.util.ArrayList;
import java.util.List;
//import java.util.*;
import java.util.function.BiConsumer;


class emplpyee{
	Integer age;
	String name;
	public emplpyee(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
}



public class BiConsumerINterface {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> biconsumer = new BiConsumer<Integer, Integer>() {
			@Override
			public void accept(Integer t, Integer u) {
				// TODO Auto-generated method stub
				System.out.println(" t > u :" + (t > u));
			}
		};
		biconsumer.accept(45, 62);

		/*
		 * Above code is replaced by this....
		 * 
		 */

		BiConsumer<Integer, Integer> add = (a, b) -> System.out.println("Sum of two no is " + (a + b));
		BiConsumer<Integer, Integer> sub = (a, b) -> System.out.println("Subtraction of two no is " + (a - b));
		BiConsumer<Integer, Integer> mul = (a, b) -> System.out.println("Multiplication of two no is " + a * b);
		BiConsumer<Integer, Integer> div = (a, b) -> System.out.println("Division of two no is " + a / b);

		/*
		 * Now using methods of BinConsumer Interface
		 */

		add.andThen(sub).andThen(mul).andThen(div).accept(12, 4);
		
		/*
		 * ---------------------------------------------------
		 */
		System.out.println("----------------------------------------");

/*		List<emplpyee> li = new ArrayList();
		li.add(new emplpyee(12, "Deepak"));
		li.add(new emplpyee(20, "Sohan"));
		li.add(new emplpyee(10, "Deepika"));
		li.add(new emplpyee(15, "Ashish"));
		
		BiConsumer<emplpyee, emplpyee> emp = (e1, e2)->{
			e1.age.compareTo(e2.age);
		};
		
		emp.accept(li, li);*/

	}
}
