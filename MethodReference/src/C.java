import java.util.*;
public class C {

	void print(String str) {
		System.out.println(str);
	}
	
	static void printStatic(String str) {
		System.out.println(str);
	}
	
	C(){
		System.out.println("Hello");
		
	}
	
	
	public static void main(String[] args) {
		C c = new C();
		inter i = c::print;
		i.show("Instance reference");
		
		inter i2 = C::printStatic;
		i.show("Static reference");
		
		inter i3 = String::new;
		
		
	}
}


interface inter{
	void show(String str);
}