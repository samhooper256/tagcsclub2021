package utils;

import java.util.Random;

public final class RNG {

	private RNG() {
		
	}

	public static final Random SOURCE = new Random();

	public static int intExclusive(int highExclusive) {
		if(highExclusive <= 0)
			throw new IllegalArgumentException(String.format("highExclusive: %d", highExclusive));
		return SOURCE.nextInt(highExclusive);
	}
	
	/** Returns a random {@code int} in the range {@code 0} to {@code highInclusive}. */
	public static int intInclusive(int highInclusive) {
		return intExclusive(highInclusive + 1);
	}
	
	public static int intInclusive(int lowInclusive, int highInclusive) {
		return intInclusive(highInclusive - lowInclusive) + lowInclusive;
	}
	
	public static double doubleExclusive(double highExclusive) {
		if(highExclusive <= 0)
			throw new IllegalArgumentException(String.format("highExclusive: %f", highExclusive));
		return SOURCE.nextDouble() * highExclusive;
	}
	
	public static double doubleInclusive(double highInclusive) {
		return doubleExclusive(Math.nextUp(highInclusive));
	}
	
	public static double doubleInclusive(double lowInclusive, double highInclusive) {
		return doubleInclusive(highInclusive - lowInclusive) + lowInclusive;
	}
	
}
