package february15;

import java.util.List;

import utils.*;

public class Level1Generator {

	private static final int MIN_CHARACTERS = 1, MAX_CHARACTERS = 100, LINES = 1000;
	
	public static void main(String[] args) {
		List<String> list =Colls.list(
				LINES,() -> Strings.random(MIN_CHARACTERS, MAX_CHARACTERS, Generators.Char.ASCII_SPACE_OR_VISIBLE));
		IO.write("src/february15/level1in.txt", list);
		IO.write("src/february15/level1out.txt", Misc.concat(list));
	}
	
}
