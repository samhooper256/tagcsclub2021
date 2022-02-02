package february2;

import java.io.*;
import java.util.*;

public class Level4 {

	public static void main(String[] args) {
		//My strategy is to make a char[][] of all the characters in the input and then search this 2D
		//array for an 'X' shape.
		
		//Approach 1 for making the char[][]: Get the lines, then convert each line to a 1D char array.
		Scanner in = new Scanner(System.in);
		List<String> lines = new ArrayList<>(); //first, get all the lines.
		while(in.hasNextLine())
			lines.add(in.nextLine());
		char[][] grid = new char[lines.size()][]; //If we don't put a column count, each row will just be a null char[].
		for(int row = 0; row < lines.size(); row++)
			grid[row] = lines.get(row).toCharArray(); //Assign to the row directly.
		
		/*
		
		//Approach 2 for making the char[][]: Mental expansion.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] grid = br.lines().map(String::toCharArray).toArray(char[][]::new);
		
		*/
		
		//Now, no matter how we got the char[][], the rest is the same.
		
		//Remember, grid.length is # of rows, grid[i].length is the # of cols (where i is any valid row).
		for(int r = 0; r < grid.length - 2; r++) {
			for(int c = 0; c < grid[r].length - 2; c++) {
				if(	grid[r][c] == '#' && grid[r][c + 1] == '.' && grid[r][c + 2] == '#' &&
					grid[r + 1][c] == '.' && grid[r + 1][c + 1] == '#' && grid[r + 1][c + 2] == '.' &&
					grid[r + 2][c] == '#' && grid[r + 2][c + 1] == '.' && grid[r + 2][c + 2] == '#') {
					System.out.printf("%d %d", r, c);
					return; //As soon as we find the first 'X', immediately stop the entire main method.
					//Note that this will find the 'X' on the lowest row and lowest col as the question asks for.
				}
			}
		}
		//the only way we could get down here is if we never found an 'X', so we know it's not found.
		System.out.println("not found");
	}
	
}
