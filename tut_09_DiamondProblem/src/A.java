interface A {

	default void test() {
		System.out.println("In interface A");
	}
}

interface B extends A {
	default void test() {
		System.out.println("In interface B");
	}
}

interface C extends A {
	default void test() {
		System.out.println("In interface B");
	}
}

class D implements B, C {
	 public void test() {
		C.super.test();
		
	}
}

class MainClass {
	public static void main(String[] args) {

		D d = new D() {
		};
		d.test();
	}
}