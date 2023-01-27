import java.lang.Math;
import pk.Dice;
import pk.Faces;
import pk.Score;
import pk.Turn;
import pk.Game;

import java.util.Arrays;
import java.util.ArrayList;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class PiratenKarpen {

    public static void main(String[] args) {
        Player player1 = new Player
        int p1wins = 0;
        double p1WinPercent;
        double p2WinPercent;
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("------------------------------------");

        for(int i = 0; i < 42; i++){
            if(Game.winner() == 1){
                p1wins++;
            }
        }
        p1WinPercent = p1wins/42.0;
        p2WinPercent = 1-p1WinPercent;

        System.out.println("Player 1 | Win% = "+Math.round(p1WinPercent*10000)/100.0+"%");
        System.out.println("Player 2 | Win% = "+Math.round(p2WinPercent*10000)/100.0+"%");

    }

}
