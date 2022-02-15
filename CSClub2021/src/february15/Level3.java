package february15;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Level3 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		solve(br.lines().collect(Collectors.toCollection(ArrayList::new)));
	}

	public static String solve(List<String> lines) {
		int sum = lines.subList(1, lines.size() - 1).stream().mapToInt(line -> {
			String[] split = line.replaceAll("\\D+", " ").trim().split(" ");
			return Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
		}).sum();
		int K = Integer.parseInt(lines.get(lines.size() - 1).replaceAll("\\D+", " ").trim());
		int div = sum / K;
		if(div == 1)
			return "1 piece";
		else
			return String.format("%d pieces", div);
	}
	
}
