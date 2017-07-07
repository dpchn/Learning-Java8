package functinal_interfaces;
import java.util.function.*;
public class DoubleToLongFunctionInterface {

	public static void main(String[] args) {
		DoubleToLongFunction dtl= x -> (long)x;
		
		System.out.println(dtl.applyAsLong(456123.4));
	}
}
