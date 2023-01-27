package pk;
import java.util.Arrays;
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