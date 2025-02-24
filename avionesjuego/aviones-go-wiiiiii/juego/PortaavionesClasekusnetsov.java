package juego;

public class PortaavionesClasekusnetsov extends Portaaviones {
    public PortaavionesClasekusnetsov (String nombre) {
        super(nombre, 90, 300, 400, "Misiles", 400, 600);
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
        return vida;
    }
    @Override
    public void activarHabilidad() {
        protegido=true;
        System.out.println(nombre + " activa Escudo Defensivo, reduce el daño recibido a la mitad!");
    }
    public static void mostrarDatos(){
        System.out.println("Las características de este portaaviones son: \n daño = {10, 20, 35}; \n capacidad de aviones: 90 \n blindaje: 300 \n vida=400");
    }
    
}