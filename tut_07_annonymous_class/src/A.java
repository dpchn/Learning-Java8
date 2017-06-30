
public class A {

	public static void main(String args[]) {
		
	      AnonymousInner inner = new AnonymousInner() {
	          public void mymethod() {
	             System.out.println("This is an example of anonymous inner class");
	          }
	       };
	}
}


 class AnonymousInner {
	   public  void mymethod(){
		   
	   }
	}