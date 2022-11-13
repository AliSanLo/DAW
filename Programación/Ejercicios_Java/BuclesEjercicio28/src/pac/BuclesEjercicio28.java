package pac;

import java.util.Scanner;

public class BuclesEjercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int i;
		int num = 0;
		int factorial = 1;
		System.out.println("Introduce un numero:");
		num = teclado.nextInt();

		for(i = 1  ; i <= num ; i++) {
			factorial *= i;
		}
		
		
		System.out.println("El factorial de " + num + "! es " + factorial );
		
	}

}
