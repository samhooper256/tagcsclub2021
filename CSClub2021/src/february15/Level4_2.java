package february15;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

//This solution is more efficient than the first one. Notice that it doesn't use recurison.
public class Level4_2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> lines = br.lines().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(solve(lines));
	}
	
	static int totalNeeded;
	static double[] cheapestCost; //cheapestCost[i] is the cheapest price to get i inches of wood (starting from nothing).
	static int[] real; //real[i] is the maximum number of inches you can buy for the price stored in cheapestCost[i].
	
	public static String solve(List<String> lines) {
		String[] first = lines.get(0).replaceAll("\\D+", " ").trim().split(" ");
		totalNeeded = Integer.parseInt(first[0]) * Integer.parseInt(first[1]);
		List<StoreItem> items = new ArrayList<>();
		for(String line : lines.subList(1, lines.size()))
			items.add(parseStoreItem(line));
		cheapestCost = new double[totalNeeded + 1];
		Arrays.fill(cheapestCost, Double.MAX_VALUE);
		cheapestCost[0] = 0;
		real = new int[totalNeeded + 1];
		for(int i = 0; i < real.length; i++)
			real[i] = i;
		
		for(StoreItem si : items) {
			for(int i = 1; i <= Math.min(totalNeeded, si.length()); i++) {
				if(si.price() < cheapestCost[i]) {
					cheapestCost[i] = si.price();
					real[i] = si.length();
				}
			}
		}
		
		for(int n = 2; n <= totalNeeded; n++) {
			//What's the cheapest cost to get n inches by combining two purchases we already know about?
			double combinedPrice = Double.MAX_VALUE;
			int combinedRealLength = Integer.MAX_VALUE; //to be stored in real[n]
			for(int low = 1; low <= n - 1; low++) {
				int lr = real[low], left = Math.max(0, n - lr);
				double price = cheapestCost[Math.min(totalNeeded, lr)] + cheapestCost[left];
				if(price < combinedPrice) {
					combinedPrice = price;
					combinedRealLength = lr + real[left];
				}
			}
			
			for(int i = n; i <= Math.min(totalNeeded, combinedRealLength); i++)
				cheapestCost[i] = Math.min(cheapestCost[i], combinedPrice);
			
		}
		
		return String.format("$%.2f", cheapestCost[totalNeeded]);
	}
	
	private static StoreItem parseStoreItem(String line) {
		String[] split = line.replaceAll("([^\\d\\.]|(\\.(?!\\d)))+", " ").trim().split(" ");
		return new StoreItem(Integer.parseInt(split[0]), Double.parseDouble(split[1]));
	}
	
}