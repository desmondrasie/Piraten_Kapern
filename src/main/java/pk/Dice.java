package pk;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;

public class Dice {

    public static Faces roll() {
        int howManyFaces = Faces.values().length;
//        System.out.println("  (DEBUG) there are " + howManyFaces + " faces");
//        System.out.println("  (DEBUG) " + Arrays.toString(Faces.values()));
        Random bag = new Random();
        return Faces.values()[bag.nextInt(howManyFaces)];
    }

    public static ArrayList<Faces> rollEight() {
        ArrayList<Faces> rollOutcomes = new ArrayList<Faces>();
        for (int i = 0; i < 8; i++){
            rollOutcomes.add(roll());
        }
        return rollOutcomes;
    }

    public static ArrayList<Faces> rollAll(int numOfDice, int skullCount,ArrayList<Faces> remainingDice){
        ArrayList<Faces> rollOutcomes = new ArrayList<Faces>();
        for (int i = 0; i < numOfDice; i++) {
            rollOutcomes.add(roll());
        }
        for (int j = 0; j < skullCount; j++){
            rollOutcomes.add(Faces.SKULL);
        }
        rollOutcomes.addAll(remainingDice);
        return rollOutcomes;

    }
}
