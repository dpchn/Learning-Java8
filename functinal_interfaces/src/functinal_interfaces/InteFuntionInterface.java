package functinal_interfaces;

import java.util.function.*;
public class InteFuntionInterface {

	public static void main(String[] args) {
		IntFunction ifun = x -> x>3;
		IntFunction ifun1 = x -> x/3d;
		IntFunction ifun2 = x -> x+3;
		
		
		System.out.println(ifun.apply(2));
		System.out.println(ifun1.apply(4));
		System.out.println(ifun2.apply(4));
	}
}
