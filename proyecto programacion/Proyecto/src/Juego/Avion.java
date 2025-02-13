package Juego;

public class Avion extends Personajes {
	
	String tipoAvion;
	
	public Avion(double peso, String nombre, String modelo, double velocidad, double danio, String tipoAtaque, String opcion) {
		
		super(peso, nombre, modelo, velocidad, danio, tipoAtaque, opcion);
		
		this.tipoAvion = tipoAvion;
	}
	
	
	public void menu() {
		
	System.out.println("Selecciona una opcion");
	System.out.println("'1' para mostrar la informacion de cada avion");
    System.out.println("'2'para seleccionar un avion caza F16");
    System.out.println("'3'para seleccionar un avion caza F35");
	System.out.println("'4'para seleccionar un avion caza J20");
    System.out.println("'5' para salir");
	}

	
}