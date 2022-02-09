package february8;

import java.util.*;

public class Level4 {
	
	private static final int MAX = 1000;
	private static final boolean[] IS_PRIME = new boolean[MAX + 1];
	private static final List<Integer> PRIMES = new ArrayList<>();
	
	static {
		//Search "Sieve of Eratosthenes." Basically, I'm just finding all the primes in the range 1 to 1000 (inclusive)
		//for use in my solution below.
		for(int i = 2; i < IS_PRIME.length; i++)
			IS_PRIME[i] = true;
		for(int i = 2; i < IS_PRIME.length; i++) {
			if(!IS_PRIME[i])
				continue;
			for(int k = i + i; k < IS_PRIME.length; k += i)
				IS_PRIME[k] = false;
		}
		for(int i = 2; i < IS_PRIME.length; i++)
			if(IS_PRIME[i])
				PRIMES.add(i);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int number = Integer.parseInt(in.nextLine());
		int n = number;
		List<Integer> factors = new ArrayList<>(), powers = new ArrayList<>();
		for(int p : PRIMES) {
			int count = 0;
			while(n % p == 0) {
				n /= p;
				count++;
			}
			if(count > 0) {
				factors.add(p);
				powers.add(count);
			}
		}
		for(int i = 0; i < factors.size(); i++)
			System.out.printf("%d^%d%n", factors.get(i), powers.get(i));
	}
	
}
