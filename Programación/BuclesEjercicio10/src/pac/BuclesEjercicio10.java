package pac;

import java.util.Scanner;

public class BuclesEjercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/
		
		int i;
		int num = 0;
		int media;
		int aux = 0;
		
	
		while(num >= 0) {
		System.out.println("Introduce un número: ");
		num = teclado.nextInt();
		aux = num + num;
		num = aux / 2;
		
		System.out.println(num);
	}//fin while
		media = num;
	
	}
}
