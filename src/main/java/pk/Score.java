package pk;
import java.util.ArrayList;

public class Score {

    public static int roundScore(ArrayList<Faces> rollOutcomes) {
        int roundTotal = 0;

        int[] diceOutcome = new int[6];

        for (Faces i: rollOutcomes){
            if(i == Faces.GOLD){
                diceOutcome[0]++;
                roundTotal += 100;
            }
            else if(i == Faces.DIAMOND){
                diceOutcome[1]++;
                roundTotal += 100;
            }
            else if(i == Faces.MONKEY){
                diceOutcome[2]++;
            }
            else if(i == Faces.PARROT){
                diceOutcome[3]++;
            }
            else if(i == Faces.SABER){
                diceOutcome[4]++;
            }
            else if(i == Faces.SKULL){
                diceOutcome[5]++;
                if (diceOutcome[5] == 3){
                    return -1;
                }
            }
        }
        roundTotal += xOfAKindScore(diceOutcome);
        return roundTotal;
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
    public static int xOfAKindScore(int[] diceOutcome){
        int points = 0;

        for(int i = 0; i < diceOutcome.length-1; i++){
            if(diceOutcome[i] == 3){
                points += 100;
            }
            else if(diceOutcome[i] == 4){
                points += 200;
            }
            else if(diceOutcome[i] == 5){
                points += 500;
            }
            else if(diceOutcome[i] == 6){
                points += 1000;
            }
            else if(diceOutcome[i] == 7){
                points += 2000;
            }
            else if(diceOutcome[i] == 8){
                points += 4000;
            }
        }
        return points;
    }
}


//    public static int roundScore(ArrayList<Faces> rollOutcomes) {
//        int roundTotal = 0;
//        int skullCount = 0;
//
//        int[] diceOutcome = new int[5];
//        for (Faces i: rollOutcomes){
//            if(i == Faces.GOLD || i == Faces.DIAMOND){
//                //System.out.println("* Earned 100 pts *");
//                roundTotal += 100;
//            }
//            else if(i == Faces.SKULL){
//                skullCount++;
//                if (skullCount == 3){
//                    return -1;
//                }
//            }
//
//        }
//
//        return roundTotal;
//    }