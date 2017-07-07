package functinal_interfaces;

import java.util.function.*;
public class InBinaryOperationInterface {

	public static void main(String[] args) {
		IntBinaryOperator ib = (a, b)->a/2;
		
		System.out.println(ib.applyAsInt(45, 2));
	}
}
