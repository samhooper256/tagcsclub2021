package october19;

import java.util.*;
import java.util.regex.*;

public class Level3 {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("(0|[1-9](_*[0-9])*)[Ll]?");
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(p.matcher(line).matches())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
