package september14;

import java.io.File;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Throwable {
		Scanner in = new Scanner(new File("src/september14/input.dat"));
		HashMap<Double, String> map = new HashMap<>();
		while(in.hasNextLine()) {
			String line = in.nextLine(); // 6/8
			int slashIndex = line.indexOf('/');
			int num = Integer.parseInt(line.substring(0, slashIndex));
			int denom = Integer.parseInt(line.substring(slashIndex + 1));
			int g = gcd(num, denom);
			num /= g;
			denom /= g;
			double d = (double) num / denom;
			String simplified = num + "/" + denom;
			map.put(d, simplified);
		}

		ArrayList<Double> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		for(double fraction : list) {
			String str = map.get(fraction);
			System.out.println(str);
		}
	}
	
//	static int gcd(int a, int b) {
//		while(a != b) {
//			if(a > b)
//				a = a - b;
//			else
//				b = b - a;
//		}
//		return a;
//	}
	
	static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
//	static int gcd(int a, int b) {
//		int smaller = Math.min(a, b);
//		for(int d = smaller; d >= 1; d--)
//			if(a % d == 0 && b % d == 0)
//				return d;
//		return -1;
//	}
	
}
