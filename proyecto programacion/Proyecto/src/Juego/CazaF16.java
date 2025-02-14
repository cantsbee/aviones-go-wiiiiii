package Juego;
public class CazaF16 extends Avion{
	double danio;
	double defensa;
	double velocidad;
	String herramienta;
	
	public CazaF16(double peso, String nombre, String modelo, double velocidad, double danio, String tipoAtaque,
			String opcion, double danio2, double defensa, double velocidad2, String herramienta) {
		
		super(peso, nombre, modelo, velocidad, danio, tipoAtaque, opcion);
		
		danio = danio2;
		this.defensa = defensa;
		velocidad = velocidad2;
		this.herramienta = herramienta;
	}
}