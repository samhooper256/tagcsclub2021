package february15;

import java.util.*;

import utils.*;

public class Level4Generator {

	private static final int STORE_ITEMS = 20;
	private static final int MIN_N = 1, MAX_N = 10, MIN_K = 8, MAX_K = 12;
	private static final int MIN_LENGTH = 1, MAX_LENGTH = 50;
	private static final double MIN_PRICE = 0.01, MAX_PRICE = 9.99;
	private static final Set<Integer> USED_LENGTHS = new HashSet<>();
	
	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		int N = RNG.intInclusive(MIN_N, MAX_N), K = RNG.intInclusive(MIN_K, MAX_K);
		input.add(firstInputLine(N, K));
		for(int i = 0; i < STORE_ITEMS; i++)
			input.add(toInputLine(generateItem()));
		IO.write("src/february15/level4in.txt", input);
		IO.write("src/february15/level4out.txt", Level4.solve(input));
	}
	
	private static String firstInputLine(int N, int K) {
		if(N > 1)
			return String.format("You want %d pieces of wood, each %d %s long.", N, K, inchStr(K));
		else
			return String.format("You want 1 piece of wood that's %d %s long.", K, inchStr(K));
	}
	
	private static String inchStr(int x) {
		return x == 1 ? "inch" : "inches";
	}
	
	private static String toInputLine(StoreItem si) {
		return String.format("%d-in. for $%.2f each", si.length(), si.price());
	}
	
	private static StoreItem generateItem() {
		int length = getUnusedLength();
		USED_LENGTHS.add(length);
		return new StoreItem(length, RNG.doubleInclusive(MIN_PRICE, MAX_PRICE));
	}
	
	private static int getUnusedLength() {
		int r;
		do {
			r = RNG.intInclusive(MIN_LENGTH, MAX_LENGTH);
		} while(USED_LENGTHS.contains(r));
		return r;
	}
	
}