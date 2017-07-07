import java.util.*;

interface wihtDraw{
	void show(int amt);
	//void another();
}


//class check implements wihtDraw{
//	public void show(int amt) {
//		System.out.println("Withdrwa amount is "+amt);
//	}
//}
//This is replaced by anonumous class ---------1
public class C {
	public static void main(String args[]) {
		//check c= new check();
		//c.show(12); ------------------1
		
//		wihtDraw obj = new wihtDraw() {
//			@Override
//			public void show(int amt) {
//				System.out.println("The amount is "+amt);
//			}
//		};
//		obj.show(45);
		//This is replaced by Lambda Expression
		
		
		wihtDraw obj = (amt)->System.out.println("The amount is "+amt);
		
		obj.show(456);
	}

}
