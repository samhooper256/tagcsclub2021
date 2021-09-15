package september14;

import java.io.*;
import java.util.*;

public class Sam2 {
	
	static final class Fraction implements Comparable<Fraction> {
		
		private final int num, denom;
		
		Fraction(int num, int denom) {
			int gcd = GCD.gcd(num, denom);
			num /= gcd;
			denom /= gcd;
			this.num = num;
			this.denom = denom;
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
		Scanner scanner = new Scanner(new File("src/september14/input.dat"));
		Set<Fraction> fractions = new TreeSet<>(); //I'm assuming here that the fractions are unique, which the problem
		//doesn't *technically* say.
		while(scanner.hasNextLine())
			fractions.add(parse(scanner.nextLine()));
		for(Fraction f : fractions)
			System.out.println(f);
	}

	private static Fraction parse(String fractionStr) {
		String[] split = fractionStr.split("/");
		return new Fraction(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
	}
	
}
