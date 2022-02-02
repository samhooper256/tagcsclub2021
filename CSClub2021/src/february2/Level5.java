package february2;

import java.util.*;

public class Level5 {

	//If you want to learn more about problems like this, research Graph Theory.
	
	//"adj" will map each town to a set of all towns that are adjacent to it.
	private static Map<String, Set<String>> adj = new HashMap<>(); // "adj" is short for "adjacent"
	//"visited" is used by the "visit" method. It stores all cities that have been visited.
	private static Set<String> visited = new HashSet<>();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			String[] split = in.nextLine().split("---");
			String a = split[0], b = split[1];
			adj.putIfAbsent(a, new HashSet<>());
			adj.putIfAbsent(b, new HashSet<>());
			adj.get(a).add(b);
			adj.get(b).add(a);
		}
		visit(adj.keySet().iterator().next()); //get any town - it doesn't matter which.
		//Now, every town reachable from the random town we just picked above has been added to the visited set.
		//If every town is reachable from every other, then this means all the towns should be in the visited set.
		//Therefore, if there are fewer towns in the visited set than in "adj" map, not all towns are connected.
		
		System.out.println(visited.size() == adj.size()); // true iff we visited every town.
	}
	
	//This method will recursively explore every city that is reachable from the given town. Every town (including the
	//one passed to the method) will be added to the visited set when it is visited.
	private static void visit(String town) {
		if(visited.contains(town))
			return;
		visited.add(town);
		for(String neighbor : adj.get(town))
			visit(neighbor);
	}
	
}
