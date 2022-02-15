package utils;

public final class Generators {

	private Generators() {
		
	}
	
	public static final class Char {
		
		private Char() {
			
		}
		
		public static final CharSupplier ASCII = () -> (char) RNG.intInclusive(utils.ASCII.MIN, utils.ASCII.MAX);
		public static final CharSupplier ASCII_VISIBLE =
			() -> (char) RNG.intInclusive(utils.ASCII.MIN_VISIBLE, utils.ASCII.MAX_VISIBLE);
		public static final CharSupplier ASCII_SPACE_OR_VISIBLE =
			() -> (char) RNG.intInclusive(' ', utils.ASCII.MAX_VISIBLE);
			
	}
	
}
