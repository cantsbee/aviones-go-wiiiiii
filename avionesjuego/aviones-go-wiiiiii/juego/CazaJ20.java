
package juego;

public class CazaJ20 extends Avion {
    private static int[] Danios = {20, 40, 60};
    private static String[] Sonidos = {"oaaa", "eeaa", "pumbaaa"};

    public CazaJ20(String nombre) {
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

    public static void mostrarDatos() {
        System.out.println("Las características de este caza son: \n daño = {20, 40, 60} \n velocidad= 900 \n maniobrabilidad= 85 \n vida=350");
    }
}
