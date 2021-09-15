package september14;

import java.io.*;
import java.util.*;

public class Sam3 {
	
	
	
	public static void main(String[] args) throws Throwable {
		Scanner scanner = new Scanner(new File("src/september14/input.dat"));
		List<Fraction> fractions = new ArrayList<>(); 
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine(); //this is the next line of input, as a String.
			fractions.add(parse(line));
		}
		
		Collections.sort(fractions); //It knows how to sort my List of Fractions because I made the Fraction class
		//implement the Comparable interface. If Fraction did not implement Comparable, this line would give a compile
		//error.
		
		for(Fraction f : fractions)
			System.out.println(f); //this calls the toString() method on f, so it will be formatted correctly.
	}

	private static Fraction parse(String fractionStr) {
		//See Sam1 and Sam2 for an easier way to do this method.
		int slashIndex = fractionStr.indexOf('/');
		int num = Integer.parseInt(fractionStr.substring(0, slashIndex));
		int denom = Integer.parseInt(fractionStr.substring(slashIndex + 1));
		return new Fraction(num, denom);
	}
	
}

class Fraction implements Comparable<Fraction> {
	
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
		//You can compare two fractions, a/b and c/d, by simply comparing the products a*d and b*c. This can be proven
		//by simple algebra. If you multiply both sides of the inequality by b*d:
		//		a/b > c/d  =>  ad > bc
		//You can do the same for less than (<) and equals (=).
		
		//I am leveraging the fact above in this line. This line is basically saying "the comparsion of this fraction
		//and o is the same as the comparison of num*o.denom and denom*o.num."
		return Integer.compare(num * o.denom, denom * o.num);
	}
	
	@Override
	public String toString() {
		return num + "/" + denom; //see Sam1 and Sam2 to for the way I would do this statement :)
	}
	
}
