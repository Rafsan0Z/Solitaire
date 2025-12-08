import java.util.ArrayList;

public class CreateGame {

    static HandList<Card> Hearts = new HandList<>("H");
    static HandList<Card> Clubs = new HandList<>("C");
    static HandList<Card> Spade = new HandList<>("S");
    static HandList<Card> Diamonds = new HandList<>("D");
    static ArrayList<HandList<Card>> Deck = new ArrayList<>();

    public static void main(String args[]){

        Deck.add(Hearts);
        Deck.add(Clubs);
        Deck.add(Spade);
        Deck.add(Diamonds);

        createHand();

        Deck.forEach(type -> System.out.println(type.toString()));

        CardList<Card> redCards = new CardList<>();
        CardList<Card> blackCards = new CardList<>();

        Deck.forEach(type -> {

            type.forEach(card -> {

                if (card.getColor() == "B") blackCards.add(card);
                else if (card.getColor() == "R") redCards.add(card);

            }); 

        });

        System.out.println("RED CARDS BELOW:");

        System.out.println(redCards.toString());

        System.out.println("BLACK CARDS BELOW:");

        System.out.println(blackCards.toString());
        
        ArrayList<CardList<Card>> slots = new ArrayList<>(8);
        slots.add(new CardList<>());
        slots.add(new CardList<>());

        slots.get(0).add(blackCards.findByLocation(12));
        slots.get(1).add(redCards.findByLocation(12));

        System.out.println(slots.get(0).toString());

        int size = slots.get(0).size();
        //int lastValue = 12;

        int currSlot = 0;
        while(size < 13 && currSlot < 2){

            int lastValue = slots.get(currSlot).getLast().getLocation();

            Card nextCard;

            System.out.println(slots.get(currSlot).getLast().getColor() + "||" + lastValue);

            if (slots.get(currSlot).getLast().getColor() == "R") nextCard = blackCards.findByLocation(lastValue - 1);
            else nextCard = redCards.findByLocation(lastValue - 1);

            if (nextCard != null) slots.get(currSlot).add(nextCard);
            size = slots.get(currSlot).size();
            if(size >= 13){
                size = 0;
                currSlot++;
            }
            System.out.println(size + "--" + currSlot);
        }

        System.out.println(slots.get(0).toString());
        System.out.println(slots.get(1).toString());


    }

    private static void createHand(){


        int limit = 13;
        for(int i = 0; i < limit; i++){

            switch (i) {
                case 0:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "A" )) );

                    break;
                
                case 10:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "J" )) );

                    break;

                case 11:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "Q" )) );

                    break;

                case 12:

                    Deck.forEach(type -> type.add(new Card(type.getHand(), "K" )) );

                    break;

                default:
                    String entry = "" + (i+1);

                    Deck.forEach(type -> type.add(new Card(type.getHand(), entry )) );

                    break;
            }

        }

    }
    
}
