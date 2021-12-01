package november30;

import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a / b);
        boolean isEven = a % 2 == 0;
        System.out.println(isEven);
    }

}
