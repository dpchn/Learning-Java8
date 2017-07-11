
public class A {

	public static void main(String[] args) {
		
		/*
		 * Abstract Class Implemented
		 */
		AbstractClass abstractCLass  = new AbstractClass(){
			void fun() {
				System.out.println("Abstract Class");
			}
		};
		
		abstractCLass.fun();
		
		/*
		 * Interface Implementation using Anonymous class
		 */
		Interface1 i1 = new Interface1() {
			
		//	@Override
		/*	public void print() {
				System.out.println(sum(4,5));	
			}*/
			@Override
			public int sum(int a, int b) {		
				return a+b;
			}
		};
		
		
		/*
		 * Interface Within Interface
		 */
		Interface1.I1 i2 = new Interface1.I1() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Hello");
			}
		};
		
		i1.sum(4,6);
		i2.print();
		
		
		/*
		 * Above example implemented using lambda Expression
		 */
		Interface1 lambdaFunction = (a,b)->a+b;
		System.out.println(lambdaFunction.sum(34, 6));
		/*
		 * Functional Interface
		 */
		FunctionalInterface1 functionalInterface = (a,b)->a+b;
		System.out.println();
	}
	
	void fun() {
		System.out.println("Hello Method of main class");
	}
}




abstract class AbstractClass{
	abstract void fun();
}
interface Interface1{
	//void print();
	
	int sum(int a, int b);
	interface I1{
		void print();
	}
}

@FunctionalInterface
interface FunctionalInterface1{
	int sum(int a, int b);

}