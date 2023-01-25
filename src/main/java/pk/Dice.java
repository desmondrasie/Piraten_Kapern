package pk;
import java.util.Arrays;
import java.util.Random;

public class Dice {

    public static Faces roll() {
        int howManyFaces = Faces.values().length;
//        System.out.println("  (DEBUG) there are " + howManyFaces + " faces");
//        System.out.println("  (DEBUG) " + Arrays.toString(Faces.values()));
        Random bag = new Random();
        return Faces.values()[bag.nextInt(howManyFaces)];
    }

    public static Faces[] rollEight() {
        Faces[] rollOutcomes = new Faces[8];
        for (int i = 0; i < 8; i++){
            rollOutcomes[i] = roll();
        }
        return rollOutcomes;
    }
}
