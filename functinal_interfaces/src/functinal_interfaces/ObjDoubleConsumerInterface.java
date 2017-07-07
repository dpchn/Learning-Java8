package functinal_interfaces;

import java.util.function.*;
public class ObjDoubleConsumerInterface {

	public static void main(String[] args) {
		ObjDoubleConsumer<info> objectdouble = (obj, x)->{
			System.out.println(obj.a+" "+x);
		};
		
		objectdouble.accept(new info(), 25);
	}
}

class info{
	int a =10;
}
