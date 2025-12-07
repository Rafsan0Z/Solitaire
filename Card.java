public class Card {

    String hand;
    String value;

    public Card(String hand, String value){
        this.hand = hand;
        this.value = value;
    }

    public String toString(){

        String result = "";

        result += "#" + hand + "#" + "\n";

        result += " " + value +" " + "\n";

        result += "###";

        return result;

    }
    
}
