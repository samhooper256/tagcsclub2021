package february15;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Level4_1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> lines = br.lines().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(solve(lines));
	}
	
	public static String solve(List<String> lines) {
		String[] first = lines.get(0).replaceAll("\\D+", " ").trim().split(" ");
		final int needed = Integer.parseInt(first[0]) * Integer.parseInt(first[1]);
		List<StoreItem> items = new ArrayList<>();
		for(String line : lines.subList(1, lines.size()))
			items.add(parseStoreItem(line));
		return String.format("$%.2f", solve(needed, items));
	}
	
	private static StoreItem parseStoreItem(String line) {
		String[] split = line.replaceAll("([^\\d\\.]|(\\.(?!\\d)))+", " ").trim().split(" ");
		return new StoreItem(Integer.parseInt(split[0]), Double.parseDouble(split[1]));
	}
	
	private static double solve(int needed, List<StoreItem> items) {
		if(needed == 0)
			return 0;
		if(items.size() == 1) {
			StoreItem si = items.get(0);
			return si.price() * getPiecesToMeet(needed, si.length());
		}
		StoreItem fi = items.get(0);
		int length = fi.length(), piecesNeeded = getPiecesToMeet(needed, length);
		double min = Double.MAX_VALUE;
		for(int pieces = 0; pieces <= piecesNeeded; pieces++) {
			double spent = pieces * fi.price();
			double v = solve(Math.max(0, needed - pieces * length), items.subList(1, items.size()));
			if(spent + v < min)
				min = spent + v;
		}
		return min;
	}
	
	/** Returns the smallest number of pieces of {@code length} that are needed to reach or exceed {@code needed}. */
	private static int getPiecesToMeet(int needed, int length) {
		int pieces = needed / length;
		return pieces * length == needed ? pieces : pieces + 1;
	}
	
}
