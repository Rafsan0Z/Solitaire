import java.util.ArrayList;

public class CardList<E> extends ArrayList<E>{
    
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

    //public String getHand() {return hand;}

    //public String getColor() {return color;}

    public String toString(){

        int total = this.size();
        int index = 0;
        String result = "";
        String topString = "";
        String middleString = "";

        while(index < total){

            topString += "#" + this.get(index).getHand() + "#" + "  ";
            middleString += " " + this.get(index).getValue() + " ";
            index++;

        }

        String bottomString = "###" + " ";

        result += topString + "\n";
        result += middleString + "\n";
        result += bottomString.repeat(total) + "\n";

        return result;


    }

}
