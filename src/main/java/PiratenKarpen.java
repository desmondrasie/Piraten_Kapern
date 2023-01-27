import java.lang.Math;
import pk.*;

import java.util.Arrays;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class PiratenKarpen {
    private static final Logger logger = LogManager.getLogger(PiratenKarpen.class);
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        double p1WinPercent;
        double p2WinPercent;
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("------------------------------------");

        for(int i = 0; i < 42; i++){
            if(Game.winner() == 1){
                player1.numOfWins++;

            }
        }

        logger.trace("Logger Test Working");

        p1WinPercent = player1.numOfWins/42.0;
        p2WinPercent = 1-p1WinPercent;

        System.out.println("Player 1 | Win% = "+Math.round(p1WinPercent*10000)/100.0+"%");
        System.out.println("Player 2 | Win% = "+Math.round(p2WinPercent*10000)/100.0+"%");

    }
}
