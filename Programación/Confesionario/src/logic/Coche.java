package logic;

public class Coche {

	// METODO CONSTRUCTOR

	private int ruedas = 4;
	private int largo = 2000;
	private int ancho = 300;
	private int motor = 1600;
	private int eso = 500;
	private String color;
	private boolean asientos_cuero, climatizador;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// No puedo meter aqui una variable private porque no se en verdad

		Coche micoche = new Coche();

		System.out.println(micoche.dime_largo());	
		micoche.establece_color();
		System.out.println(micoche.dime_color());
		micoche.configura_asientos("no");
		System.out.println(micoche.dime_asientos());
		micoche.configura_climatizador("si");
		System.out.println(micoche.climatizador());
		

	} // FIN MAIN
	public void configura_climatizador(String climatizador) { //setter
		if(climatizador.equalsIgnoreCase(climatizador)) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String climatizador() {//Getter
		if(climatizador == true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche no incorpora climatizador";
		}
	}
	
	
	public void configura_asientos (String asientos_cuero) { //Setter (convertir el valor de la 
		//variable de boolean a String)
		if(asientos_cuero.equalsIgnoreCase("Si")) {
		this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	public String dime_asientos() {
		if(asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}

	public String dime_largo() { // GETTER (tiene que ir fuera del main)
		return "El puto largo es " + largo;

	}

	public void establece_color() { // SETTER
		color = "azul";
	}

	public String dime_color() { // GETTER
		return "Y el maldito color es " + color;
	}
}
