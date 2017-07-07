

public class OuterClass1 {

	int outerVar=10;
	private int outerVar1 = 90;
	
	public static void main(String[] args) {
		OuterClass1 outer  = new OuterClass1();
		InnerClass1 inner1 = outer.new InnerClass1();
		InnerClass1.InnerClass2 inner2 = inner1.new InnerClass2();
		
		
		outer.outerVar = 10;
		inner1.fun();
		inner2.fun();
		OuterClass1.StaticClass str = new StaticClass();
		str.fun();
	}
	
	
	static class StaticClass{
		void fun() {
			System.out.println("Inside Static Class");
		}
	}

	
	class InnerClass1{
		
		
		int innerVar1 = 45;
		void fun() {
			System.out.println("InnerClass1");
			System.out.println(outerVar);
			
		}
		
		class InnerClass2{
			void fun() {
				System.out.println("Inside innerClass1");
				System.out.println(innerVar1);
			}
		}
	}


	
	
}