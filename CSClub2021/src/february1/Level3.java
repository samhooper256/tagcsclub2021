package february1;

import java.util.*;

public class Level3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();
        
        while(in.hasNextLine()) {
            String line = in.nextLine();
            int i = line.lastIndexOf(' ');
            int score = Integer.parseInt(line.substring(i + 1));
            String name = line.substring(0, i);
            teams.add(new Team(name, score));
        }
        
        Team h = Collections.max(teams);
        Team l = Collections.min(teams);
        
        System.out.printf("Highest: %s (%d)%n", h.name, h.score);
        System.out.printf("Lowest: %s (%d)%n", l.name, l.score);
    }
    
}

class Team implements Comparable<Team> {
    
    String name;
    int score;
    
    Team(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    @Override
    public int compareTo(Team o) {
         if(this.score < o.score)
             return -1;
        if(this.score == o.score)
            return 0;
        return 1;
    }
    
}