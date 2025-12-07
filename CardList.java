import java.util.ArrayList;

public class CardList<E> extends ArrayList<E>{
    
    String hand;
    private String color = "B";

    public CardList(String hand){

        super();
        this.hand = hand;
        if (hand == "H" || hand == "D") this.color = "R";

    }

    public CardList(){
        super();
    }

    public CardList(int size){
        super(size);
    }

    public String getHand() {return hand;}

    public String getColor() {return color;}

    // public String toString(){

    //     String result = "";



    //     return result;


    // }

}
