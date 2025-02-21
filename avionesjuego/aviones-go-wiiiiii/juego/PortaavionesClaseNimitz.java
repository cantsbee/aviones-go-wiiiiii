package juego;

public class PortaavionesClaseNimitz extends Portaaviones {
    public PortaavionesClaseNimitz(String nombre) {
        super(nombre, 90, 300, 400);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        int[] danos = {30, 40, 50};
        int danio = danos[random.nextInt(danos.length)];
        String[] sonidos = {"¡Kaboom!", "¡Boom!", "¡Booom!"};
        System.out.println(sonidos[random.nextInt(sonidos.length)]);
        enemigo.recibirDanio(danio);
    }
    @Override
    public int getVida(){
        return 800;
    }
    @Override
    public void activarHabilidad() {
        protegido=true;
        System.out.println(nombre + " activa Escudo Defensivo, reduce el daño recibido a la mitad!");
    }
    
}

