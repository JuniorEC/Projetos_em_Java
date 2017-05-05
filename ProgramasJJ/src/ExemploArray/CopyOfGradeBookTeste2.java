package ExemploArray;

/**
 * @version 1.0
 * @author 14208 (João D. Junior)
 * {@literal Programa roda a classe gradebook2 afim de desenvolver
 *  uma série de linhas e colunas de um array bidimensional usado para notas de alunos}
 */
public class CopyOfGradeBookTeste2 {

	public static void main(String[] args) {
		
		int[][] gradesArray = {{87, 68, 94,4 },{ 100, 83, 78,4}, {85, 91, 76,4}, {87,60, 15,4},
				{78, 45, 01, 55 }, {25, 30, 87, 55 }, {68, 94, 100, 55 }};
		
		CopyOfGradeBook2 myGradeBook = new CopyOfGradeBook2( "CS101 instroduction to Java Programing", gradesArray);
		myGradeBook.displayMessage();
		myGradeBook.processGrades();

	}

}
