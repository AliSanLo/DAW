package Práctica2;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto huevos = new Producto();
		
		huevos = new Producto(123, "huevos", "algo", 30, 3); 
		huevos.add("huevoshacendado");
		huevos.add("huevoduro");
		huevos.add("yemita");
		System.out.println(huevos.index("yemita"));
		
	}

}
