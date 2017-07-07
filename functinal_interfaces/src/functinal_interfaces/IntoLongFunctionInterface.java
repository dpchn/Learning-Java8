package functinal_interfaces;

import java.util.function.*;
public class IntoLongFunctionInterface {

	public static void main(String[] args) {
		IntToLongFunction inttolongfunction = x-> x;
		
		System.out.println(inttolongfunction.applyAsLong(-23));
	}
}
