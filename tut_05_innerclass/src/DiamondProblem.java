
public class DiamondProblem {

}


interface A{
	default void test() {
		System.out.println("Interface A");
	}
}


interface B extends A{
	default void test() {
		System.out.println("Interface A");
	}
}


interface C extends A{
	default void test() {
		System.out.println("Interface A");
	}
}


/*interface D extends C, B{
	default void t() {
		
	}
}*/


class Implel implements B, C{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		C.super.test();
	}
	
}