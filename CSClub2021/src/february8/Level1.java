package february8;

import java.util.*;

public class Level1 {

	//The different "strategy" methods show different ways to solve this problem.
	
	public static void main(String[] args) {
		strategy1();
		//strategy2();
		//strategy3();
	}
	
	public static void strategy1() {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while(in.hasNextInt())
			list.add(in.nextInt());
		int max = Integer.MIN_VALUE; //set to smallest possible value for an int.
		for(int i : list)
			if(i > max)
				max = i; //ensure max stores the largest value we've seen so far.
		//note that the if statement could be replaced with 'max = Math.max(max, i);'
		System.out.println(max);
	}
	
	public static void strategy2() {
		//identical to strategy1 until last line.
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while(in.hasNextInt())
			list.add(in.nextInt());
		System.out.println(Collections.max(list));
	}
	
	public static void strategy3() {
		Scanner in = new Scanner(System.in);
		System.out.println(Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).max().getAsInt());
	}
	
}