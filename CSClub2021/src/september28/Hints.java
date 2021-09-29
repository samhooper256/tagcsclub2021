package september28;

import java.util.Scanner;

public class Hints {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line = in.nextLine(); //returns all of the remaining text on the current line,
		//and moves the Scanner's "cursor" to the start of the next line.
		
		int num = in.nextInt(); //skips any whitespace in front of the cursor to find the next
		//int. Parses that int and returns it, leaving the cursor immediately after the last digit
		//in the int.
		
	}
	
}
