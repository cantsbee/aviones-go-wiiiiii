package Juego;

import java.util.Objects;

public abstract class Personajes {
	double peso;
	String nombre;
	String modelo;
	double velocidad;
	double danio;
	String tipoAtaque;
	String opcion;
	
	
	public Personajes(double peso, String nombre, String modelo, double velocidad, double danio, String tipoAtaque, String opcion) {
		this.peso = peso;
		this.nombre = nombre;
		this.modelo = modelo;
		this.velocidad = velocidad;
		this.danio = danio;
		this.tipoAtaque = tipoAtaque;
	
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
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


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	public double getDanio() {
		return danio;
	}


	public void setDanio(double danio) {
		this.danio = danio;
	}


	public String getTipoAtaque() {
		return tipoAtaque;
	}


	public void setTipoAtaque(String tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}
	public String getOpcion() {
		return opcion;
	}
	
	public void setOpcion(String opcion) {
		this.opcion=opcion;
	}


	@Override
	public int hashCode() {
		return Objects.hash(danio, modelo, nombre, opcion, peso, tipoAtaque, velocidad);
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
		return Double.doubleToLongBits(danio) == Double.doubleToLongBits(other.danio)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(opcion, other.opcion)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Objects.equals(tipoAtaque, other.tipoAtaque)
				&& Double.doubleToLongBits(velocidad) == Double.doubleToLongBits(other.velocidad);
	}


	@Override
	public String toString() {
		return "Personajes [peso=" + peso + ", nombre=" + nombre + ", modelo=" + modelo + ", velocidad=" + velocidad
				+ ", danio=" + danio + ", tipoAtaque=" + tipoAtaque + ", opcion=" + opcion + "]";
	}


	


	
	

	
}
