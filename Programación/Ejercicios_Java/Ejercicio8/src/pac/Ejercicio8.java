package pac;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
/*Muestra la tabla de multiplicar de un número introducido por teclado.*/
		
		int num = 0;
		int aux;
		
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		
		
		for(int i = 1 ; i <= 10 ; i++) {
			aux = num * i;
			System.out.println(aux);
		}
		
	}

}
