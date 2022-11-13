package pac;

import java.util.Scanner;

public class BuclesEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.*/
		
		int i = 0;
		int mult5;

		while (i <= 100) {
			if (i % 5 == 0) {
				System.out.println(i);

			}
			i++;
		}
	}
}
