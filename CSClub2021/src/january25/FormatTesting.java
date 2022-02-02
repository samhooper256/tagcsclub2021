package january25;

public class FormatTesting {

	public static void main(String[] args) {
		// --- %d ---
		System.out.printf("%d%n", 12);
//		System.out.printf("%D%n", 12); //using capital letters when not allowed gives exception
		
		//Width & Precision:
		System.out.printf("%10d|%n", 5); //left-pads with spaces to fit width (10).
//		System.out.printf("%10.3d%n", 5); //providing precision when not allowed gives exception.
//		System.out.printf("%.3d%n", 5); //""
		
		// - flag
		System.out.printf("%-10d|%n", 5); //the - flag right pads the spaces.
//		System.out.printf("%-d|%n", 5); //using - when not allowed gives exception.
		
		// # flag
//		System.out.printf("%#d|%n", 5); //the # flag is not allowed for d.
		
		// + flag
		System.out.printf("%+d%n", 5); //the + flag means the result will always include a sign. 
		System.out.printf("%+10d|%n", 5); //the + flag means the result will always include a sign. 
		System.out.printf("%+-10d|%n", 5); //the + flag means the result will always include a sign. 
		
		//   (space) flag
		System.out.printf("% -10d|%n", 5); //the space flag means the result
		//will include a leading space for positive values. 
		System.out.printf("% 10d|%n", 5);
		
		// 0 flag
		System.out.printf("%010d|%n", 5); //leading zeros will be added to fill the width.
//		System.out.printf("%0d|%n", 5); //0 without a width gives exception.
//		System.out.printf("%0-10d|%n", 5); //0 cannot be used with -
		System.out.printf("%0+10d|%n", 5); //the first 0 will be made into a +
		System.out.printf("%0+2d|%n", 5);
		System.out.printf("%0 2d|%n", 5); //  5|
		System.out.printf("%0 3d|%n", 5); //  05|
		
		// , flag
		System.out.printf("%,d%n", 12345);
		System.out.printf("%0,d%n", 12345);
		
	}
	
}
