
public class A extends B{

	
	A(){
		
		super("Durga");
		
		
	}
	public static void  main(String args[]) {
		A b= new A();
		//A a= new A("Durga");
		b.fun();
	
	}
	
	void test(){
		
	}
}


abstract class B {
	void fun(){
		A a = new A();
	}
	
	B(){
		
		System.out.println("Hello");
	}
	
	
	
	
	B(String s){
		System.out.println(s);
	}
	
	abstract void test();
}
