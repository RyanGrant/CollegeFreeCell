package test;

import code.*;
import static org.junit.Assert.*;
import org.junit.*;

public class DeckTest {
	Deck d = new Deck();
	@Test
	public void testDeck() {
		Deck d = new Deck();
		assertNotNull(d);
	}

	@Test
	public void testIsEmpty() {
		Deck d = new Deck();
		for (int i = 0; i < 52; i++) {
			d.deal();
		}
		assertTrue(d.isEmpty());
	}

	@Test
	public void testDeal() {
		Deck d = new Deck();
		Card actual = d.deal();
		assertEquals(13, actual.getRank());
	}
}
