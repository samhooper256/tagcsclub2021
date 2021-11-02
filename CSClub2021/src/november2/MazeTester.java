package november2;

import java.util.List;

public class MazeTester {
	
	public static void main(String[] args) {
		char[][] maze = {
			"##E####".toCharArray(),
			"#     #".toCharArray(),
			"### # #".toCharArray(),
			"# # # #".toCharArray(),
			"# # # #".toCharArray(),
			"#     #".toCharArray(),
			"#S#####".toCharArray()
		};
		MazeSolver solver = new MazeSolver(maze, 7, 7);
		List<Tile> path = solver.solve(6, 1);
		for(Tile t : path)
			maze[t.row][t.col] = '.';
		for(char[] line : maze)
			System.out.println(line);
	}
	
}
