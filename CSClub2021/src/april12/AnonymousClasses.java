package april12;

public class AnonymousClasses {

	public static void main(String args) {
//		Object o1 = getObj(), o2 = getObj();
//		System.out.println(o1);
//		System.out.println(o2);
		
		int nums[] = {1,2,3};
		
		Runnable runner = new Runnable() {

			@Override
			public void run() {
				System.out.println("Running!");
			}
			
		};
		
		Runnable betterRunner = () -> System.out.println("Running better!");
		
		runner.run();
		betterRunner.run();
	}
	
	public static Object getObj() {
		return new Object() {
			
			static {
				System.out.println("static initializer");
			}
			
			{
				System.out.println("Instance initializer");
			}
			
			@Override
			public String toString() {
				return toStringHelper();
			}
			
			private String toStringHelper() {
				return "hi";
			}
			
		};
	}
	
	public static String[] getArray() [] {
		return null;
	}
	
	
}
