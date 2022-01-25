package november30;

import java.util.*;

public class Level5 {

	private static final int[][] TABLE = {
	        {2345,372,2020,6233,2033,44,989,340,437,2021},
	        {-33,-4,45,749,5288,33,17234,67123,153,925},
	        {34,55,3,5,234,7592,443,3476,361,567},
	        {846,7077,97823,947,7028,5829,4341,2854,787,69},
	        {55,-123,582,-1000,-999999999,6,82021,4561,12346,1288},
	        {6,234,823,234,345,767,7,4812,1371,3025},
	        {777,1234,917,2395,-10101,75982,55455,4543,3471,23455},
	        {7,4,404,456,3030,273,91784,8734,1337,625},
	        {909,267,23,566,29598,-283,4577,345,1236,420},
	        {8,4762,111,7154,362,482,98765,232323,6132,34256}
	    };
	    
	    private static final List<String> LOCATION_NAMES = List.of(
	        "School",
	        "Literally Nowhere",
	        "The Timeout Corner",
	        "Ayuj's House",
	        "The Depths of your Conscience",
	        "The Moon",
	        "Flavortown USA",
	        "A Building",
	        "The Internet",
	        "A Penguin's Random House"
	    );
	    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.nextLine(), b = in.nextLine();
	        System.out.println(TABLE[LOCATION_NAMES.indexOf(a)][LOCATION_NAMES.indexOf(b)]);
	    }
	
}
