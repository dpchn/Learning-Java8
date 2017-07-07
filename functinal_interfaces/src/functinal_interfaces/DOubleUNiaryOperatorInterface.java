package functinal_interfaces;
import java.util.function.*;
public class DOubleUNiaryOperatorInterface {

	public static void main(String[] args) {
		DoubleUnaryOperator sum = x -> x+2;
		DoubleUnaryOperator sub = x -> x-2;
		DoubleUnaryOperator mul = x -> x*2;
		DoubleUnaryOperator div = x -> x/2;
		
		System.out.println(sum.applyAsDouble(42));
		System.out.println(sub.applyAsDouble(42));
		System.out.println(mul.applyAsDouble(42));
		System.out.println(div.applyAsDouble(42));
		
		System.out.println("---------------andThen---------");
		System.out.println(sum.andThen(sub).andThen(mul).andThen(div).applyAsDouble(45));
		
		System.out.println("---------------compose-----------");
		System.out.println(sum.compose(div).compose(sub).applyAsDouble(6));
		
		DoubleUnaryOperator dub = DoubleUnaryOperator.identity();
		
		System.out.println(dub.applyAsDouble(452));
		
	}
}
