package pac;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		/*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/
		
		long num = 0;
		long digito = 0;

		
		System.out.println("Introduce un número: ");
		num  = teclado.nextInt();
		
		while(num / 10 != 0 || num % 10 != 0) {
		digito = num % 10;
		num = num / 10;
		
		System.out.println(digito);
	} //fin while
	}
}
