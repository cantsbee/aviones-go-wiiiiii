

package Juego;
public class CazaF16 extends Avion{
	
	double tamanio;

	public CazaF16(String nombre, String modelo, String opcion, String tipoAvion, double defensa, double velocidad,
	String herramienta, double ventaja, double tamanio) {
		
		super( nombre, modelo,  opcion, tipoAvion, defensa, velocidad, herramienta, ventaja);
		this.tamanio = tamanio;
	}
	
	
	
	}