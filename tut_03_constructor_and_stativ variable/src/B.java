
public class B {

	public static void  main(String args[]) {
		C c = new C();
		D d = new D();				//If Class have private constructor 
		              //and no public constructor then
					//Then that class cann't be instantiate
	}
	
}

class C{
	C(){
		System.out.println("COnstrcutor of C");
	}
}

class D{
	private D(){
		System.out.println("Private Constructor");
	}
}
