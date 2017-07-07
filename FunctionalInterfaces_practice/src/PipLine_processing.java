import java.util.function.*;
public class PipLine_processing {

	public static void main(String[] args) {
		Function varA = x-> Function.identity();
		Function varB = x->Function.identity();
		Function varC = x->Function.identity();
		
		
		BiFunction<Integer, Integer, Integer> adder = (x, y) ->x+y;
		BiFunction<Integer, Integer, Integer> multiplier = (x, y) ->x*y;
		
		Consumer<Integer> printer  = x->System.out.println("Value is : "+x);
		
//		UnaryOperator  
		
		multiplier.apply(40, 45);
	}
}
