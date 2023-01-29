package pk;
import java.util.ArrayList;

public class Score {

    public static int roundScore(ArrayList<Faces> rollOutcomes, String card) {
        int roundTotal = 0;
        int[] quantityTracker = quantityOutcome(rollOutcomes);

        //Checks for 3 skulls. If a Sea Battle is taking place, player loses points, else 0 points.
        if (quantityTracker[5] >= 3){
            if(card.equals("SB2")){
                return -2;//Check for
            }
            else if(card.equals("SB3")){
                return -3;
            }
            else if(card.equals("SB4")){
                return -4;
            }
            else{
                return -1;
            }
        }
        roundTotal = (quantityTracker[0] + quantityTracker[1])*100; //Accounts for single DIAMOND & GOLD

        if (card.equals("MB")){
            quantityTracker[2] += quantityTracker[3];
            quantityTracker[3] = 0;
        }

        roundTotal += xOfAKindScore(quantityTracker);
        return roundTotal;
    }


    public static int[] quantityOutcome(ArrayList<Faces> rollOutcomes){
        int[] quantityTracker = new int[6];

        for(Faces value : rollOutcomes){
            if(value == Faces.DIAMOND) quantityTracker[0]++;
            else if(value == Faces.GOLD) quantityTracker[1]++;
            else if(value == Faces.MONKEY) quantityTracker[2]++;
            else if(value == Faces.PARROT) quantityTracker[3]++;
            else if(value == Faces.SABER) quantityTracker[4]++;
            else if(value == Faces.SKULL) quantityTracker[5]++;
        }
        return quantityTracker;
    }


    public static int numOfSkulls(ArrayList<Faces> rollOutcomes) {
        int count = 0;
        for (Faces i: rollOutcomes){
            if(i == Faces.SKULL){
                count++;
            }
        }
        return count;
    }


    public static int xOfAKindScore(int[] quantityTracker){
        int points = 0;

        for(int i = 0; i < quantityTracker.length-1; i++){
            if(quantityTracker[i] == 3){
                points += 100;
            }
            else if(quantityTracker[i] == 4){
                points += 200;
            }
            else if(quantityTracker[i] == 5){
                points += 500;
            }
            else if(quantityTracker[i] == 6){
                points += 1000;
            }
            else if(quantityTracker[i] == 7){
                points += 2000;
            }
            else if(quantityTracker[i] == 8){
                points += 4000;
            }
        }
        return points;
    }
}
