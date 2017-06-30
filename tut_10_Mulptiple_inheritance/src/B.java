
public class B extends C, D{
	  public void  fun1() {
		
	}
	  
	  public void fun3() {
			
		}
}


abstract class C{
	abstract void fun1();
}

abstract class D{
	//abstract void fun2();
	void fun3(){
		System.out.println("Hello");
	}
}