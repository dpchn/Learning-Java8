package functinal_interfaces;
import java.util.function.*;
public class IntUnaryOperatorInterface {

	public static void main(String[] args) {
		IntUnaryOperator intunaryopterator = x-> x++;
		System.out.println(intunaryopterator.applyAsInt(53));
	}
}
