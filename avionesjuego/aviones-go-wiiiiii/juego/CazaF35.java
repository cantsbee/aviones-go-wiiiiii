

package juego;

public class CazaF35 extends Avion {
    protected static int[] Danios = {13, 22, 36};
    protected static String[] Sonidos = {"oaaa", "eeaa", "pumbaaa"};

    public CazaF35(String nombre) {
        super(nombre, 1100, 70, 300,16000,"Misiles",50);
    }

    @Override
    public void atacar(Personaje enemigo) {
        
        int danio = Danios[random.nextInt(Danios.length)];
        System.out.println(Sonidos[random.nextInt(Sonidos.length)]);
        if(activarHabilidad){
            danio*=2;
        }
        enemigo.recibirDanio(danio);
        
       
    }

    @Override
    public void activarHabilidad() {
        System.out.println(nombre + " activa ataque sorpresa, genera daño al enemigo al recibir daño");
    }

    public static void mostrarDatos() {
        System.out.println("Las características de este caza son: \n daño = {13, 22, 36}; \n velocidad= 900 \n maniobrabilidad= 85 \n vida=350");
    }
 }

 
