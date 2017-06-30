
public class A {
	public void name() {
		System.out.println("Hello");
	}
}

class B extends A{
	
	
	public void name() {
		System.out.println("Class B");
	}
}

class C extends A{
	public void name() {
		System.out.println("Class C");
	}
}


class D extends B,C {// Java confuse of which class function should use
	public void name() {
		System.out.println("Class B");
	}
}



interface i1{
	public abstract void foo();
}


interface i2 extends i1{
	
	public abstract void foo();
}

interface i3 extends i1{
	public abstract void foo();
}

interface i4 extends i2, i3{
	public abstract void foo(){
		
	}
}

