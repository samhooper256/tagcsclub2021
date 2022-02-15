package february15;

import java.util.*;

import utils.IO;

public class Level3Generator {

	private static final List<Integer> BOARDS = Arrays.asList(
		5, 15,
		9, 85
	);
	
	private static final int K = 12;
	
	public static void main(String[] args) {
		List<String> lines = new ArrayList<>();
		lines.add("You have:");
		for(int i = 0; i < BOARDS.size(); i += 2)
			lines.add(haveLine(BOARDS.get(i), BOARDS.get(i + 1)));
		lines.add(String.format("How many %d-in. pieces can you make?", K));
		String output = Level3.solve(lines);
		IO.write("src/february15/level3in.txt", lines);
		IO.write("src/february15/level3out.txt", output);
	}
	
	private static String haveLine(int A, int B) {
		return String.format("%d-in. x %d", A, B);
	}
	
}
