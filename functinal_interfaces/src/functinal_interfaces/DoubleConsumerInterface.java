package functinal_interfaces;
import java.util.function.*;
import java.util.*;
public class DoubleConsumerInterface {

	public static void main(String[] args) {
		DoubleConsumer doubleconsumer = (a)->System.out.println(a);
		DoubleConsumer doubleconsumer1 = (a)->System.out.println(a);
		DoubleConsumer doubleconsumer2 = (a)->System.out.println(a);
		doubleconsumer.accept(21);
		doubleconsumer.accept(4.6);
		
		doubleconsumer.andThen(doubleconsumer1).andThen(doubleconsumer2).accept(53);
		
		/*
		 * DoubleConsumer as Parameter
		 */
		
		List<Integer> li = Arrays.asList(12, 45,10,23,5);
		show(li, e->System.out.println(e));
	}
	
	static void show(List<Integer> l, DoubleConsumer e) {
		for(Integer i :l) {
			System.out.print("Original Number : "+i+" "+"Number as double :");
			e.accept(i);
		}
	}
}
