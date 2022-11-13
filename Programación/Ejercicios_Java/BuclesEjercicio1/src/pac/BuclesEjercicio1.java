package pac;

import java.util.Scanner;

public class BuclesEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.*/
		
		int num;
		int mult5 = 0 ;
		
		
	
		for ( int i = 1 ; i <= 100 ; i++ ) {
			if (i % 5 == 0) {
			mult5 = i;
			System.out.println(mult5);
	}
	
	} // fin for
}
}
