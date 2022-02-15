package utils;

public final class Strings {

	private Strings() {
		
	}
	
	public static String random(int minLengthInclusive, int maxLengthInclusive, CharSupplier supplier) {
		return random(RNG.intInclusive(minLengthInclusive, maxLengthInclusive), supplier);
	}
	
	public static String random(int length, CharSupplier supplier) {
		if(length < 0)
			throw new IllegalArgumentException(String.format("length: %d", length));
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < length; i++)
			sb.append(supplier.get());
		return sb.toString();
	}
	
}
