package december7;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		for(char c : S.toCharArray())
			System.out.print((char) (c + 1));
	}
	
}
