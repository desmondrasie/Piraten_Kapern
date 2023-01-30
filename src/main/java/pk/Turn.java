package pk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Collections;

public class Turn {
    private static final Logger logger = LogManager.getLogger(Turn.class);
//    public static FortuneCards deck = new FortuneCards();

    public static int score(String mode,ArrayList<String> deck){
        ArrayList<String> refill = new ArrayList<>();
        refill = (ArrayList)FortuneCards.allCards.clone();
        String card = deck.get(0);
        System.out.println(("Player Draws This Card For The Round: "+FortuneCards.mapCard(card)));
        deck.remove(0);
        if(deck.size() == 0){
            deck = refill;
        }

        int numReroll = 8;
        int skullCount = 0;
        int basePoints = 0;

        ArrayList<Faces> remainingDice = new ArrayList<Faces>();

        while(true){
            ArrayList<Faces> rollOutcomes = new ArrayList<Faces>();
            rollOutcomes = Dice.rollAll(numReroll,skullCount,remainingDice);
            Collections.sort(rollOutcomes);
            System.out.println("Player Rolled: "+rollOutcomes);

            int roundScore = Score.roundScore(rollOutcomes,card);

            if(roundScore == -1){
                logger.trace("3 Skulls! Your Turn Ends With 0 pts.");
                return 0;
            }
            else if(roundScore == -2) {
                logger.trace("Lost Sea Battle! -300 points");
                return -300;
            }
            else if(roundScore == -3) {
                logger.trace("Lost Sea Battle! -500 points");
                return -500;
            }
            else if(roundScore == -4) {
                logger.trace("Lost Sea Battle! -1000 points");
                return -1000;
            }

            else{
                basePoints = roundScore;
                logger.trace("Total Points For Turn: "+basePoints);

            }
            if(card.equals("SB2")){
                int numOfSabres = 2;
                int bonusPoints = 300;
                if (Score.quantityOutcome(rollOutcomes)[4] >= numOfSabres){
                    logger.trace("Won Sea Battle! +"+bonusPoints+" Bonus points");
                    return basePoints + bonusPoints;
                }
                remainingDice = Strategies.seaBattle(rollOutcomes);

            }
            else if(card.equals("SB3")){
                int numOfSabres = 3;
                int bonusPoints = 500;
                if (Score.quantityOutcome(rollOutcomes)[4] >= numOfSabres) {
                    logger.trace("Won Sea Battle! +"+bonusPoints+" Bonus points");
                    return basePoints + bonusPoints;
                }
                remainingDice = Strategies.seaBattle(rollOutcomes);
            }
            else if(card.equals("SB4")){
                int numOfSabres = 4;
                int bonusPoints = 1000;
                if (Score.quantityOutcome(rollOutcomes)[4] >= numOfSabres) {
                    logger.trace("Won Sea Battle! +"+bonusPoints+" Bonus points");
                    return basePoints + bonusPoints;
                }
                remainingDice = Strategies.seaBattle(rollOutcomes);
            }
            else if(card.equals("MB")) {
                if (basePoints >= 1000) {
                    return basePoints;
                }
                int[] quantities = Score.quantityOutcome(rollOutcomes);
                int maxValue = 0;
                for (int i = 0; i < quantities.length; i++) {
                    if (quantities[i] > maxValue) {
                        maxValue = quantities[i];
                    }
                }
                if ((quantities[2] + quantities[3]) > maxValue) {
                    remainingDice = Strategies.monkeyBusiness(rollOutcomes);
                }
                else{
                    remainingDice = Strategies.maxCombos(rollOutcomes);
                }
            }
            // COMBO & RANDOM STRATEGIES
            else if(mode.equals("combo")){
                if (basePoints >= 1000) {
                    logger.trace("Player is done with their turn!");
                    return basePoints;
                }
                logger.trace("Player wants to roll again!");
                remainingDice = Strategies.maxCombos(rollOutcomes);
            }

            else if (mode.equals("random")){
                Random coinToss = new Random();
                int toss = coinToss.nextInt(2);
                if (toss == 0){
                    logger.trace("Player is done with their turn!");
                    return basePoints;
                }
                else{
                    logger.trace("Player wants to roll again!");
                }
                remainingDice = Strategies.random(rollOutcomes);

            }
            skullCount = Score.numOfSkulls(rollOutcomes);
            numReroll = 8 - remainingDice.size() - skullCount;

            if (numReroll < 2){
                logger.trace("Player is done with their turn! *No more rerolls*! ");
                return basePoints;
            }

        }


    }

}
