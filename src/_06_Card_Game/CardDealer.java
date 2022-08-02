package _06_Card_Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import _06_Card_Game.Card.Rank;
import _06_Card_Game.Card.Suit;

public class CardDealer implements ActionListener {
	ArrayList<Card> deck = new ArrayList<Card>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton more = new JButton();
	JButton done = new JButton();
	int total = 0;
    public static void main(String[] args) {

    	
	}
    public void deckMake () {
    	Rank[] ranks = Rank.values();
    	Suit[] suits = Suit.values();
    	for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				Card newcard = new Card(ranks[j], suits[i]);
				deck.add(newcard);
			}
		}
    }
    public void shuffle () {
    	ArrayList<Card> shuffledDeck = new ArrayList<Card>();
    	while (deck.size() > 0) {
    		int random = (int) (Math.random() * deck.size());
    		shuffledDeck.add(deck.get(random));
    	}
    }
    public void blackjack () {
    	more.addActionListener(this);
    	done.addActionListener(this);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==more) {
			Random rand = new Random(13);
			total += rand.nextInt();
		}
	}
    
}