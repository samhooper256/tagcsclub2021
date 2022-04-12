package april12;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InstanceInitializers  {

	public static void main(String[] args) {
//		D obj = new D();
	}
	
}

class D {
	
	private int x;
	
	{
		System.out.println(x);
		x = 3;
		System.out.println(x);
		System.out.println("D instance init");
		
		y = 7;
//		System.out.println(y);
		
		if(true)
			throw new FileNotFoundException();
		
	}
	
	private int y = 4;
	
	public D(int count) throws IOException {
		if(count < 0)
			throw new IllegalArgumentException();
//		System.exit(0);
		System.out.println("D constructor");
	}
	
	{
		System.out.println(y);
		System.out.println("D instance init 2");
	}

}
