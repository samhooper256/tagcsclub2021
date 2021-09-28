package september21;

import java.io.FileNotFoundException;

public class Demo {
	 
	public static void main(String[] args) {
////		takeInt(-2);
//		try { 
////			findFile();
//			throw new NullPointerException();
//		}
//		catch(IllegalArgumentException fnf) {
//			System.out.println("Illegal argument");
//		}
//		catch(NullPointerException npe) {
//			System.out.println("null bad");
//		}
//		catch(Exception e) {
//			System.out.println("HERE");
//		}
//		
//		
//		System.out.println("Made it down here");
		
		System.out.println("Hi");
//		doNull();
	}
	
	public static void doNull() throws FileNotFoundException {
		throw new NullPointerException();
	}
	
	public static void findFile() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	
	public static void takeInt(int i) {
		if(i < 0) {
			throw new IllegalArgumentException("Invalid value: " + i);
		}
		System.out.println("Good value: " + i);
	}
	
	public static void badPractice() throws Throwable {
		
	}
	
	public static void multipleExceptions() throws FileNotFoundException, ClassNotFoundException {
		if(Math.random() < 0.5) {
			throw new FileNotFoundException();
		}
		else {
			throw new ClassNotFoundException();
		}
	}
}
