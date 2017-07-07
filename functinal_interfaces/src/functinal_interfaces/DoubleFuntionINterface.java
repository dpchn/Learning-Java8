package functinal_interfaces;
import java.util.function.*;

public class DoubleFuntionINterface {
	public static void main(String[] args) {
		DoubleFunction doublefunction = x->x;
		System.out.println(doublefunction.apply(45));
		
	}
}
