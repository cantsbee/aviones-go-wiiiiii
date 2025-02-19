package Juego;
public abstract class Avion extends Personajes {
	
	protected String tipoAvion;
	protected double defensa;
	protected double velocidad;
	protected String herramienta;
	protected double ventaja;
	

	public Avion(String nombre, String modelo, String opcion, String tipoAvion, double defensa, double velocidad,
			String herramienta, double ventaja) {
		super(nombre, modelo, opcion);
		this.tipoAvion = tipoAvion;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.herramienta = herramienta;
		this.ventaja = ventaja;
	}
	public void menu() {
		
	System.out.println("Selecciona una opcion");
	System.out.println("'1' para mostrar la informacion de cada avion");
   System.out.println("'2'para seleccionar un avion caza F16");
   System.out.println("'3'para seleccionar un avion caza F35");
	System.out.println("'4'para seleccionar un avion caza J20");
   System.out.println("'5' para salir");
	}
	public String getTipoAvion() {
		return tipoAvion;
	}
	public void setTipoAvion(String tipoAvion) {
		this.tipoAvion = tipoAvion;
	}
	public double getDefensa() {
		return defensa;
	}
	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public String getHerramienta() {
		return herramienta;
	}
	public void setHerramienta(String herramienta) {
		this.herramienta = herramienta;
	}
	@Override
	public String toString() {
		return "Avion [tipoAvion=" + tipoAvion + ", defensa=" + defensa + ", velocidad=" + velocidad + ", herramienta="
				+ herramienta + "]";
	}
	
	
}



