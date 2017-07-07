package functinal_interfaces;
import java.util.function.*;
public class BooleanSupplierInterface {
		public static void main(String[] args) {
			BooleanSupplier bs = ()-> true;
			
			System.out.println(bs.getAsBoolean());
			
			
		}
}
