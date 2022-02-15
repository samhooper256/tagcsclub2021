package february15;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Level4 {

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
		Collections.sort(items);
		return String.format("$%.2f", solve(needed, items));
	}
	
	private static StoreItem parseStoreItem(String line) {
		String[] split = line.replaceAll("([^\\d\\.]|(\\.(?!\\d)))+", " ").trim().split(" ");
		return new StoreItem(Integer.parseInt(split[0]), Double.parseDouble(split[1]));
	}
	
	private static double solve(int needed, List<StoreItem> items) {
//		System.out.printf("[enter] solve(%d, %s)%n", needed, items);
		if(needed == 0) {
//			System.out.printf("\treturning 0%n");
			return 0;
		}
		if(items.size() == 1) {
			StoreItem si = items.get(0);
			return si.price() * getPiecesToMeet(needed, si.length());
		}
		StoreItem fi = items.get(0);
		int length = fi.length(), piecesNeeded = needed / length;
		double min = Double.MAX_VALUE;
		if(piecesNeeded * length < needed)
			piecesNeeded++;
		for(int pieces = 0; pieces <= piecesNeeded; pieces++) {
			double spent = pieces * fi.price();
			double v = solve(Math.max(0, needed - pieces * length), items.subList(1, items.size()));
			if(spent + v < min)
				min = spent + v;
		}
		return min;
	}
	
	/** Assumes items are sorted in natural order. */
	/*
	private static double solve(int needed, List<StoreItem> items) {
		if(items.size() == 1) {
			StoreItem si = items.get(0);
			return si.price() * getPiecesToMeet(needed, si.length());
		}
		StoreItem fi = items.get(0);
		int length = fi.length(), pieces = needed / length;
		if(pieces * length == needed)
			return pieces * fi.price();
		int remaining = needed - pieces * length;
		double partialPrice = pieces * fi.price();
		double price2 = solve(remaining, items.subList(1, items.size()));
		return Math.min(partialPrice + fi.price(), partialPrice + price2);
	}
	*/
	
	/** Returns the smallest number of pieces of {@code length} that are needed to reach or exceed {@code needed}. */
	private static int getPiecesToMeet(int needed, int length) {
		int pieces = needed / length;
		return pieces * length == needed ? pieces : pieces + 1;
	}
	
}

/** Sorted by {@link StoreItem#perUnitPrice()} and then reverse by {@link StoreItem#length()}. */
class StoreItem implements Comparable<StoreItem> {
	
	private final int length; //inches
	private final double price; //dollars
	
	public StoreItem(int length, double price) {
		this.length = length;
		this.price = price;
	}
	
	public int length() {
		return length;
	}
	
	public double price() {
		return price;
	}
	
	/** Returns {@code (price() / length())}.*/
	public double perUnitPrice() {
		return price / length;
	}

	@Override
	public int compareTo(StoreItem o) {
		int c = Double.compare(perUnitPrice(), o.perUnitPrice());
		return c == 0 ? -Integer.compare(length(), o.length()) : c;
	}
	
	@Override
	public String toString() {
		return String.format("%d in. for $%.2f", length(), price());
	}
	
}