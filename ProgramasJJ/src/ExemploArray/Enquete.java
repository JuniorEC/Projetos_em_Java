package ExemploArray;

public class Enquete {

	public static void main(String[] args) {
		int [] respostas = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,10,10,10,10,10,10};
		
		int[] frequencia = new int [11];
		
		for (int pergunta = 0; pergunta < respostas.length; pergunta++)
			++frequencia[ respostas[pergunta]];
		
		System.out.printf("%s%10s\n","Nota\t"," Frequencia");
		
		for( int nota = 1; nota < frequencia.length; nota++)
			System.out.printf("%d%10d\t\n", nota, frequencia[nota]);
	}

}
