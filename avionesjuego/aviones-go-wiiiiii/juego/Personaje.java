package juego;
import java.util.Random;

public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected boolean activarHabilidad= false;
    protected boolean protegido= false;
    protected boolean esquivar= false;
    protected int probabilidad=40;
    protected boolean contraataque=false;
    protected static final Random random = new Random();
    
    public Personaje(String nombre, int vida, int probDefensa) {
        this.nombre = nombre;
        this.vida = vida;
        probDefensa = 50;
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
    
    public void recibirDanio(int danio, Personaje atacante) {
                if (esquivar) {
                    int prob = random.nextInt(100);
                    if (prob < probabilidad) {
                        System.out.println(nombre + " Activo su habilidad de esquivar, evita el ataque enemigo!");
                        esquivar= false;  
                        return;
                    } else {
                        System.out.println(nombre + " No ha logrado esquivar el ataque enemigo");
                        esquivar = false;
                    }
                }
        
                if (protegido) {
                    danio /= 2;
                    System.out.println(nombre + " Tiene activado su escudo, recibe solo " + danio + " de daño.");
                    protegido = false;
                }
                vida -= danio;
                if (vida < 0) vida = 0;
                System.out.println(nombre + " Recibe " + danio + " de daño. Vida restante: " + vida);
        
                if (contraataque) {
                    System.out.println(nombre + " Ha activado su habilidad de contraataque y genera " + danio + " de daño al enemigo");
                    atacar(atacante);  
                    contraataque = false; 
                }
            }
        
            public abstract void atacar(Personaje enemigo);
            public abstract void activarHabilidad();
        }
