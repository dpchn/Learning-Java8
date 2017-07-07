package lambda_prac_1;

interface i{
	int print();
}
class app{
	public void test(i io) {
		System.out.println("Executing block");
		int a = io.print();
		
		System.out.println("Returned value is "+a);
	}
}
public class B {

	public static void main(String args[]) {
		app a = new app();
		/*
		 * Anonymous class concept in older version of java
		 */
		a.test(new i() {
			public int print(){
				System.out.println("Hello");
				return 5;
			}
		});
		
		System.out.println("==========================");
		a.test(()->{
			System.out.println("Hello");
			return 8;
			});
	}
}
 	