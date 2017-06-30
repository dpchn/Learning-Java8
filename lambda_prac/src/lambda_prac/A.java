package lambda_prac;

public class A {
	public static void main(String args[]) {
		A a1 = new A();
		
		//Without type without body
		MathOp add  = (a, b)-> a+b;
		//With data types use return and body
		MathOp sub = (int a, int b)->{ return a-b; };
		//With data type without body 
		MathOp mul = (int a, int b)-> a*b;
		//With type without body
		MathOp div = (int a, int b)->  a/b; 
	
		System.out.println(a1.operate(6, 2, add));
		System.out.println(a1.operate(6, 2, sub));
		System.out.println(a1.operate(6, 2, mul));
		System.out.println(a1.operate(6, 2, div));
	}
	
	
	interface MathOp{
		public int operation(int a, int b);
	}
	
	public int operate( int a, int b, MathOp op){
		return op.operation(a, b);
	}
}
