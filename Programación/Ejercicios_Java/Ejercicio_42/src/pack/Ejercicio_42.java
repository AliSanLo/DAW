package pack;

import java.util.Scanner;

public class Ejercicio_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);

		
	int num;
	int i;
	int x = 0;
	boolean numPrimo;
	
	
	System.out.println("Introduce un número entero positivo: ");
	num = teclado.nextInt();
	

for(i = 1; i <= 5 ; i++) {
	for(x=2;x<num;x++) {
		if(num % x == 0) { 
			numPrimo = false;
		}else
			numPrimo = true;		
	}
	
	num =+ 1;
}
	
	}

}
