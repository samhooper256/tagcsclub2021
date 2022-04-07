package april5;

import java.util.*;

@FunctionalInterface
interface Funky {
	
	<S> void stuff();
	
}

public class MapTesting {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		map.merge("D", 4, (a, b) -> a + b);
		System.out.println(map);
		map.merge("A", 10, (a, b) -> a + b);
		System.out.println(map);
		
		map.compute("A", (s, i) -> {
			System.out.println("\ts=" + s + ", i=" + i);
			return 10;
		});
		
		map.compute("J", (s, i) -> {
			System.out.println("\ts=" + s + ", i=" + i);
			return 10;
		});
		
		System.out.println(map);
		
		map.replaceAll((s, i) -> i + 1);
		
		System.out.println(map);
		
		Funky f = MapTesting::bots;
		
//		Funky f2 = () -> bots();
	}
	
	public static <S> void bots() {
		
	}
}
