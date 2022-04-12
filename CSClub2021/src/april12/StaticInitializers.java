package april12;

import java.util.*;

public class StaticInitializers {

	private static final Set<Integer> PRIMES_1000 = new HashSet<>();
	
	private static int x;
	
	static {
		x = 3;
		System.out.println(x);
		//find the primes
		PRIMES_1000.add(2);
		PRIMES_1000.add(3);
		PRIMES_1000.add(5);
		
		y = 8;
//		System.out.println(y);
	}
	
	private static int y = 3;
	static {
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(PRIMES_1000);
	}
	
}
