package pac;

import java.util.Scanner;

public class BuclesEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		/*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.*/
		
		int i = 0; 

		do {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			i++; //se mete dentro del do y no del if porque el if es un condicional, osea que se ejecuta a veces, no siempre.
		} while (i <= 100);

	}
}
