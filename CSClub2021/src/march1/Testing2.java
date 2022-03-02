package march1;

class Super {
	int x = 1;
	
}

class Sub extends Super {
	int x = 2;
	
}

public class Testing2 {

	public static void main(String[] args) {
		Object o = new Sub();
		
//		Super sup = (Super) o;
		Sub sub = (Sub) o;
		
//		System.out.println(sup.x);
		System.out.println(sub.x);
		
		System.out.println(((Super) sub).x);
		
	}
	
}
