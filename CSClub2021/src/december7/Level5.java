package december7;

import java.io.*;
import java.util.*;

public class Level5 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char[][] grid = in.lines().map(String::toCharArray).toArray(char[][]::new);
		/* The code above uses BufferedReader, which we haven't talked about (There is a video in the "Classwork" tab
		//called "Reading Input" that goes over it, though). If you want to get the grid using Scanner, it's a lot
		//longer.:
		
		Scanner in = new Scanner(System.in);
		List<String> lines = new ArrayList<>();
		while(in.hasNextLine())
			lines.add(in.nextLine());
		char[][] grid = lines.stream().map(String::toCharArray).toArray(char[][]::new);
		
		//The last line uses streams, which we also haven't talked about. If you don't use streams, you'll have to
		//replace the last line above with something like this:
		
	 	char[][] grid = new char[lines.size()][]; //if you don't put a column count, each row will be 'null' by default.
	 	for(int i = 0; i < lines.size(); i++)
	 		grid[i] = lines.get(i).toCharArray();
		
		*/
		
		//The code that follows is the same no matter how you got the grid:
		char[][] cw90 = rotate(grid), r180 = rotate(cw90), ccw90 = rotate(r180);
		print(cw90);
		System.out.println();
		print(ccw90);
		System.out.println();
		print(r180);
	}

	private static void print(char[][] grid) {
		for(char[] row : grid)
			System.out.println(row);
	}
	
	/** 90-degrees clockwise */
	private static char[][] rotate(char[][] grid) {
		int grows = grid.length;
		int gcols = grid[0].length;
		char[][] res = new char[gcols][grows];
		for(int r = 0; r < grows; r++)
			for(int c = 0; c < gcols; c++) {
				res[c][grows - r - 1] = grid[r][c];
			}
		return res;
	}
	
}
