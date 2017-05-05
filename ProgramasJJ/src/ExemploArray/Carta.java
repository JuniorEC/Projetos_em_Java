package ExemploArray;

public class Carta {
	
	private String face;
	private String suit;

	public Carta (String cardFace, String CardSuit) {
		face = cardFace;
		suit = CardSuit;

	}
	public String toString() {
		return face +"of"+ suit;
	}
}
