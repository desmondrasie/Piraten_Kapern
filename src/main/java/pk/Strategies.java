package pk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Strategies {

    public static ArrayList<Faces> random(ArrayList<Faces> rollOutcomes){
        int skullCount = 0;
        int index = 0;
        int numReroll = 0;

        skullCount = Score.numOfSkulls(rollOutcomes);
        Collections.sort(rollOutcomes);

        for(int i = 0; i < skullCount; i++){
            index = rollOutcomes.size() - 1;
            rollOutcomes.remove(index);
        }

        Collections.shuffle(rollOutcomes);
        Random diceReroll = new Random();
        numReroll = diceReroll.nextInt(2, 8-skullCount);

        for (int i = 0; i < numReroll; i++) {
            rollOutcomes.remove(0);
        }
        return rollOutcomes;
    }


    public static ArrayList<Faces> maxCombos(ArrayList<Faces> rollOutcomes){
        ArrayList<Faces> keepFaces = new ArrayList<>();

        int[] quantityTracker = new int[6];
        int maxValue = 0;
        int maxIndex = 0;
        Faces value;

        quantityTracker = Score.quantityOutcome(rollOutcomes);
        quantityTracker[quantityTracker.length-1] = 0;

        for(int i = 0; i <quantityTracker.length; i++){
            if (quantityTracker[i] > maxValue){
                maxValue = quantityTracker[i];
                maxIndex = i;
            }
        }
        value = IndexOfFace.mapFace(maxIndex); //Face of Die with max number of Combos
        for(int i = 0; i < maxValue; i++){
            keepFaces.add(value);
        }
        return keepFaces; // ex. [GOLD, GOLD, GOLD] || [MONKEY, MONKEY, MONKEY, MONKEY]
        }
}
