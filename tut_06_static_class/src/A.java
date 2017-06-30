
public class A {
	
	public static void  main(String args[]) {
		B b= new B();
		
		B.ClassInB c = new B.ClassInB();//
	}
	
	
	static class B{
		B(){ //Constructor of static class
			
		}
	}
	
	static class C{
//		static void funC(){
//			System.out.println("Static class C function");
//		}
		static class ClassInB{
			void funD(){
				System.out.println("Static class inner class function");
			}
		}
	}
	//////////A class can have many static block
	static{
		
	}
	/*
	 * .
	 * .
	 * .
	 * .
	 */
	static {//Static block
		System.out.println("Static Block");
		class AA{
			
		}
	}

}



