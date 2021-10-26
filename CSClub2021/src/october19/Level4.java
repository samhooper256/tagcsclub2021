package october19;

import java.util.*;
import java.util.regex.*;

public class Level4 {

    public static void main(String[] args) {
    	Pattern p = Pattern.compile("(?i)0x[0-9a-f](_*[0-9a-f])*L?"); //(?i) makes it case-insensitive
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(p.matcher(line).matches())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}