package functinal_interfaces;

import java.util.function.*;
public class IntToDoubleInterface {

	public static void main(String[] args) {
		IntToDoubleFunction itdf = x-> x;
		
		System.out.println(itdf.applyAsDouble(46));
	}
}
