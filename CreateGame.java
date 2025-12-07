import java.util.ArrayList;

public class CreateGame {

    
    static ArrayList<String> hearts = new ArrayList<>();
    static ArrayList<String> clubs = new ArrayList<>(); 
    static ArrayList<String> spade = new ArrayList<>();
    static ArrayList<String> diamonds = new ArrayList<>();

    static ArrayList<ArrayList> deck = new ArrayList<>();


    static CardList<Card> Hearts = new CardList<>("H");
    static CardList<Card> Clubs = new CardList<>("C");
    static CardList<Card> Spade = new CardList<>("S");
    static CardList<Card> Diamonds = new CardList<>("D");
    static ArrayList<CardList> Deck = new ArrayList<>();

    public static void main(String args[]){

        deck.add(hearts);
        deck.add(clubs);
        deck.add(spade);
        deck.add(diamonds);

        Deck.add(Hearts);
        Deck.add(Clubs);
        Deck.add(Spade);
        Deck.add(Diamonds);

        // hearts.add("h");
        // clubs.add("c");
        // spade.add("s");
        // diamonds.add("d");

        createHand();

        for(int i = 0; i < 13; i++){
            //System.out.println( deck.forEach(type -> type.get(i).toString() ));

            String line = "";

            for(int j = 0; j < 4; j++){

                // line += Deck.get(j).get(i);
                // if(j == 3) line += "\n";
                // else line += "      ";

                line += Deck.get(j).get(i) + "\n\n";

            }

            System.out.println(line);

        }

        

    }

    private static void createHand(){


        int limit = 13;
        for(int i = 0; i < limit; i++){

            switch (i) {
                case 0:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "A")) );

                    deck.forEach(type -> type.add("A"  ));
                    break;
                
                case 10:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "J")) );

                    deck.forEach(type -> type.add("J"  ));
                    break;

                case 11:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "Q")) );

                    deck.forEach(type -> type.add("Q"  ));
                    break;

                case 12:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "K")) );

                    deck.forEach(type -> type.add("K"  ));
                    break;

                default:
                    String entry = "" + (i+1);

                    Deck.forEach(type -> type.add(new Card(type.getHand(), entry)) );

                    deck.forEach(type -> type.add( entry  ));
                    break;
            }

        }

    }
    
}
