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
    protected boolean defensa=false;
    protected double reduccionDefensa=1.2;
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
    
    public void recibirDanio(int danio, Personaje atacante) {
        if(defensa){
            danio/=reduccionDefensa;
            System.out.println(nombre + " Tiene activado su defensa, recibe solo " + danio + " de daño.");
            defensa=false;
        }
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

            public void defender() {
                int probabilidad2= random.nextInt(100);
                if (probabilidad2 < 50) {
                    defensa= true;
                    System.out.println(nombre + " activa su defensa, reduciendo el daño en un porcentaje de " + reduccionDefensa + ".");
                } else {
                    System.out.println(nombre + " intenta defenderse, pero falla en activar su defensa.");
                }
            }
        
            public abstract void atacar(Personaje enemigo);
            public abstract void activarHabilidad();
    }
