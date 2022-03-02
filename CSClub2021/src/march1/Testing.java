package march1;

public class Testing {

	public static void main(String[] args) {
//		System.out.printf("%s", "hello");
//		System.out.printf("%s %f", "hello", 2.3);
//		System.out.printf("%s %f %d", "hello", 2.3, 7);
//		System.out.printf("%s %f %d %s", "hello", 2.3, 7, "hi");
		
//		int min1 = min(1);
//		int min2 = min(1, 7);
//		int min3 = min(5, 7, 11, 3, 4, 6);
//		int min4 = min();
		
//		boolean a = true, b = false;
//		System.out.println(a && getBool()); //logical AND
//		System.out.println(a & getBool()); //bitwise AND
		
//		double x2 = Math.round(2.3);
//		float x = Math.round(2.3);
//		long x3 = Math.round(2.3);
//		int x4 = Math.round(2.3);
		
//		System.out.println(Integer.BYTES);
		
		boolean bool = false;
		boolean cool = false;
		System.out.println(bool ? cool ? 30 : 20 : 10);
	}
	
	public static boolean getBool() {
		System.out.println("method!");
		return false;
	}
	
	//varargs "variable arity parameter"
	public static int min(String str, int... arr) {
		int min = Integer.MAX_VALUE;
		for(int i : arr)
			min = Math.min(min, i);
		return min;
	}
	
	
}
