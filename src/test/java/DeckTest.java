import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckTest {

    Deck testDeck = new Deck();

    @Test
    void testCreateDeck()
    {
        testDeck.createDeck(10);

        Assertions.assertEquals(10,testDeck.players.size(), "The size of the players hashmap is incorrect");
    }
}
