

package juego;

public class CazaF35 extends Avion {
    protected static int[] Danios = {13, 22, 36};
    protected static String[] Sonidos = {"oaaa", "eeaa", "pumbaaa"};

    public CazaF35(String nombre) {
        super(nombre, 900, 85, 350);
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
        System.out.println(nombre + " activa Velocidad Supersónica, duplica su próximo ataque!");
    }
 }



