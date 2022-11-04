import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Deck {

    HashMap<Card, Integer> players = new HashMap<Card,Integer>();

    Deck()
    {
        createDeck(50);
    }

    //Creates cards and shuffles deck and assigns cards to players
    public void createDeck(int numCards)
    {
        SecureRandom rand = new SecureRandom();

        int indexAdditions = rand.nextInt(1000) - numCards;

        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for(int x = 0; x < numCards; x++)
        {
            indexes.add(x+indexAdditions);
        }

        Collections.shuffle(indexes);

        //assignment
        players.clear();
        for(int x = 0; x < numCards /2; x++)
        {
            players.put(new Card(indexes.get(x)),1);
        }
        for(int x = numCards /2; x < numCards; x++)
        {
            players.put(new Card(indexes.get(x)),2);
        }

    }
}
