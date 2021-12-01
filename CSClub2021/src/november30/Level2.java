package november30;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble();
        
        System.out.printf("%.1f%n", Math.abs(a));
        System.out.printf("%.1f%n", Math.sqrt(b));
        System.out.printf("%.1f%n", Math.pow(a, b));
        System.out.printf("%.1f%n", Math.min(a, b));
        System.out.printf("%.1f%n", Math.hypot(a, b));
        System.out.printf("%.1f%n", a * Math.E);
    }
	
}
