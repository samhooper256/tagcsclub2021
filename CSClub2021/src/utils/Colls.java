package utils;

import java.util.*;
import java.util.function.Supplier;

public final class Colls {

	private Colls() {
		
	}
	
	/** Returns a {@link List} of {@code size} elements all produced by the given {@link Supplier}. The returned list
	 * is mutable. No guarantees are made on its type. */
	public static <T> List<T> list(int size, Supplier<? extends T> supplier) {
		if(size < 0)
			throw new IllegalArgumentException(String.format("size: %d", size));
		ArrayList<T> list = new ArrayList<>();
		for(int i = 0; i < size; i++)
			list.add(supplier.get());
		return list;
	}
	
}
