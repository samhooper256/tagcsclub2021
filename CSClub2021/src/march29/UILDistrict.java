package march29;

import java.util.Random;

public class UILDistrict {

	public static void main(String[] args) {
//		System.out.println(Math.signum(0.0));
//		System.out.println(Math.signum(-0.0));
//		System.out.println(0.0 == -0.0);
//		System.out.println(Math.signum(Double.NaN));
//		System.out.println(1.0 / 0);
//		System.out.println(0.0 / 0.0);
//		System.out.println(0 / 0);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		Random r = new Random();
		
		int x = r.nextInt();
		int y = r.nextInt(7);
	}
	
}
