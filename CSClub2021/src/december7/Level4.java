package december7;

import java.util.*;

public class Level4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		char[][] grid = new char[N][N];
		for(char[] row : grid)
			Arrays.fill(row, ' ');
		for(int r = 0; r <=  N / 2; r++) {
			grid[r][N / 2 - r] = '#';
			grid[r][N / 2 + r] = '#';
			grid[N - r - 1][N / 2 - r] = '#';
			grid[N - r - 1][N / 2 + r] = '#';
		}
		for(char[] row : grid)
			System.out.println(row);
	}
	
}
