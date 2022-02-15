package utils;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

public class IO {

	private IO() {
		
	}
	
	/** Creates the file if it doesn't already exist. Overwrites file contents.
	 * Rethrows any {@link IOException} as a {@link RuntimeException}. */
	public static void write(String path, Iterable<?> lines) {
		try {
			Files.write(Path.of(path), strings(lines));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void write(String path, String text) {
		write(path, Arrays.asList(text));
	}
	
	public static <T> void write(String path, Stream<T> lines) {
		write(path, (Iterable<T>) lines::iterator);
	}

	private static Iterable<String> strings(Iterable<?> lines) {
		Iterator<?> itr = lines.iterator();
		return () -> new Iterator<String>() {

			@Override
			public boolean hasNext() {
				return itr.hasNext();
			}

			@Override
			public String next() {
				return String.valueOf(itr.next());
			}
			
		};
	}
	
}
