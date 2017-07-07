
import java.util.function.*;
import java.util.*;
public class A {

	public static void main(String[] args) {
		Consumer<String> printer = x-> System.out.println(x);
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
		i.show(" Hey");
	
		/*
		 * Above Code is written in  below line
		 */
		iterfaceTest i1 = System.out::println;
		i1.show(" World");
	}
}


interface iterfaceTest{
	void show(String str);
}