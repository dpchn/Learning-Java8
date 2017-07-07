package functinal_interfaces;

import java.util.function.*;
public class IntSuppplierInterface {

	public static void main(String[] args) {
		IntSupplier is = ()-> 0;
		System.out.println(is.getAsInt());
	}
}
