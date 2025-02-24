package juego;
import java.util.Random;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected boolean activarHabilidad= false;
    protected boolean protegido= false;
    protected boolean esquivar= false;
    protected boolean contraataque=false;
    protected static final Random random = new Random();
    
    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
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
        if(protegido){
            danio/=2;
        }
        if(esquivar){
            danio=0;
            System.out.println(nombre + "no recibe daño con su habilidad activa");
        }
        vida -= danio;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " recibe " + danio + " de daño, te queda " + vida + " de vida.");
    }
    

    public abstract void atacar(Personaje enemigo);
    public abstract void activarHabilidad();
}



