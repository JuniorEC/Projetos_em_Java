package Outros;

public class Time2Test {

	public static void main(String[] args) {
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(12, 25, 42);
		Time2 t5 = new Time2(27, 74, 99);
		Time2 t6 = new Time2( t4 );
		
		System.out.println("Construido como:");
		System.out.println("t1: todos os argumentos default");
		System.out.printf(" %s\n", t1.toUniversalString() );
		System.out.printf(" %s\n", t1.toString() );
		
		
		System.out.println("t2: hora especificada; os demais argumentos default");
		System.out.printf(" %s\n", t2.toUniversalString() );
		System.out.printf(" %s\n", t2.toString() );
		
		System.out.println("t2: hora e minutos especificados; os demais argumentos default");
		System.out.printf(" %s\n", t3.toUniversalString() );
		System.out.printf(" %s\n", t3.toString() );
		
		System.out.println("t2: hora, minutos e segundos especificada");
		System.out.printf(" %s\n", t4.toUniversalString() );
		System.out.printf(" %s\n", t4.toString() );
		
		System.out.println("t5: todos os valores estão invalidos");
		System.out.printf(" %s\n", t5.toUniversalString() );
		System.out.printf(" %s\n", t5.toString() );
		
		System.out.println("t6: Objeto Time2 t4 especificado");
		System.out.printf(" %s\n", t6.toUniversalString() );
		System.out.printf(" %s\n", t6.toString() );

	}

}
