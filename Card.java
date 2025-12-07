public class Card {

    String hand;
    String value;
    String color;
    int location;

    public Card(String hand, String value){
        this.hand = hand;
        this.value = value;
        if (hand == "H" || hand == "D") this.color = "R";
        else this.color = "B";
        setLocation();
    }

    public Card(String hand, String value, String color){
        this.hand = hand;
        this.value = value;
        this.color = color;
        setLocation();
    }

    private void setLocation(){

        switch (value) {
            case "A":
                location = 0;
                break;

            case "J":
                location = 10;
                break;
            
            case "Q":
                location = 11;
                break;
            
            case "K":
                location = 12;
                break;

            default:
                location = Integer.parseInt(value) - 1;
                break;
        }

    }

    public String getValue(){
        return this.value;
    }

    public String getHand(){
        return this.hand;
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
