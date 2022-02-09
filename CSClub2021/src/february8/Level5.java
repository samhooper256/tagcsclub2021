package february8;

import java.util.Scanner;

// see https://www.topcoder.com/thrive/articles/Geometry%20Concepts%20part%202:%20%20Line%20Intersection%20and%20its%20Applications
public class Level5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text1 = in.nextLine();
		String text2 = in.nextLine();
		double[] abc1 = getABC(text1), abc2 = getABC(text2);
		double 	A1 = abc1[0], B1 = abc1[1], C1 = abc1[2],
				A2 = abc2[0], B2 = abc2[1], C2 = abc2[2];
		double det = A1 * B2 - A2 * B1;
//		System.out.printf("line 1: %.2fx+%.2fy=%.2f%n", A1, B1, C1);
//		System.out.printf("line 2: %.2fx+%.2fy=%.2f%n", A2, B2, C2);
		if(det == 0) {
			System.out.println("none");
		}
		else {
			double x = (B2 * C1 - B1 * C2) / det;
			double y = (A1 * C2 - A2 * C1) / det;
			System.out.printf("(%.2f, %.2f)%n", x, y);
		}
	}
	
	public static double[] getABC(String line) {
		double A, B, C;
		if(line.startsWith("y=")) {
			if(!line.contains("x")) { //it of the form y=constant
				A = 0;
				B = 1;
				C = Double.parseDouble(line.substring(2));
			}
			else { //it is of the form y=mx or y=mx+constant
				String between = line.substring(line.indexOf('=') + 1, line.indexOf('x'));
				B = 1;
				C = 0;
				if(between.isEmpty())
					A = -1;
				else if(between.equals("-"))
					A = 1;
				else
					A = -Double.parseDouble(between);
				if(line.endsWith("x"))
					C = 0;
				else
					C = Double.parseDouble(line.substring(line.indexOf('x') + 1));
			}
		}
		else { //it is of the form x=constant
			A = 1;
			B = 0;
			C = Double.parseDouble(line.substring(2));
		}
		return new double[] {A, B, C};
	}
	
}
