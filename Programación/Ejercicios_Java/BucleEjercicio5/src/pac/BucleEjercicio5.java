package pac;

import java.util.Scanner;

public class BucleEjercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		/*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.*/
		
		int i = 320;
		
	
		while(i >= 160) {
			i -= 20;
System.out.println(i);
	}
	}
}
