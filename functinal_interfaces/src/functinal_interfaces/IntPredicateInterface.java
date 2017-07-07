package functinal_interfaces;
import java.util.function.*;
import java.util.*;
public class IntPredicateInterface {

	public static void main(String[] args) {
		IntPredicate ip = x -> x>0;
	
		System.out.println(ip.test(1));
		
		List<stu> li = Arrays.asList(new stu(41, 45,50,"Deepak"),
				new stu(12, 25,50,"Anup"), new stu(70, 4,80,"Janak"),
				new stu(80, 0,0,"abhi"));
		
		show(li, x-> x>90);
		
	}
	
	static void show(List<stu> l, IntPredicate e) {
		for(stu x: l) {
			System.out.print("Name :"+ x.name+" Total Marks:"+(x.chemistry+x.maths+x.chemistry));
			System.out.println("Pass : "+e.test(x.chemistry+x.maths+x.chemistry));
		}
	}
}


class stu{
	int physics, chemistry, maths;
	String name;
	
	public stu(int m, int p, int c, String name) {
		// TODO Auto-generated constructor stub
		this.physics = p;
		this.maths = m;
		this.chemistry = c;
		this.name = name;
	}
}
