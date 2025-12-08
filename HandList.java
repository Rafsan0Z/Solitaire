public class HandList<E extends Card> extends CardList<E>{

    // All cards in such a list have the same hand
    String hand;

    public HandList(String hand){

        super();
        this.hand = hand;

    }

    public String getHand(){return this.hand;}

    
}
