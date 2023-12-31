import java.lang.Math;
import pk.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PiratenKarpen {
    private static final Logger logger = LogManager.getLogger(PiratenKarpen.class);
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        int gamesPlayed = 42;

        double p1WinPercent;
        double p2WinPercent;
        System.out.println("Welcome to Piraten Karpen Simulator!");
        for(int i = 0; i < gamesPlayed; i++){
            System.out.println();
            System.out.println("***** NEW GAME *****");
            System.out.println();
            if(Game.winner(args).equals("P1")){
                player1.numOfWins++;
            }
        }

        p1WinPercent = player1.numOfWins/42.0;
        p2WinPercent = 1-p1WinPercent;
        System.out.println();
        System.out.println("~ Win Percentages After "+gamesPlayed+" Games Simulated ~");
        System.out.println("Player 1 | Win% = "+Math.round(p1WinPercent*10000)/100.0+"%");
        System.out.println("Player 2 | Win% = "+Math.round(p2WinPercent*10000)/100.0+"%");

        //********** Print Statements used to show important info in game play **********
        //********** Log Statements used to show player decisions **********
    }
}
