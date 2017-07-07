package functinal_interfaces;
import java.util.function.*;
public class DoubleSUpplierInterface {
	public static void main(String[] args) {
		DoubleSupplier ds =  ()-> 2;
		
		System.out.println(ds.getAsDouble());
	}
}
