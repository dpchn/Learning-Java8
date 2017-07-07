import java.util.function.*;
import java.util.stream.*;
public class LambdaExpressionExample1 {

	public static void main(String[] args) {
	
		System.out.println(isOdd(44));
}
	
	
	static boolean isOdd(int a) {
		IntPredicate predicate = val->val%2==1;
		return predicate.test(a);
	}
}
