import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Deck {

    HashMap<Integer, Card> Players = new HashMap<Integer, Card>();

    Deck()
    {
        CreateDeck(50);
    }

    //Creates cards and shuffles deck and assigns cards to players
    private void CreateDeck(int NumCards)
    {
        SecureRandom rand = new SecureRandom();

        int indexAdditions = rand.nextInt(1000) - NumCards;

        ArrayList<Integer> indexes = new ArrayList<Integer>();

        for(int x = 0; x < NumCards; x++)
        {
            indexes.add(x+indexAdditions);
        }

        Collections.shuffle(indexes);

        //assignment
        for(int x = 0; x < NumCards/2; x++)
        {
            Players.put(1,new Card(indexes.get(x)));
        }
        for(int x = NumCards/2; x < NumCards; x++)
        {
            Players.put(2,new Card(indexes.get(x)));
        }

    }
}
