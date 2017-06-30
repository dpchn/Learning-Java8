import java.util.*;
public class ComparableInterface_class  {

	public static void main(String args[]) {
		
		ArrayList<BB> al = new ArrayList();
		al.add(new BB(45, "Rajesh"));
		al.add(new BB(45, "Suresh"));
		al.add(new BB(15, "Ramesh"));
		al.add(new BB(8, "Sudhesh"));
		al.add(new BB(21, "Desh"));
		al.add(new BB(25, "Cesh"));
		al.add(new BB(5, "Mesh"));
		Collections.sort(al);
		BB b = new BB();
		b.test();
		for(BB x: al)
		System.out.println(x.age+"  "+x.name);
	
	}
	
	

}


class BB implements Comparable<BB>{
	int age;
	String name;
	
	BB(int age, String name){//Constructor
		this.age = age;
		this.name = name;
	}
	
	
	BB(){//Non parametrize Constructor
		
	}
	
	String str;
	BB(String s){//Constructor
		str = s;
	}
	
	
	
	public int compareTo(BB b) {
		if(age == b.age)
			return 0;
		else if(age>b.age)
			return 1;
		else
			return -1;
	}
	
	
	void test(){
		BB b1 = new BB();
		BB b2 = new BB();
		System.out.println(b1.compareTo(b2));

		
		BB b4 = new BB("Hi");
		System.out.println(b1.compareTo(b4));
		
		
		String a="Hello", b="Hi";
		System.out.println(a.compareTo(b));
	}
}
