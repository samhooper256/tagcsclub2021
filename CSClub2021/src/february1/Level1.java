package february1;

import java.util.*;
import java.util.stream.Collectors;

public class Level1 {

	public static void main(String[] args) {
		//Approach 1: Print out the numbers as soon as you input them.
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print(in.nextInt() + 1);
			if(in.hasNextInt())
				System.out.print(" ");
			else
				break;
		}
		
		/*
		
		//Approach 2: Store the numbers in a list, then loop over your list and print them out.
		Scanner in = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		while(in.hasNextInt())
			nums.add(in.nextInt());
		StringJoiner j = new StringJoiner(" ");
		for(int i : nums)
			j.add(String.valueOf(i + 1));
		System.out.println(j);
		
		
		//Approach 3: Same as above, but without the StringJoiner.
		Scanner in = new Scanner(System.in);
		List<Integer> nums = new ArrayList<>();
		while(in.hasNextInt())
			nums.add(in.nextInt());
		//print out all numbers except the last, each followed by a space:
		for(int i = 0; i < nums.size() - 1; i++)
			System.out.print(nums.get(i) + " ");
		//print out last number:
		System.out.println(nums.get(nums.size() - 1));
		
		
		//Approach 4: Expand your mind. Make sure to import "java.util.stream.*"
		Scanner in = new Scanner(System.in);
		System.out.println(Arrays.stream(in.nextLine().split(" ")).map(s -> Integer.parseInt(s) + 1)
			.map(Object::toString).collect(Collectors.joining(" ")));
			
		*/
	}
	
}
