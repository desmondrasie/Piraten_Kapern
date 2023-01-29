package pk;

import java.util.Arrays;
import java.util.ArrayList;

public class FortuneCards {

    public static ArrayList<String> allCards = new ArrayList<>(Arrays.asList(
            "SB2","SB2","SB3","SB3","SB4","SB4",
            "nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop",
            "nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop","nop"));

    public static String mapCard(String card){
        if (card.equals("SB2") | card.equals("SB3") | card.equals("SB4")){
            return "SEA BATTLE";
        }
        else if(card.equals("nop")){
            return "NOP CARD";
        }
        else{
            return "";
        }
    }

}
