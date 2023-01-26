package pk;
import java.util.Arrays;

public class Score {

    public static int roundScore(Faces[] rollOutcomes) {
        int roundTotal = 0;
        int skullCount = 0;
        for (Faces i: rollOutcomes){
            if(i == Faces.GOLD || i == Faces.DIAMOND){
                //System.out.println("* Earned 100 pts *");
                roundTotal += 100;
            }
            else if(i == Faces.SKULL){
                skullCount++;
                if (skullCount == 3){
                    return 0;
                }
            }
        }
        return roundTotal;
    }

}
