
public class A implements i1,i2 {
	public void foo(){
		
	}

	public void fun2() {
		// TODO Auto-generated method stub
		
	}

	public void fun1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void  main(String args[]) {
		System.out.println("Hello");
		A a = new A();
		a.fun2();
	}
}


interface i1{
	void foo();
	void fun1();
}

interface i2{
	void foo();
	void fun2();
}