package juego;

abstract class Avion extends Personaje {
    protected int velocidad;
    protected int maniobrabilidad;
    
    public Avion(String nombre, int velocidad, int maniobrabilidad, int vida) {
        super(nombre, vida);
        this.velocidad = velocidad;
        this.maniobrabilidad = maniobrabilidad;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public int getManiobrabilidad() {
        return maniobrabilidad;
    }
}
