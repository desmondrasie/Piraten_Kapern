package pk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Strategies {

    public static ArrayList<Faces> random(ArrayList<Faces> rollOutcomes){
        ArrayList<Faces> keepFaces = new ArrayList<>();
        keepFaces = (ArrayList)rollOutcomes.clone();
        int skullCount = 0;
        int index = 0;
        int numReroll = 0;

        skullCount = Score.numOfSkulls(keepFaces);
        Collections.sort(keepFaces);

        for(int i = 0; i < skullCount; i++){
            index = keepFaces.size() - 1;
            keepFaces.remove(index);
        }

        Collections.shuffle(keepFaces);
        Random diceReroll = new Random();
        numReroll = diceReroll.nextInt(2, 8-skullCount);

        for (int i = 0; i < numReroll; i++) {
            keepFaces.remove(0);
        }
        return keepFaces;
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

    public static ArrayList<Faces> seaBattle(ArrayList<Faces> rollOutcomes, String card, int numOfSabres, int bonusPoints){
        ArrayList<Faces> keepFaces = new ArrayList<>();

        for(Faces value: rollOutcomes){
            if(value == Faces.SABER){
                keepFaces.add(value);
            }
        }
        return keepFaces;
    }
}
