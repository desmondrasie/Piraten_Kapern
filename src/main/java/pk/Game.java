package pk;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Game {
    private static final Logger logger = LogManager.getLogger(Game.class);
    public static int winner(){
        Player player1 = new Player();
        Player player2 = new Player();

        while (player1.gamePoints < 6000 | player2.gamePoints < 6000){
            player1.gamePoints =  player1.gamePoints + Turn.score();
            logger.trace("Player 1 Points: "+player1.gamePoints);
            if (player1.gamePoints >= 6000){
                logger.trace("Player 1 Wins!");
                return 1;
            }
            player2.gamePoints = player2.gamePoints + Turn.score();
            logger.trace("Player 2 Points: "+player2.gamePoints);
            if (player2.gamePoints >= 6000){
                logger.trace("Player 2 Wins!");
                return 0;
            }
        }
        return 0;
    }

}
