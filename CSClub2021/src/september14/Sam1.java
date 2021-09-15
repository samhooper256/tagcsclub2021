package september14;

import java.io.*;

public class Sam1 {
	
	record Fraction(int num, int denom) implements Comparable<Fraction> {
		
		Fraction {
			int gcd = GCD.gcd(num, denom);
			num /= gcd;
			denom /= gcd;
		}

		@Override
		public int compareTo(Fraction o) {
			return Integer.compare(num * o.denom, denom * o.num);
		}
		
		@Override
		public String toString() {
			return String.format("%d/%d", num, denom);
		}
		
	}
	
	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new FileReader("src/september14/input.dat"));
		br.lines().map(Sam1::parse).sorted().forEachOrdered(System.out::println);
	}

	private static Fraction parse(String fractionStr) {
		String[] split = fractionStr.split("/");
		return new Fraction(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
	}
	
}
