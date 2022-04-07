package april5;

@FunctionalInterface
public interface Clickable {

	int Z = 24;
	
	void click();
	
	default void click3Times() {
		clickNTimes(3);
	}
	
	private void clickNTimes(int n) {
		for(int i = 0; i < n; i++)
			click();
	}
	
}
