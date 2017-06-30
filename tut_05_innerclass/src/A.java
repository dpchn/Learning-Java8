
public class A {
	public void name() {
		System.out.println("class Outter class");	
	}
	
	public static void main(String args[]) {
	     A a = new A();
		a.display_Inner();	
		/*
		 * Another way to access inner class methods and variables
		 * By making object of class
		 */
		
		//Accessing members of class B 
		A.B b = a.new B();
		b.name();
		
		A.B.C c = b.new C();
		c.fun();
	}
	
    void display_Inner() {// one to access inner class in outer class
		      B inner = new B();
		      
		      inner.name();
		      System.out.print("Using function ");
		   }
    
	
	final class B{
		private int variableB=29;
		void name(){
			System.out.println("class B inside A");
		}
		
		class C{
			public void fun() {
				System.out.println("class CInside B");
				System.out.println("Innner class can acces variable og outer class "+variableB);
			}
		}
	}
	

}
