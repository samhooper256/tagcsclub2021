package september21;

public class AnimalTester {

	public static void main(String[] args) {
		Dog d = new Dog();
//		Animal a = new Animal();
		Animal a = d;
		
		d.speak();
		a.speak();
	}
	
}
