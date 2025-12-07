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

    static ArrayList<CardList> Hands = new ArrayList<>();

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

        // for(int i = 0; i < 4; i++){
        //     //System.out.println( deck.forEach(type -> type.get(i).toString() ));

        //     String line = "";

        //     for(int j = 0; j < 13; j++){

        //         // line += Deck.get(j).get(i);
        //         // if(j == 3) line += "\n";
        //         // else line += "      ";

        //         line += Deck.get(i).get(j) + "\n\n";

        //     }

        //     System.out.println(line);

        // }

        CardList<Card> redCards = new CardList<>();
        CardList<Card> blackCards = new CardList<>();

        Deck.forEach(type -> {

            if(type.getColor() == "B") blackCards.addAll(type);
            else if (type.getColor() == "R") redCards.addAll(type);

        });

        //redCards.forEach(type -> System.out.println(type.toString()));
        //blackCards.forEach(type -> System.out.println(type.toString()));
        
        ArrayList<CardList<Card>> slots = new ArrayList<>(8);
        slots.add(new CardList<Card>());

        //Lets fill slot 1
        int size = 0;

        while(size <= 8){

            if(size == 0) {
                slots.get(0).add(redCards.get(0));
                redCards.remove(0);
            }
            else {

                if(slots.get(0).getLast().getColor() == "R"){
                    slots.get(0).add(blackCards.get(1));
                    blackCards.remove(1);
                }
                else{
                    slots.get(0).add(redCards.get(1));
                    redCards.remove(1);
                }

            }

            size = slots.get(0).size();
            //System.out.println(size);
        }

        slots.get(0).forEach(type -> System.out.println(type.toString()));

    }

    private static void createHand(){


        int limit = 13;
        for(int i = 0; i < limit; i++){

            switch (i) {
                case 0:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "A", type.getColor())) );

                    deck.forEach(type -> type.add("A"  ));
                    break;
                
                case 10:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "J", type.getColor())) );

                    deck.forEach(type -> type.add("J"  ));
                    break;

                case 11:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "Q", type.getColor())) );

                    deck.forEach(type -> type.add("Q"  ));
                    break;

                case 12:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "K", type.getColor())) );

                    deck.forEach(type -> type.add("K"  ));
                    break;

                default:
                    String entry = "" + (i+1);

                    Deck.forEach(type -> type.add(new Card(type.getHand(), entry, type.getColor())) );

                    deck.forEach(type -> type.add( entry  ));
                    break;
            }

        }

    }
    
}
