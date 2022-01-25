package december7;

import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(char c = 'A'; c < ('A' + N); c++)
			System.out.println(String.valueOf(c).repeat(N));
	}
}
