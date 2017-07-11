import java.util.ArrayList;
import java.util.function.*;
import java.util.stream.IntStream;

public class OutterCLass {

	public static void main(String[] args) {

		OutterCLass out = new OutterCLass();
		OutterCLass.A a = out.new A();
		System.out.println(a.IsPrime(51));
		
		/*
		 * Using Anonymous Class
		 */
		Anonymous anonymous = new Anonymous() {
			
			boolean IsPrime(int num) {
				if(num<2)
					return false;
				for(int i=2; i<num; i++)
					if(num%i==0)
						return false;
				return true;
			}
		};
		
		System.out.println(anonymous.IsPrime(53));
		
		/*
		 * Now using Lambda
		 */
		int n=89;
		System.out.println(IntStream.range(2, n-1).noneMatch(x ->n%x==0));
		
	}
	
	
	
	static boolean IsPrime(int n) {
	
		IntPredicate div = x ->n%x==0; 
		return IntStream.range(2, n-1).noneMatch(x ->n%x==0);
	}

	class A{
		boolean IsPrime(int num) {
			if(num<2)
				return false;
			for(int i=2; i<num; i++)
				if(num%i==0)
					return false;
			return true;
		}
	}
}


abstract class Anonymous {
	abstract boolean IsPrime(int n);
}