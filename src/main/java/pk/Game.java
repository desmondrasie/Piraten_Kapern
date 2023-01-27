package pk;


public class Game {

    public static int winner(){
        int p1Points = 0;
        int p2Points = 0;

        while (p1Points < 6000 | p2Points < 6000){
            p1Points = p1Points + Turn.score();
            //System.out.println("Player 1 Points: "+p1Points);
            if (p1Points >= 6000){
                return 1;
            }
            p2Points = p2Points + Turn.score();
            //System.out.println("Player 2 Points: "+p2Points);
            if (p2Points >= 6000){
                return 0;
            }
        }
        return 0;
    }

}
