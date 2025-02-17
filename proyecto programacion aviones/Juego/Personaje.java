package Juego;
import java.util.Random;

// Clase abstracta Personaje
public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected static final Random random = new Random();
    
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.vida = 300;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getVida() {
        return vida;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " recibe " + danio + " de daño, te queda " + vida + " de vida.");
    }
    public abstract void atacar(Personaje enemigo);
    public abstract void activarHabilidad();
}