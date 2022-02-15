package february15;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(solve(in.nextLine()));
	}
	
	public static String solve(String input) {
		String[] split = input.replaceAll("\\D+", " ").trim().split(" ");
		int N = Integer.parseInt(split[0]), K = Integer.parseInt(split[1]);
		int div = N / K, rem = N % K;
		if(rem == 0)
			return String.format("%d pieces", div);
		else
			if(div == 1)
				return String.format("%d piece with %d in. left over", div, rem);
			else
				return String.format("%d pieces with %d in. left over", div, rem);
	}
	
}