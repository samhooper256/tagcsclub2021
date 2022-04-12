package april12;

public class ExplicitConstructor {

	public static void main(String[] args) {
		B obj = new B();
	}
	
}

class A {
	
	public A() {
		System.out.println("A constructor");
	}
	
}

class B extends A {
	
	int x;
	
	public B() {
		this(0);
		System.out.printf("B contsructor%n");
	}
	
	public B(int x) {
		//super();
		this.x = x;
		System.out.printf("B(int) constructor%n");
		// other stuff
	}
	
	
}