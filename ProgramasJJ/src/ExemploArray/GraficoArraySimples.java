package ExemploArray;

public class GraficoArraySimples {
	

		public static void main(String[] args) {
			
			int[] c = {0,0,0,0,2,5,8,9,10,1};
			
			System.out.printf("Distribuição na grade \n");
			
			for(int counter = 0; counter < c.length; counter++) {
				if(counter == 10)
					System.out.printf("%5d ", 100);
					
				else
					System.out.printf("%02d - %02d: ", counter *10, counter *10+9);
					
				for (int stars = 0; stars <c[counter ]; stars++ )
					System.out.printf("*");
				
				System.out.println();
			}

			}
			
			
	
}
