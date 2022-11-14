package pac;

import java.util.Scanner;

import java.util.Scanner;

public class BuclesEjercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		/*
		 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
		 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
		 */

		int cuadrado = 0;
		int num;
		int cubo = 0;

		System.out.print("Introduce un número: ");
		num = teclado.nextInt();

		for (int i = 1; i <= 5; i++) {
				cubo = num * num * num;
				cuadrado = num * num;
				num++;
				System.out.println(num + "|" + cuadrado + "|"+ cubo);
			}
		} // fin for cuadrado

	}

