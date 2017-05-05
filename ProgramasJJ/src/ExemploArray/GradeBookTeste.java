package ExemploArray;

public class GradeBookTeste {

	public static void main(String[] args) {
		
		int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87,60, 15, 78, 45, 01, 25, 30, 87, 68, 94, 100};
		
		GradeBook myGradeBook = new GradeBook( "CS101 instroduction to Java Programing", gradesArray );
		myGradeBook.displayMessage();
		myGradeBook.processGrades();

	}

}
