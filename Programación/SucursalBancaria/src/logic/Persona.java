package logic;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private int edad;
	private int dni;
	private boolean sexo = false;
	private double peso;
	private double altura;
	private int kg;
	private int imc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

	}

	public Persona(String sexo) {
		if (sexo.equals("M")) {
			this.sexo = true;
		}
		if (sexo.equals("H")) {
			this.sexo = false;
		}
	}

	public Persona() {
		nombre = "Rosa Melano";
		edad = 13;
		dni = 88551313;
		sexo = false;
		peso = 60;
		altura = 160;
	}

	public Persona(String nombre, int edad, int dni, boolean sexo, double peso, double altura) {
		dni = 88551313;
		peso = 60;
		altura = 160;
	}

	public Persona(String nombre, int edad, boolean sexo) {

	}

	public void set_calcular_IMC() {

		imc = (int) Math.round(kg / (altura * altura));
	}

	public int get_imc() {
		if (imc < 20) {
			return -1;
		} else if (imc >= 20 && imc <= 25) {
			return 0;
		} else {
			return 1;
		}
	}

	public boolean get_esMayorDeEdad() {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}

	public void set_genera_dni() {
		int dni = (int) Math.floor(Math.random() + 8);
		return randomChar; // estoy bucando como generar un caracter aleatorio para el dni
		https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
	}

}
