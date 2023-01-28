package pk;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Collections;

public class Turn {
    private static final Logger logger = LogManager.getLogger(Turn.class);
    public static int score(){


        int numReroll = 8;
        int skullCount = 0;
        int totalPoints = 0;
        ArrayList<Faces> remainingDice = new ArrayList<Faces>();

        while(true){

            //System.out.println("Player Rolls: ");
            ArrayList<Faces> rollOutcomes = new ArrayList<Faces>();

            rollOutcomes = Dice.rollAll(numReroll,skullCount,remainingDice);
            Collections.sort(rollOutcomes);
            logger.trace(rollOutcomes);

            int roundScore = Score.roundScore(rollOutcomes);

            if(roundScore == -1){
                logger.trace("You Rolled 3 Skulls! Your Turn Ends With 0 pts.");
                return 0;
            }
            else{
                logger.trace("You Survived This Round!" );
                totalPoints += roundScore;
                logger.trace("Total Points: "+totalPoints);

            }

            // Check if player wants to re-roll
            Random coinToss = new Random();
            int toss = coinToss.nextInt(2);
            if (toss == 0){
                logger.trace("Player is done with their turn!");
                return totalPoints;
            }
            else{
                logger.trace("Player wants to roll again!");
            }

            //remainingDice = Strategies.maxCombos(rollOutcomes);
            remainingDice = Strategies.random(rollOutcomes);
            logger.trace("Remaining Dice: "+remainingDice);
            skullCount = Score.numOfSkulls(rollOutcomes);
            numReroll = 8 - remainingDice.size() - skullCount;




            if (numReroll < 2){
                logger.trace("Player is done with their turn! *No more rerolls*! ");
                return totalPoints;
            }





            // Determine how many dice player wants to re-roll
//            Random diceReroll = new Random();
//            numReroll = diceReroll.nextInt(2, 8-Score.numOfSkulls(rollOutcomes));
            //System.out.println("NUMBER OF DICE TO BE REROLLED: " + numReroll);


            // Remove ALL SKULLS from list
//            Collections.sort(rollOutcomes);
            //System.out.println("SORTED LIST: "+ rollOutcomes);
//            skullCount = Score.numOfSkulls(rollOutcomes);
//            for (int i = 0; i < skullCount; i++){
//                int index = rollOutcomes.size() - 1;
//                rollOutcomes.remove(index);
//            }
            //System.out.println("Removed Skulls: " + rollOutcomes);

            //Remove re-rolled dice randomly
//            Collections.shuffle(rollOutcomes);
//            for (int i = 0; i < numReroll; i++){
//                rollOutcomes.remove(0);
//            }
//            remainingDice = rollOutcomes;

            //System.out.println("Remove Rerolls: " + rollOutcomes);


//            System.out.println("\n");
//            System.out.println("----- END OF ROUND -----");
//            System.out.println("\n");

        }


    }

}
