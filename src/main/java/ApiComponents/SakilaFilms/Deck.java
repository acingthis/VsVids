package ApiComponents.SakilaFilms;

import ApiComponents.SakilaFilms.Card;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Deck {

    HashMap<Card, Integer> Players = new HashMap<Card,Integer>();

    Deck()
    {
        CreateDeck(50);
    }

    //Creates cards and shuffles deck and assigns cards to players
    public void CreateDeck(int NumCards)
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
        Players.clear();
        for(int x = 0; x < NumCards/2; x++)
        {
            Players.put(new Card(indexes.get(x)),1);
        }
        for(int x = NumCards/2; x < NumCards; x++)
        {
            Players.put(new Card(indexes.get(x)),2);
        }

    }
}
