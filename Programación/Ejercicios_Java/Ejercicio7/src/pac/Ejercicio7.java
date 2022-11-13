package pac;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		/*
		 * Realiza el control de acceso a una caja fuerte. La combinación será un número
		 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
		 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
		 * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
		 * Tendremos cuatro oportunidades para abrir la caja fuerte.
		 */

		int contraseña = 1234;
		int num;
		System.out.println("Introduce la contraseña de 4 cifras: ");
		num = teclado.nextInt();

		for (int i = 1; i <= 4; i++) {
			if (contraseña != num) {
				System.out.println("Lo siento, esa no es la combinación. Intentalo de nuevo");
				num = teclado.nextInt();
			}
		}//fin for
			if (contraseña == num) {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
			}
		

	}
}
