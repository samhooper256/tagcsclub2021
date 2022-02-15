package february15;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Level1 {

	public static void main(String[] args) {
//		strategy1();
		strategy2();
//		strategy3();
	}

	public static void strategy1() {
		Scanner in = new Scanner(System.in);
		String result = "";
		while(in.hasNextLine())
			result += in.nextLine();
		System.out.println(result);
	}
	
	// identical to #1 but uses a StringBuilder which is more efficient.
	public static void strategy2() {
		Scanner in = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		while(in.hasNextLine())
			result.append(in.nextLine());
		System.out.println(result);
	}
	
	public static void strategy3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(br.lines().collect(Collectors.joining()));
	}
	
}
