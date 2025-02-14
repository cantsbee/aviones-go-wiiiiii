package Juego;
import java.util.Objects;
public abstract class Personajes {
	protected String nombre;
	protected String modelo;
	protected String opcion;
	public Personajes(String nombre, String modelo, String opcion) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.opcion = opcion;
	
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getOpcion() {
		return opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(modelo, nombre, opcion);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personajes other = (Personajes) obj;
		return Objects.equals(modelo, other.modelo) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(opcion, other.opcion);
	}
	
	
	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", modelo=" + modelo + ", opcion=" + opcion + "]";
	}
	
	
}
