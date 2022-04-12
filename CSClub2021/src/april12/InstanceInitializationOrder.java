package april12;

public class InstanceInitializationOrder {

	public static void main(String[] args) {
		F obj = new F();
	}
	
}

class E {
	
	{
		System.out.println("E instance initializer");
	}
	
	public E() {
		System.out.println("E constructor");
	}
}

class F extends E {
	
	{
		System.out.println("F instance init");
	}
	
	public F() {
		System.out.println("F constructor");
	}
	
}