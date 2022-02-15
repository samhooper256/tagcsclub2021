package utils;

import java.util.stream.Stream;

public final class Misc {

	private Misc() {
		
	}
	
	public static String concat(Iterable<?> iterable) {
		StringBuilder result = new StringBuilder();
		for(Object o : iterable)
			result.append(o.toString());
		return result.toString();
	}
	
	public static <T> String concat(Stream<T> stream) {
		return concat((Iterable<T>) stream::iterator);
	}
	
}
