package ExemploArray;


public class DeckdeCartasTeste {
	

	public static void main(String[] args) {
		DeckDeCartas meuDeckDeCartas = new DeckDeCartas();
		meuDeckDeCartas.shuffle();
		
		for(int i = 1; i<= 52; i++){
			
			System.out.printf("%-19s", meuDeckDeCartas.dealCarta() ) ;
			
			if (i % 4 == 0 )
				System.out.println();
		}

	}

}
