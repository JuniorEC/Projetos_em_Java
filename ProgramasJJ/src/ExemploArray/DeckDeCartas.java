package ExemploArray;

import java.util.Random;

public class DeckDeCartas {
	private Carta[] deck;
	private int proximaCarta;
	private static final int numero_de_cartas = 52;
	private static final Random randomNumbers = new Random();
	public static void main(String[] args) {
		
	}
	
	public DeckDeCartas(){
		String[] faces = {"Ace","Deuce","Three","Four","Five","Six","Seven",
				"Eight","Nine","Ten","Jack","Queen","King"};
		String[] Suits = {"Hearts","Diamonds","Clubs","Spades" };
		
		deck = new Carta[ numero_de_cartas];
		proximaCarta = 0;
		
		for (int count = 0; count < deck.length; count++)
			deck[ count ] = 
				new Carta(faces[count % 13], Suits [ count / 13]);	
	}
	
	public void shuffle(){
		
		proximaCarta = 0;
		
		for (int first = 0; first<deck.length;first++) {
			int second = randomNumbers.nextInt(numero_de_cartas);
			
			Carta temp = deck[first];
			deck[first] = deck [second];
			deck [second] = temp;
		}	
	}
	
	public Carta dealCarta() {
		if(proximaCarta < deck.length)
			return deck [ proximaCarta++];
		else
			return null;
	}
}
