package february1;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        double d = in.nextDouble();
        
        //Approach 1: Basic if/else.
        if("circle".equals(name))
            System.out.printf("%.2f", Math.PI * d * d);
        else if("square".equals(name))
            System.out.printf("%.2f", d * d);
        else if("triangle".equals(name))
            System.out.printf("%.2f", d * d / Math.sqrt(3));
        
        /*
         
        //Approach 2: Switch expressions (Java 14+). Note that HackerRank is Java 15.
        System.out.printf("%.2f", switch(name) {
            case "circle" -> Math.PI * d * d;
            case "square" -> d * d;
            case "triangle" -> d * d / Math.sqrt(3);
            default -> throw new IllegalStateException(); //we know this will never happen, but compiler makes us write a "default" case.
        });
        
        */
    }
	
}
