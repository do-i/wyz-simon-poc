package simon.game;

import java.util.ArrayList;

import simon.game.Card.Rank;
import simon.game.Card.Suit;

public class Deck {
	private ArrayList<Card> cards;
	
	public Deck () {
		this.cards = new ArrayList();
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				cards.add(new Card(rank, suit));
			}
		}
	}
	public ArrayList<Card> getCards() {
		return cards;
	}
	public Card pickCard () {
		return cards.remove(0);
	}
}
