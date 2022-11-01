import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckTest {

    Deck testDeck = new Deck();

    @Test
    public void testCreateDeck()
    {
        testDeck.CreateDeck(10);

        Assertions.assertEquals(10,testDeck.Players.size(), "The size of the players hashmap is incorrect");
    }
}
