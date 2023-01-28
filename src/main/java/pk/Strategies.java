package pk;
import java.util.HashMap;
import java.util.ArrayList;

public class Strategies {

    public static void random(){
        System.out.println("do something");
    }


    public static ArrayList<Faces> maxCombos(ArrayList<Faces> rollOutcomes){

        int[] quantityTracker = new int[6];
        int numOfSkulls = 0;
        int maxValue = 0;
        int maxIndex = 0;
        Faces value;

        quantityTracker = Score.quantityOutcome(rollOutcomes);
        numOfSkulls = quantityTracker[quantityTracker.length-1];
        quantityTracker[quantityTracker.length-1] = 0;

        for(int i = 0; i <quantityTracker.length; i++){
            if (quantityTracker[i] > maxValue){
                maxValue = quantityTracker[i];
                maxIndex = i;
            }
        }
        value = IndexOfFace.mapFace(maxIndex);


        return rollOutcomes;

        }


}
