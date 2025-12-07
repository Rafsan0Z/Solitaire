import java.util.ArrayList;

public class CardList<E> extends ArrayList<E>{
    
    String hand;

    public CardList(String hand){

        super();
        this.hand = hand;

    }

    public String getHand() {return hand;}

    // public String toString(){

    //     String result = "";



    //     return result;


    // }

}
