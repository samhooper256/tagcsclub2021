package november30;

import java.util.Scanner;

public class Level4 {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        Level4 s = new Level4(line);
        System.out.println(s.validate());
    }
    
    int index = 0;
    String line;
        
    Level4(String myLine) {
        line = myLine;
    }
    
    boolean validate() {
        if(!find("int"))
            return false;
        if(!skipAndFind("["))
            return false;
        if(!skipAndFind("]"))
            return false;
        skipSpace();
        char first = line.charAt(index);
        if(!Character.isLetter(first))
            return false;
        int nextSpace = line.indexOf(' ', index);
        int nextEquals = line.indexOf('=', index);
        int endOfName;
        if(nextSpace == -1) {
            if(nextEquals == -1) {
                return false;
            }
            endOfName = nextEquals;
        }
        else {
            endOfName = Math.min(nextSpace, nextEquals);
        }
        String name = line.substring(index, endOfName);
        if(!validateName(name))
            return false;
       index = endOfName;
        if(!skipAndFind("="))
            return false;
        if(!skipAndFind("{"))
            return false;
        if(!skipAndFindDigit()) {
            return skipAndFind("}") && skipAndFind(";");
        }
        while(skipAndFind(",")) {
            if(!skipAndFindDigit())
                return false;
        }
        return skipAndFind("}") && skipAndFind(";");
    }
    
    boolean skipAndFindDigit() {
        skipSpace();
        char first = line.charAt(index);
        if(!Character.isDigit(first))
            return false;
        while(index < line.length() && Character.isDigit(line.charAt(index)))
            index++;
        return true;
    }
    
    boolean validateName(String name) {
      for(char c : name.toCharArray()) {
          if(!Character.isLetter(c) && !Character.isDigit(c) && c != '_')
              return false;
      }    
      return true;
        
    }
    
    boolean skipAndFind(String text) {
        skipSpace();
        return find(text);
    }
    
    boolean find(String text) {
       if(line.substring(index).startsWith(text)) {
           index += text.length();
           return true;
       }
        return false;
    }
    
    void skipSpace() {
        while(index < line.length() && line.charAt(index) == ' ')
            index++;
    }
    
}
