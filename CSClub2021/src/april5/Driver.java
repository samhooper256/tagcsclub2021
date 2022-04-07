package april5;

public class Driver {

//	int x = 3;
//	
//	static int y = 7;
	
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Clickable c = m;
		
		c.click();
		
		Clickable c2 = new Mouse();
		
		int num = Clickable.Z;
		
		
	}
	
}
