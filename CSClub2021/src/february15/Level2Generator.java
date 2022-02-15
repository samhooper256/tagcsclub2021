package february15;

import utils.*;

public class Level2Generator {

	private static final String FORMAT = "You have one %d-in. piece of wood. How many %d-in. pieces can you make?";
	
	private static final int N = 53, K = 7;
	
	public static void main(String[] args) {
		int k = K <= 0 ? RNG.intInclusive(1, N - 1) : K;
		String input = String.format(FORMAT, N, k);
		IO.write("src/february15/level2in.txt", input);
		IO.write("src/february15/level2out.txt", Level2.solve(input));
	}
	
}
