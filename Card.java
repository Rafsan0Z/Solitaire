public class Card {

    String hand;
    String value;
    String color;

    public Card(String hand, String value){
        this.hand = hand;
        this.value = value;
        this.color = "B";
    }

    public Card(String hand, String value, String color){
        this.hand = hand;
        this.value = value;
        this.color = color;
    }

    public String toString(){

        String result = "";

        //if (this.color == "Red") result += "\\u001B[31m";

        result += "#" + hand + "#" + "\n";

        result += " " + value +" " + "\n";

        result += "#" + color + "#";

        //if (this.color == "Red") result += "\\u001B[0m";

        return result;

    }

    public String getColor(){return color;}
    
}
