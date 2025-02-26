package juego;
public abstract class Avion extends Personaje {
    protected int velocidad;
    protected int maniobrabilidad;
    protected int alturaMaxima;
    protected String armamento;
    protected int autonomia;
    
    public Avion(String nombre, int velocidad, int maniobrabilidad, int vida, int alturaMaxima, String armamento, int autonomia) {
    super(nombre, vida);
        this.velocidad = velocidad;
        this.maniobrabilidad = maniobrabilidad;
        this.alturaMaxima = alturaMaxima;
        this.armamento = armamento;
        this.autonomia = autonomia;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    public int getManiobrabilidad() {
        return maniobrabilidad;
    }

    public int getalturaMaxima(){
        return alturaMaxima;
    }

    public String armamento(){
        return armamento;
    }

    public int autonomia(){
        return autonomia;
    }
}



