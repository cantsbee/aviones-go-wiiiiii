package Juego;

public class Avion extends Personajes {
	
	String tipoAvion;
	
	public Avion(double peso, String nombre, String modelo, double velocidad, double danio, String tipoAtaque, String opcion) {
		
		super(peso, nombre, modelo, velocidad, danio, tipoAtaque, opcion);
		
		// this.tipoAvion = tipoAvion;
	}
	
	
	public void menu() {
		
	System.out.println("Selecciona una opcion");
    System.out.println("'1'para seleccionar un avion caza");
    System.out.println("'2'para seleccionar un avion tipo");
    System.out.println("'3' para mostrar la informacion");
    System.out.println("'4' para salir");
	}

	
}