
public class A extends D{
	
	A(){
		super();// to invoke constructor of parent class
	}
	
	int a =10;
	public static void main(String args[]) {
		
		A a = new A();
		a.test();
		
	}
	void test(){
		System.out.println(super.color);// to call method or variable of parent class
		super.foo();//to call method of parent class 
	}
}


class B{
	void foo(){
		System.out.println("Class B");
	}
}


class C extends B{
	void foo(){
		System.out.println("Class C");
	}
}



class D extends C{
	String color = "Red";
	void foo(){
		System.out.println("Class D");
	}
	
}