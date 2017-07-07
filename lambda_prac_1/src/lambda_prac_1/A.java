package lambda_prac_1;
import java.util.*;

public class A {
	
	public static void main(String args[]) {
		
		Mathop add =(a,b)-> a+b;
		Mathop sub =(int a,int b)-> a-b;
		Mathop mul =(int a,int b)->{return a*b;};
		Mathop div =(a,b)->{return a/b;};
		
		System.out.println(add.operation(45, 3));
		System.out.println(sub.operation(45, 3));
		System.out.println(mul.operation(45, 3));
		System.out.println(div.operation(45, 3));
		
	}

	
	
	
	interface Mathop{
		int operation(int a, int b);
	}
	
	
	int operate(int a, int b, Mathop o) {
		return o.operation(a, b);
	}
}



