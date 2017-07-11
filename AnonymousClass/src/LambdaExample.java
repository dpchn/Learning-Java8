import java.util.function.*;
import java.util.stream.*;
public class LambdaExample {

	public static void main(String[] args) {
		/*
		 * Example of Calculate Prime No. using Traditional Method
		 */
		
		int n = 5;
		
		System.out.println(n+" Is prime : "+isPrime(n));
		
		
		/*
		 * Now solve same problem using Lambda Expression
		 */
		//Consumer<Integer> consumer = x->System.out.println(x++);
		
		int a =17;
		//consumer.accept(a);
		
		System.out.println(a+" Is prime : "+isPrimeLambda(a));
		
		
	}
	
	
	
	static boolean isPrimeLambda(int number){
		 IntPredicate isDivisible = index -> number % index == 0;
		return  IntStream.range(2, number - 1).noneMatch(isDivisible);
	}
	
	
	
	static boolean isPrime(int number) {
		if(number <2 )
			return false;
		
		for(int i=2; i<number; i++)
			if(number%i==0)
				return false;
		return true;
	}
}
