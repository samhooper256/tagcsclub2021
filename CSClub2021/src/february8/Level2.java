package february8;

import java.util.*;

public class Level2 {

	//There are many ways to do this problem. This is only one way. I do think using a 2D char array ('char[][]') is
	//the best and easiest way though.
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printV(in.nextLine());
	}
	
	public static void printV(String line) {
		char[][] grid = getGrid1(line);
		for(char[] row : grid)
			System.out.println(row); //this automatically converts row (a char[]) to a String.
	}

	//getGrid1 and getGrid2 are two different ways to generate the filled-in char[][].
	
	public static char[][] getGrid1(String line) {
		int n = Integer.parseInt(line);
		char[][] grid = new char[n][2 * n - 1];
		for(char[] row : grid)
			Arrays.fill(row, ' ');
		for(int r = 0, c = 0; r < n; r++, c++)
			grid[r][c] = '#';
		for(int r = n - 2, c = n; r >= 0; r--, c++)
			grid[r][c] = '#';
		return grid;
	}
	
	public static char[][] getGrid2(String line) {
		int n = Integer.parseInt(line);
		int width = 2 * n - 1;
		char[][] grid = new char[n][width];
		for(int r = 0; r < grid.length; r++)
			for(int c = 0; c < grid[r].length; c++)
				if(r == c || r == width - c - 1)
					grid[r][c] = '#';
				else
					grid[r][c] = ' ';
		return grid;
	}
	
}
