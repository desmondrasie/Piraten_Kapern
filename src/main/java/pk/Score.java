package pk;
import java.util.Arrays;

public class Score {

    public static int roundScore(Faces[] rollOutcomes) {
        int roundTotal = 0;
        for (Faces i: rollOutcomes){
            if(i == Faces.GOLD || i == Faces.DIAMOND){
                //System.out.println("* Earned 100 pts *");
                roundTotal += 100;
            }
        }
        return roundTotal;
    }

}
