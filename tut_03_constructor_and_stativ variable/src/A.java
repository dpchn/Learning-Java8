
public class A {
	static int n =10;
	final int b = 11;
	
	A(){
		System.out.println("First Constructor");
	}
	
	A(String name){
		
		System.out.println("Student name "+name);
	}
   
	
	private A(int a, int b){
		System.out.println("Constructor with private modifier");
	}
	 void fun(int a){
		 final int m = 10;
	//	  static int m = 22; static variable cannot be declared
		 //bcz it is class level and jvm do not allow to keep multiple
		 //copy of variable which is being used by other mehtodss
		System.out.println();
	}
	
	
	///////////////////////////////////////////////////
	public static void  main(String args[]) {
		System.out.println("I am Durga");
		A a = new A();
		new A("Suresh");
		new A("Kavita");
		new A(1,2);
		a.n =0;
		
		System.out.println("Value of n "+n);	
	}
	
	void test(){
		n=10;
		A a= new A();
		a.n=0; 
	}
}
