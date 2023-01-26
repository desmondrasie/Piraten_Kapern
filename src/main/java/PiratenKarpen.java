import pk.Dice;
import pk.Faces;
import pk.Score;
import java.util.Arrays;

public class PiratenKarpen {

    public static void main(String[] args) {
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("------------------------------------");
        System.out.println("Player 1 Rolls 8 Dice: ");
        Dice myDice = new Dice();
        Faces[] rollsOutcome = new Faces[8];
        rollsOutcome = myDice.rollEight();
        System.out.println(Arrays.toString(rollsOutcome));
        //System.out.println(Arrays.toString(myDice.rollEight()));
        System.out.print("Round Score: ");
        System.out.println(Score.roundScore(rollsOutcome));
    }

}
