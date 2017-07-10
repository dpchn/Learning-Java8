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

interface D extends B, C {
	default void test() {
		System.out.println("In interface D");
	}
}

class MainClass {
	public static void main(String[] args) {

		D d = new D() {
		};
		d.test();
	}
}