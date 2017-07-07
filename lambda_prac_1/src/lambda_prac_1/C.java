package lambda_prac_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


class emp{
	Integer age;
	String name;
	
	emp(int age, String name){
		this.age = age;
		this.name = name;
	}
}


public class C {
	
	public static int compareByAge(emp e1, emp e2) {
		return e1.age.compareTo(e2.age);
	}

	public static void main() {
		List<emp> list = new ArrayList<emp>();
		list.add(new emp(12, "Nidhi"));
		list.add(new emp(15, "Ridhi"));
		list.add(new emp(25, "Sidhi"));
		list.add(new emp(5, "Tidhi"));
		list.add(new emp(56, "Didhi"));
		
		Collections.sort(list,(e1, e2)->e1.age.compareTo(e2.age));
		
		for(emp x: list)
			System.out.println(x.name+"  "+x.age);
		
		System.out.println("=======================");
		
		
//		Collections.sort(list, C::compareByAge);
//		for(emp x: list)
//			System.out.println(x.name+"  "+x.age);
//		
	}
}
