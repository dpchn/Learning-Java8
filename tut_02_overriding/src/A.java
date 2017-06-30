
public class A {
	
	
	void fun1(){
		System.out.println("Hello");
	}
	
	void fun1( int a){
		System.out.println("Value of a "+a);
		
	}
	
	static void fun2(){
		System.out.println("Hi");
	}
	
	final void fun2(int a){
		
	}

}

class B extends A{
	void fun2(){ /* static method cannot be overridden
		           bcz only dynamic function can be override
		           static denote not change with time
		           */
		
	}
	
	void fun2(int a){
		
	}
}
