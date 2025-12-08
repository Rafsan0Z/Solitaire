import java.util.ArrayList;

public class CardList<E extends Card> extends ArrayList<E>{
    
    // String hand;

    // public CardList(String hand){

    //     super();
    //     this.hand = hand;

    // }

    public CardList(){
        super();
    }

    public CardList(int size){
        super(size);
    }

    public Card findByLocation(int location){

        int length = this.size();
        int index = 0;
        Card result = null;

        while(index < length && result == null){

            if(this.get(index).getLocation() == location) result = this.get(index);
            index++;

        }

        return result;

    }

    public String toString(){

        int total = this.size();
        int index = 0;
        String result = "";
        String topString = "";
        String middleString = "";
        String bottomString = "";

        while(index < total){

            Card c = this.get(index);
            topString += "#" + c.getHand() + "#" + "   ";
            middleString += " " + c.getValue() + ( c.getLocation() == 9 ? "   " : "    ");
            bottomString += "#" + c.getColor() + "#" + "   ";
            index++;

        }

        result += topString + "\n";
        result += middleString + "\n";
        result += bottomString + "\n";

        return result;


    }

}
