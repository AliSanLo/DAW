package logic;

import java.util.Scanner;

/*
1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, 
la cantidad de la cuenta pasa a ser 0.*/

public class Cuenta {
	private String titular; // obligatorio
	private double cantidad; // opcional
	// int retiro;
	Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		double cantidad;

		Cuenta mi_cuenta = new Cuenta("Alicia", 300);

		System.out.println("Qué cantidad quieres ingresar");
		cantidad = teclado.nextDouble();
		mi_cuenta.set_ingresar(cantidad);
		System.out.println("Ingreso realizado con exito. Tiene un total de " + mi_cuenta.get_cantidad());

		System.out.println("Qué cantidad quieres retirar");
		cantidad = teclado.nextDouble();
		mi_cuenta.set_retirar(cantidad);
		System.out.println("Actualmente tiene en su cuenta" + mi_cuenta.get_cantidad());
		

	} // FIN MAIN

	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Cuenta(String titular) {
		this.titular = titular;
	}

	public void set_ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad += cantidad;
		}
	}

	public void set_retirar(double cantidad) {
		this.cantidad -= cantidad;
		if (this.cantidad < 0) {
			this.cantidad = 0;
		}

	}

	public double get_cantidad() {
		return cantidad;
	}
}
