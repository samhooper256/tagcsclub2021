package april5;

import java.util.*;

public class LambdaTester {

	public interface Function<T> {
		T apply(T s);
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
		applyFunction(list, (s) -> s.toUpperCase());
//		System.out.println(list);
//		applyFunction(list, (s) -> s + "!");
//		System.out.println(list);
//		
//		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
//		applyFunction(nums, i -> i * 2);
//		System.out.println(nums);
		
		Clickable c = () -> {
			System.out.println("clicked!");
			System.out.println("clicked!");
		};
		c.click();
	}
	
	private static <T> void applyFunction(List<T> list, Function<T> f) {
		for(int i = 0; i < list.size(); i++)
			list.set(i, f.apply(list.get(i)));
	}
	
	
}
