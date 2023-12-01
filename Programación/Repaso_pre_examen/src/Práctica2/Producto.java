package Práctica2;

import java.util.ArrayList;

public class Producto {
	private int id;
	private String nombre;
	private String descripcion;
	private int cantidad;
	private int precioUnitario;
	
	//private boolean agotado;

	ArrayList<String> productos;
	
	 
	public Producto(int id, String nombre, String descripcion, int cantidad, int precioUnitario) {
		this.id=id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		
		productos = new ArrayList<String>();
		
	}
	
	

	public Producto() {
		productos = new ArrayList<String>();
	}

	public void add(String productoadd) {
		productos.add(productoadd);
	}
	
	public void remove(String productorm) {
		productos.remove(productorm);
	}
	public int index(String productoindex) {
		return productos.indexOf(productoindex);
	}
	
}

