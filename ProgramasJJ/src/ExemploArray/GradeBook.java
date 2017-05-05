package ExemploArray;

public class GradeBook {
	private String CursoNome;
	private int[] grades;
	
	public GradeBook ( String name, int []gradesArray) {
		
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
		
		System.out.printf("\nClass average is %.2f\n", getAverange() );
		
		System.out.printf("Lowest grade is %d\nHighest grade is %d \n\n", getMinimum(),getMinimum() );
		
		outputBarChart();
	}
	
	public int getMinimum() {
		int lowGrade= grades [0];
		for(int grade : grades) {
			if( grade < lowGrade)
				lowGrade = grade;
		}
		return lowGrade;
	}
	 public int getMaximum() {
		 int highGrade = grades[0];
		 
		 for (int grade : grades){
			 if (grade >highGrade)
				 highGrade = grade;		 
			 }
	 return highGrade;
}
	public double getAverange() {
		int total = 0;
		
		for ( int grade : grades)
			total+=grade;
		
		return (double) total / grades.length;
	}
	
	public void outputBarChart() {
		System.out.println("Grade distribuitions: ");
		
		int[] frequency = new int [11];
		
		for ( int grade : grades)
			++frequency[grade/10];
		
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
		
		for (int student = 0; student < grades.length;student++)
			System.out.printf("Student %2d: %3d\n",student +1, grades[ student ]);
	}
}