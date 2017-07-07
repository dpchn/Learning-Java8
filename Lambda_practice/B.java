import java.util.*;


interface emp{
	void show();
}


class child implements emp{
	public void show() {
		System.out.println("Hello");
	}
}
public class B {
	
	public static void main(String args[]) {
		
		
		/*
		 * Call using inner class concept
		 */
		emp obj;
		obj = new emp() {
			public void show() {
				System.out.println("Using inner class");
			}
		};
		
		obj.show();
	
		obj = ()->{
			System.out.println("Using Lambda");
		};
		
		obj.show();
		
		List<Integer> list = Arrays.asList(4,34,6,78,8,34);
		
		list.forEach(i->System.out.println(i));
		
		
	}

}
