package april19;

public class DefiniteAssignmentExamples {

	private final int p;
	
	public static void main(String[] args) {
		
	}
	
	static void method() {
//		int k;
//		if(Math.random() < 0.5)
//			k = 4;
//		System.out.println(k);
		
//		int k;
//		if(true)
//			k = 6;
//		System.out.println(k);
		
//		int x = 4;
//		int y = (x = (x = 3));
//		int p = (((2 + 3) + 4) + 5);
//		
//		int k;
//		
//		if((k = 3) == 4)
//			k = 4;
//		System.out.println(k);
//		
//		int z = 3;
//		boolean b = false;
//		while(Math.PI == 3)
//			System.out.println("Hi");
		
//		if(Math.PI == 3)
//			System.out.println("hi");
		
		int k;
		if(false) {
			
		}
		else {
				
		}
		System.out.println(k);
	}
	
	
	static void example1() {
		boolean bool = true;
		int k;
		if(bool)
			k = 3;
		System.out.println(k); // CE
	}
	
	static void example2() {
		int k;
		if(true)
			k = 3;
		System.out.println(k); // OK
	}
	
	static void example3() {
		final boolean bool = true;
		int k;
		if(bool)
			k = 3;
		System.out.println(k); // OK
	}
	
	static void example4() {
		int k;
		if(Math.random() < .5)
			k = 0;
		else
			k = 1;
		//the condition expression in the if statement doesn't matter w.r.t. the definite assignment of k.
		//no matter which branch we go down, k will be definitely assigned.
		System.out.println(k); // OK
	}
	
	static void example5() {
		int k;
		if(true)
			k = 9;
		else
			k = 2;
		System.out.println(k); // OK
	}

	static void example6() {
		int k;
		if(true)
			k = 9;
		else { /* nothing */ }
		System.out.println(k); // OK
	}
	
	static void example7() {
		int k;
		if(true)
			k = 9;
		else
			System.out.println(k); // OK - a vacuous truth argument can show that k is definitely assigned here
		System.out.println(k); // OK
	}
	
	static void example8() {
		boolean bool = true;
		int k;
		if(bool)
			k = 9;
		else
			System.out.println(k); // CE
		System.out.println(k); // CE
	}

	static void example9() {
		int k;
		//k is definitely assigned after the condition expression if it is true or false.
		if((k = 3) == 3)
			System.out.println(k); // OK
		else
			System.out.println(k); // OK
		System.out.println(k); // OK
	}
	
	static void example10() {
		boolean rand = Math.random() < .5;
		int k;
		if(rand && (k = 3) == 3)
			System.out.println(k); // OK
		else
			System.out.println(k); // CE
		System.out.println(k); // CE
	}
	
	static void example11() {
		int k;
		if(true && (k = 3) == 3)
			System.out.println(k); // OK
		else
			System.out.println(k); // OK - k is vacuously definitely assigned
		System.out.println(k); // OK
	}
	
	static void example12() {
		boolean rand = Math.random() < .5;
		int k;
		if((k = 3) == 3 && rand)
			System.out.println(k); // OK
		else
			System.out.println(k); // OK
		System.out.println(k); // OK
	}
	
	static void example13() {
		int k;
		if((k = 3) == 0 || (k = 4) == 0)
			System.out.println(k); // OK
		else
			System.out.println(k); // OK
		System.out.println(k); // OK
	}
	
	static void example14() {
		int k;
		if((k = 3) == 0 || Math.random() < .5)
			System.out.println(k); // OK
		else
			System.out.println(k); // OK
		System.out.println(k); // OK
	}
	
	static void example15() {
		int k;
		if(Math.random() < .5 || (k = 3) == 0)
			System.out.println(k); // CE
		else
			System.out.println(k); // OK
		System.out.println(k); // CE
	}
	
	static void example16() {
		int k;
		if(false || (k = 3) == 0)
			System.out.println(k); // OK
		else
			System.out.println(k); // OK
		System.out.println(k); // OK
	}
	
}
