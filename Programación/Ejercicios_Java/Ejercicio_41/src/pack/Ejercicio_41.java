package pack;

import java.util.Scanner;

public class Ejercicio_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		
		long num;
		long resto;
		long numPar = 0;
		long numImpar = 0;
		
		
		System.out.println("Introduce un número: ");
		num=teclado.nextInt();
		
		long aux = num;
		
	while(num % 10 != 0) {
			resto = num % 10;
			if(resto % 2 == 0) {
				numPar++;
				
			}if(resto % 2 != 0){
				numImpar++;
			} 
			num = num / 10;
				} // fin while
		
System.out.println("El numero " + aux + " contiene " + numPar++ +" pares y " + numImpar++ +" dígitos impares");

	}

}
