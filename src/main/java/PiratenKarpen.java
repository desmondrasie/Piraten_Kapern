import pk.Dice;
import pk.Faces;
import pk.Score;
import java.util.Arrays;
import java.util.ArrayList;

public class PiratenKarpen {

    public static void main(String[] args) {
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("------------------------------------");
        System.out.println("Player 1 Rolls 8 Dice: ");
        Dice myDice = new Dice();
        ArrayList<Faces> rollsOutcome = new ArrayList<Faces>();
        rollsOutcome = myDice.rollEight();
        System.out.println(rollsOutcome);
        System.out.print("Round Score: ");
        System.out.println(Score.roundScore(rollsOutcome));
    }

}
