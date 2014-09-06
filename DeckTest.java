package simon.game;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DeckTest {

	@Test
	public void test() {
		Deck deck = new Deck();
		assertEquals(52, deck.getCards().size());
	}
	@Test
	public void pickCard() {
		Deck deck = new Deck();
		
		assertEquals(deck.pickCard(), new Card (Card.Rank.ACE, Card.Suit.SPADES));
		assertEquals(deck.pickCard(), new Card (Card.Rank.ACE, Card.Suit.HEARTS));
		assertEquals(deck.pickCard(), new Card (Card.Rank.ACE, Card.Suit.CLUBS));
		assertEquals(49, deck.getCards().size());
	}

}
