package pk;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

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
            System.out.println(rollOutcomes);
        }
        return rollOutcomes;
    }

//    public static Faces[] rollAllDice(int numOfDice){
//        Faces[] rollOutcomes = new Faces[numOfDice];
//        for (int i = 0; i < numOfDice; i++) {
//            rollOutcomes[i] = roll();
//        }
//        return rollOutcomes;
//    }
}
