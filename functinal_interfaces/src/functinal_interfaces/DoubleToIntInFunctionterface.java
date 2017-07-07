package functinal_interfaces;

import java.util.function.*;
public class DoubleToIntInFunctionterface {

	public static void main(String[] args) {
		DoubleToIntFunction dti = x-> (int)x;
		
		System.out.println(dti.applyAsInt(3.9));;
	}
}
https://polycom.wd1.myworkdayjobs.com/External/0/refreshFacet/318c8bb6f553100021d223d9780d30be