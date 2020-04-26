package src;

public class Roll {

    private int diceValue;
    private int nbRoll;
    private int modifier;
    public enum RollType {
        NORMAL,
        ADVANTAGE,
        DISADVANTAGE
    }

    // Attributes

    public Roll(String formula) {
        // TODO

    }

    public Roll(int diceValue, int nbRoll, int modifier) {

        this.diceValue = diceValue;
        this.nbRoll = nbRoll;
        this.modifier = modifier ;

    }

    public int makeRoll(RollType rollType) {
        if(diceValue >= 4){
            return 4;
        }
        else if(diceValue <3){
            return -1;
        }

        int result = (diceValue*nbRoll)+modifier ;
        return result ;
    }

}
