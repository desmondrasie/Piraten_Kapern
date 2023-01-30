package pk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Collections;

public class Game {
    private static final Logger logger = LogManager.getLogger(Game.class);
    public static String winner(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        player1.mode = args[0];
        player2.mode = args[1];

        ArrayList<String> deck = new ArrayList<>();
        deck = (ArrayList)FortuneCards.allCards.clone();

        while (player1.gamePoints < 6000 | player2.gamePoints < 6000){
            if(deck.size()==0){
                deck = (ArrayList)FortuneCards.allCards.clone();
            }
            Collections.shuffle(deck);
            System.out.println("YOUR TURN: ~ Player 1 ~");
            player1.gamePoints =  player1.gamePoints + Turn.score(player1.mode,deck);
            System.out.println("Player 1 Total Points: "+player1.gamePoints);
            if (player1.gamePoints >= 6000){
                System.out.println("------------------------------------");
                System.out.println("***** GAME OVER *****");
                System.out.println("Player 1 Wins!");
                return "P1";
            }
            if(deck.size()==0){
                deck = (ArrayList) FortuneCards.allCards.clone();
            }
            System.out.println("YOUR TURN: ~ Player 2 ~");
            player2.gamePoints = player2.gamePoints + Turn.score(player2.mode,deck);
            System.out.println("Player 2 Total Points: "+player2.gamePoints);
            if (player2.gamePoints >= 6000){
                System.out.println("------------------------------------");
                System.out.println("***** GAME OVER *****");
                System.out.println("Player 2 Wins!");
                return "P2";

            }
        }
        return "";
    }

}
