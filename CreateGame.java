import java.util.ArrayList;

public class CreateGame {

    
    static ArrayList<String> hearts = new ArrayList<>();
    static ArrayList<String> clubs = new ArrayList<>(); 
    static ArrayList<String> spade = new ArrayList<>();
    static ArrayList<String> diamonds = new ArrayList<>();

    static ArrayList<ArrayList> deck = new ArrayList<>();
    //static ArrayList<String> deck_symbols = new ArrayList<>();


    public static void main(String args[]){

        deck.add(hearts);
        deck.add(clubs);
        deck.add(spade);
        deck.add(diamonds);

        hearts.add("h");
        clubs.add("c");
        spade.add("s");
        diamonds.add("d");

        createHand();

        for(int i = 0; i < 14; i++){
            //System.out.println( deck.forEach(type -> type.get(i).toString() ));

            String line = "";

            for(int j = 0; j < 4; j++){

                line += deck.get(j).get(i);
                if(j == 3) line += "\n";
                else line += "      ";

            }

            System.out.println(line);

        }


    }

    private static void createHand(){

        for(int i = 1; i < 14; i++){

            switch (i) {
                case 1:
                    deck.forEach(type -> type.add("A" + "_" + type.get(0) ));
                    break;
                
                case 11:
                    deck.forEach(type -> type.add("J" + "_" + type.get(0) ));
                    break;

                case 12:
                    deck.forEach(type -> type.add("Q" + "_" + type.get(0) ));
                    break;

                case 13:
                    deck.forEach(type -> type.add("K" + "_" + type.get(0) ));
                    break;

                default:
                    String entry = "" + i;
                    deck.forEach(type -> type.add( entry + "_" + type.get(0) ));
                    break;
            }

        }

    }
    
}
