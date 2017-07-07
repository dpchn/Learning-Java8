package functinal_interfaces;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class A{
	int a =10;
}

class B{
	int b = 39;
}


class calculator{
	public int cal(BiFunction<Integer, Integer, Integer> bi, Integer i1, Integer i2) {
		return bi.apply(i1,  i2);
	}
}



public class BiFunctionINterface {

	public static void main(String[] args) {
		BiFunction<String, String, String> bifunction = (s1, s2)-> (s1+s2);
		
		/*
		 * apply() method
		 */
		System.out.println(bifunction.apply("Hello ", "EVeryone"));
		
		BiFunction<A, B, Boolean> bifunction1 = (o1, o2)-> o1.a>o2.b;
		//Passing Objects
		System.out.println("Object Meber comparison "+ bifunction1.apply(new A(), new B()));
		
		
		List<Integer> li = Arrays.asList(12,35,45,65,22,1) ;
	//	BiFunction<Integer, Integer, IntBuffer> bifunction2 = (l1, l2)->l1.su;
		
		
		/*
		 * Use BiFunction as Parameter
		 */
		
		calculator cl = new calculator();
		System.out.println("Result is "+cl.cal((a, b)->a*b, 12, 10));
		
		/*
		 * andThen method
		 */
		
		
		BiFunction<String, String, String> bi = (x, y)-> x+y;
		Function<String, String> bi1 = (x)-> x+" new ";
		
		System.out.println(bi.andThen(bi1).apply("Hello", " Guest"));
		
		
	}
}
