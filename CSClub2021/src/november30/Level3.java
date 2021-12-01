package november30;

import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String S = line.substring(line.indexOf('z') + 1, line.lastIndexOf("hi"));
        System.out.println(S);
        System.out.println(S.endsWith("hills"));
        System.out.println(S.contains("lie"));
        System.out.println(S.toUpperCase());
        System.out.println(S.repeat(7));
        System.out.println(S.replace("h", ""));
    }
	
}
