package november2;

import java.util.*;

public class MazeSolver {

	private static final int[][] DELTAS = {{-1,0}, {0,1}, {1,0}, {0,-1}};
	
	int rows, cols;
	char[][] maze;
	Tile[][] tiles;
	
	public MazeSolver(char[][] maze, int rows, int cols) {
		this.maze = maze;
		this.rows = rows;
		this.cols = cols;
		tiles = new Tile[rows][cols];
		for(int r = 0; r < rows; r++)
			for(int c = 0; c < cols; c++)
				tiles[r][c] = new Tile(r, c);
	}
	
	public List<Tile> solve(int startRow, int startCol) {
		Set<Tile> explored = new HashSet<>();
		List<Tile> frontier = new ArrayList<>();
//		Queue<Tile> frontier = new ArrayDeque<>();
		Tile start = tiles[startRow][startCol];
		explored.add(start);
		for(int[] delta : DELTAS) {
			int nr = startRow + delta[0];
			int nc = startCol + delta[1];
			if(inBounds(nr, nc) && !isWall(nr, nc)) {
				tiles[nr][nc].from = start;
				frontier.add(tiles[nr][nc]);
			}
		}
		Tile end = null;
		while(!frontier.isEmpty()) {
			Tile t = frontier.remove(0);
			if(isEnd(t.row, t.col)) {
				end = t;
				break;
			}
			explored.add(t);
			for(int[] delta : DELTAS) {
				int nr = t.row + delta[0];
				int nc = t.col + delta[1];
				if(inBounds(nr, nc) && !isWall(nr, nc) && !explored.contains(tiles[nr][nc])) {
					tiles[nr][nc].from = t;
					frontier.add(tiles[nr][nc]);
				}
			}
		}
		
		List<Tile> path = new ArrayList<>();
		while(end != null) {
			path.add(end);
			end = end.from;
		}
		Collections.reverse(path);
		return path;
	}
	
	boolean inBounds(int r, int c) {
		return r >= 0 && r < rows && c >= 0 && c < cols;
	}
	
	boolean isWall(int r, int c) {
		return maze[r][c] == '#';
	}
	
	boolean isEnd(int r, int c) {
		return maze[r][c] == 'E';
	}
	
}

class Tile {
	
	final int row, col;
	Tile from;
	
	public Tile(int row, int col) {
		this.row = row;
		this.col = col;
	}
	
}
