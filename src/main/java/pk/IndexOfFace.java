package pk;

public class IndexOfFace {

    public static Faces mapFace(int index) {
        if(index == 0) return Faces.DIAMOND;
        else if(index == 1) return Faces.GOLD;
        else if(index == 2) return Faces.MONKEY;
        else if(index == 3) return Faces.PARROT;
        else if(index == 4) return Faces.SABER;
        else return Faces.SKULL;
    }
}
