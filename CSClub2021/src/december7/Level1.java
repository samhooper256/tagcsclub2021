package december7;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		System.out.println(S.charAt(S.length() - 1) + S.substring(0, S.length() - 1));
	}
	
}
