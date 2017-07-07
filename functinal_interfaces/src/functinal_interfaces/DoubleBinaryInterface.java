package functinal_interfaces;
import java.util.*;
import java.util.function.*;

public class DoubleBinaryInterface {

	public static void main(String[] args) {
		DoubleBinaryOperator s=(a, b)->a*b;
		
		System.out.println(s.applyAsDouble(12, 11));
		
		/*
		 * As a parameter
		 */
		
		List<calDoubleVal> cal = Arrays.asList(new calDoubleVal(12,15, "Aksah"),
				new calDoubleVal(20, 23, "Deepti")); 
		
		
		DoubleBinaryOperator db = (a, b)->(a+b)/2;
		
		show(cal, db);
	}
	
	static void show(List<calDoubleVal> s, DoubleBinaryOperator e) {
		for(calDoubleVal x: s)
			System.out.println("Name : "+x.name+" "+"Avg Marks : "+e.applyAsDouble(x.a, x.b));
	}
}


class calDoubleVal{
	int a;
	int b;
	String name;
	public calDoubleVal(int a,int b, String name) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.name = name;
		this.b = b;
	}
}
