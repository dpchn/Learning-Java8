package functinal_interfaces;
import java.util.function.*;
import java.math.*;
public class IntConsumerInterface {

	class mynumber
	{
		int number;
	}
	
	public static void main(String[] args) {
		
		
		
		IntConsumer intcounsumer = x-> System.out.println("Square :"+x*x);
		IntConsumer intcounsumer1 = x-> System.out.println("Cube :"+x*x*x);
		IntConsumer intcounsumer2= x-> System.out.println("Square Root :"+x*x/2);
		IntConsumer intcounsumer3 = x-> System.out.println("Mod :"+x%2);
		
		
		intcounsumer.andThen(intcounsumer1).andThen(intcounsumer2).andThen(intcounsumer3).accept(6);
	}
}
