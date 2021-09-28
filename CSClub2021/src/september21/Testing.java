package september21;

import java.io.FileNotFoundException;

public class Testing {
	
	public static void main(String[] args) {
		new Testing().tryer();
		
	}
	
	void tryer() {
		try {
			throw new FileNotFoundException();
		}
		catch(FileNotFoundException fnf) {
			System.out.println("Caught");
		}
	}
	
	void method() throws FileNotFoundException {
		throw new UnsupportedOperationException();
	}
}
