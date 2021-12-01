package november30;

import java.util.Scanner;

public class Level4Regex {
	    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        System.out.println(line.matches(
        		"int *\\[ *\\] *[A-Za-z]\\w*+ *= *\\{ *(\\d+( *, *\\d+)* *)?\\} *;"
        ));
    }
	    
}