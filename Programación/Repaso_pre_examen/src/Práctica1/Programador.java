package Práctica1;

import java.util.ArrayList;

public class Programador extends Empleado {
	ArrayList<String> LenguajesConocidos;

	public Programador() {
		super();
	}
	public Programador(String nombre, int edad, float salario) {
		super(nombre, edad, salario);
			LenguajesConocidos=new ArrayList<String>();
			
		}
	
		public void add(String LenguajesConocidosadd) {
			this.LenguajesConocidos.add(LenguajesConocidosadd);
			
	}
		public void remove(String LenguajesConocidos) {
			this.LenguajesConocidos.remove(LenguajesConocidos);
		}
	
	

}
