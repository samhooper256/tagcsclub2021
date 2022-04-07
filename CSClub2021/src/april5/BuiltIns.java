package april5;

import java.util.*;

public class BuiltIns {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "bbb", "c", "d", " e "));
		list.forEach(s -> System.out.println(s));
		list.removeIf(s -> s.startsWith("b"));
		System.out.println(list);
		list.replaceAll(s -> s.toUpperCase());
		System.out.println(list);
		list.replaceAll(s -> s.trim());
		System.out.println(list);
	}
	
}
