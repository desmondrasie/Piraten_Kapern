import pk.Dice;
import pk.Faces;
import pk.Score;
import java.util.Arrays;

public class PiratenKarpen {

    public static void main(String[] args) {
        System.out.println("Welcome to Piraten Karpen Simulator!");
        System.out.println("Player 1 Rolls 8 Dice: ");
        Dice myDice = new Dice();
        System.out.println(Arrays.toString(myDice.rollEight()));
    }

}
