package pk;

import java.util.Arrays;
import java.util.ArrayList;

public class FortuneCards {

    public static ArrayList<String> allCards = new ArrayList<>(Arrays.asList(
            "SB2","SB2","SB3","SB3","SB4","SB4",                         //6
            "MB","MB","MB","MB",                                         //4
            "nop","nop","nop","nop","nop","nop","nop","nop","nop","nop", //10
            "nop","nop","nop","nop","nop","nop","nop","nop","nop","nop", //10
            "nop","nop","nop","nop","nop"));                             //5

    public static String mapCard(String card){
        if (card.equals("SB2") | card.equals("SB3") | card.equals("SB4")){
            return "~ SEA BATTLE ~";
        }
        else if(card.equals("nop")){
            return "~ NOP ~";
        }
        else if(card.equals("MB")){
            return "~ MONKEY BUSINESS ~";
        }
        else{
            return "";
        }
    }

}
