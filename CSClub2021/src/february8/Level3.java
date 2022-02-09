package february8;

import java.util.*;
import java.util.stream.Collectors;

public class Level3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//strategy1(in);
		strategy2(in);
		//strategy3(in);
		//strategy4(in);
	}

	//Time Complexity: O(n^2). If you don't know what that means, ignore this :)
	public static void strategy1(Scanner in) {
		//if you didn't know about Sets or TreeSets (see strategy 2; it's simpler and more efficient),
		//you could do the following:
		List<Integer> list = new ArrayList<>();
		while(in.hasNextInt())
			list.add(in.nextInt());
		
		//remove duplicates:
		for(int i = list.size() - 1; i >= 0; i--) //loop from end to beginning of list because we are removing elements.
			if(list.subList(0, i).contains(list.get(i))) //could also do: "if(list.indexOf(list.get(i)) < i)"
				list.remove(i); //this will remove the element at index i.
		
		//sort in descending order:
		Collections.sort(list, Comparator.reverseOrder()); 
		//Collections.sort takes a second parameter which is a Comparator.
		
		StringJoiner j = new StringJoiner(" ");
		for(int i : list)
			j.add(String.valueOf(i));
		System.out.println(j); //automatically calls j.toString()
	}

	//Time Complexity: O(n*log(n)).
	public static void strategy2(Scanner in) {
		//use a TreeSet with a reversed comparator.
		TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());
		while(in.hasNextInt())
			set.add(in.nextInt());
		StringJoiner j = new StringJoiner(" ");
		for(int i : set)
			j.add(String.valueOf(i));
		System.out.println(j);
	}
	
	//Time complexity: O(n*log(n)).
	public static void strategy3(Scanner in) {
		TreeSet<Integer> set = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toCollection(() -> new TreeSet<Integer>(Comparator.reverseOrder())));
		System.out.println(set.stream().map(Object::toString).collect(Collectors.joining(" ")));
	}
	
	//Time complexity: O(n*log(n)).
	public static void strategy4(Scanner in) {
		System.out.println(
			Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).distinct().sorted(Comparator.reverseOrder())
			.map(Object::toString).collect(Collectors.joining(" "))
		);
	}
	
}
