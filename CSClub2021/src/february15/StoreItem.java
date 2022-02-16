package february15;

class StoreItem {
	
	private final int length; //inches
	private final double price; //dollars
	
	public StoreItem(int length, double price) {
		this.length = length;
		this.price = price;
	}
	
	public int length() {
		return length;
	}
	
	public double price() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%d in. for $%.2f", length(), price());
	}
	
}