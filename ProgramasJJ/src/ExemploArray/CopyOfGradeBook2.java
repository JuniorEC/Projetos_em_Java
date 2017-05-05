package ExemploArray;

/**
 * @version 1.0
 * @author 14208 (João D. Junior)
 *{@literal Uma prática com arrays para ser inserido um número de arrays bidimensionais,
 *          na variável de instância int [][] grades. }
 */
public class CopyOfGradeBook2 {
	private String CursoNome;
	private int[][] grades;
	
	public CopyOfGradeBook2 ( String name, int [][]gradesArray) {
		
		CursoNome = name;
		grades = gradesArray;
	}
	public void setCursoNome(String nome) {
		CursoNome = nome;
	}
	public String getCursoNome() {
		return CursoNome;
	}
	public void displayMessage() {
		System.out.printf("Welcome to the grade book for \n%s!\n\n",getCursoNome() );
	}
	
	public void processGrades() {
		outputGrades();
		
		System.out.printf("\n%s %d\n%s %d\n\n",
			"Lowest grade in the grade book is", getMinimum(),
			"Highst grade in the grade book is", getMaximum() );
		
		outputBarChart();
	}
	
	public int getMinimum() {
		int lowGrade= grades [0][0];
		for(int[] studentGrades : grades) {
			for (int grade : studentGrades) {
			if( grade < lowGrade)
				lowGrade = grade;
			}
		}
		return lowGrade;
	}
	 public int getMaximum() {
		 int highGrade = grades[0][0];
		 
		 for (int[] studentGrades : grades) {
			 for(int grade : studentGrades) {
			 if (grade >highGrade)
				 highGrade = grade;
			 }
		}
	 return highGrade;
}
	public double getAverange( int [] setOfGrades) {
		int total = 0;
		
		for ( int grade : setOfGrades)
			total+=grade;
		
		return (double) total / setOfGrades.length;
	}
	
	public void outputBarChart() {
		System.out.println("Grade distribuitions: ");
		
		int[] frequency = new int [11];
		
		for ( int[] studentGrades : grades) {
			for (int grade : studentGrades)
			++frequency[grade/10];
		}
		
		for (int count = 0; count <frequency.length; count++) {
			
			if (count == 10)
				System.out.printf("%5d: ", 100 );
			else
				System.out.printf("%5d: ",
					count * 10, count * 10 + 9 );
			
			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.printf("*");
			System.out.println();
		}
	}
	public void outputGrades(){
		System.out.println("The grades are: \n" );
		System.out.print("             ");
		
		for (int test = 0; test < grades[0].length; test++)
			System.out.printf("Test %d  ", test+1);
			System.out.println("Averange");
		
		for (int student = 0; student < grades.length;student++) {
			System.out.printf("Student %2d",student +1);
			for ( int test : grades [ student ])
				System.out.printf("%8d",test);
				double averange = getAverange ( grades [ student ]);
				System.out.printf("%9.2f\n", averange);
		}
	}
}