package february15;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Level4Tester {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new FileReader("src/february15/level4in.txt"));
		List<String> lines = br.lines().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(Level4.solve(lines));
		br.close();
	}
	
}
