package functinal_interfaces;
import java.util.function.*;

public class DoublePredicateINterface {
	public static void main(String[] args) {
		DoublePredicate doublepredicate = (x) -> x>0 ;
		DoublePredicate dp1 = (x) -> x%2==0 ;
		DoublePredicate dp2= (x) -> x<0 ;
		
		System.out.println(doublepredicate.test(15));
		
		System.out.println(dp1.and(dp2).test(13));
		
		System.out.println(dp1.or(doublepredicate).test(56));
		
		System.out.println(doublepredicate.negate().test(0));
	}
}
