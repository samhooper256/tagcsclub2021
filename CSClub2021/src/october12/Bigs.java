package october12;

import java.math.BigInteger;

public class Bigs {

	public static void main(String[] args) {
	
		BigInteger big1 = BigInteger.valueOf(12);
		
		System.out.println(big1);
		
		BigInteger big2 = BigInteger.valueOf(13);
		
		BigInteger sum = big1.add(big2);
		
		System.out.println(sum);
		
	}
	
}
