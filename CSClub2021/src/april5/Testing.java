package april5;

interface Unary {
	double apply(double num);
}

public class Testing {

	public static void main(String[] args) {
		Unary flipper = x -> -x;

//		Object adder = m -> m + 5;
		
		Object doubler = (Unary) k -> 2 * k;



	}
	
}
