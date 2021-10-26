package october19;

import java.util.*;
import java.util.regex.*;

public class Level5 {

    private static final Pattern
        BASE_2_NO_L = Pattern.compile("(?i)0b[01](_*[01])*"),
        BASE_8_NO_L = Pattern.compile("(?i)0(_*[0-7])+"),
        BASE_10_NO_L = Pattern.compile("(?i)0|[1-9](_*[0-9])*"),
        BASE_16_NO_L = Pattern.compile("(?i)0x[0-9a-f](_*[0-9a-f])*");
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line.endsWith("l") || line.endsWith("L"))
            line = line.substring(0, line.length() - 1);
        if(BASE_2_NO_L.matcher(line).matches())
            System.out.println(Integer.parseInt(line.substring(2).replace("_", ""), 2));
        else if(BASE_8_NO_L.matcher(line).matches())
            System.out.println(Integer.parseInt(line.substring(1).replace("_", ""), 8));
        else if(BASE_10_NO_L.matcher(line).matches())
            System.out.println(line.replace("_", ""));
        else if(BASE_16_NO_L.matcher(line).matches())
            System.out.println(Integer.parseInt(line.substring(2).replace("_", ""), 16));
        else
            System.out.println("NO");
    }
    
}