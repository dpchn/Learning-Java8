
import java.util.function.*;
import java.util.*;
public class A {

	public String instanceName;
	
	A(String instanceName)
	{
		System.out.println("Creating instance "+instanceName);
		this.instanceName = instanceName;
	}
	
	public void print(String something)
	{
		System.out.println("testing instance methnd call "+instanceName+"  "+something);
	}
	
	public static void printStatic(String something)
	{
		System.out.println("testing instance methnd call "+something);
	}
	
	public void printInstance(String something)
	{
		System.out.println("testing instance methnd call "+something);
	}
	
	public static void main(String[] args) {
		/*Consumer<String> printer = x-> System.out.println(x);
		Consumer<String> printString =  System.out::println;
		
		
		printer.accept("Hello");
		printString.accept(" World!");
		
		
		iterfaceTest i = new iterfaceTest() {
			
			@Override
			public void show(String str) {
				// TODO Auto-generated method stub
				System.out.println(str);
			}
		};
		i.show(" Hey");*/
	
		/*
		 * Above Code is written in  below line
		 */
		
		
		A a1 = new A("instance 1");
		
		A a2 = new A("instance 2");
		
		// call to method of an instance
		//iterfaceTest i3 = x -> { a1.print(x) };
		iterfaceTest i1 = a1::print;
		i1.show("i1 show method ");
		
		//iterfaceTest i3 = x -> { a1.print(x); };
		iterfaceTest i2 = a2::print;
		i2.show("i2 show method ");
		
		
		// call to a static method
		//iterfaceTest i3 = x -> { A.printStatic(x); };
		iterfaceTest i3 = A::printStatic;
		i3.show("i3 show method");
		
		
		// call to constructor
		//iterfaceTest i3 = x -> { new A(x); };
		
		iterfaceTest i4 = A::new; 
		i4.show("i4 show method");
		
		//iterfaceTest i3 = x -> { x.toUpperCase() };
		iterfaceTest i5 = String::toUpperCase; 
		i5.show("i4 show method");
		
		
		
		
		
		
		
		//i1.show(" World");
	}
}


interface iterfaceTest{
	void show(String str);
}