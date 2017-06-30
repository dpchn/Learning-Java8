
public class ThisUse {
	int a;
	String name;
	
//	ThisUse(String name){
//		name = name;
//	}
	
	ThisUse(String s){
		name = s;
	}
	void test(){
		System.out.println(this.a);
		
	}
	
	void foo(){
		System.out.println("My name is "+name );
	}
	
	public static void main(String args[]) {
		
		ThisUse t  = new ThisUse("Durga");
		t.foo();
	}
}



