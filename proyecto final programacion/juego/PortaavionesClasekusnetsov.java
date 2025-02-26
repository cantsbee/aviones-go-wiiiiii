package juego;

public class PortaavionesClasekusnetsov extends Portaaviones {

    protected static int[] Danios = {15, 20, 24};
    protected static String[] Sonidos = {"¡Kaboom!", "¡Boom!", "¡Booom!"};

    public PortaavionesClasekusnetsov (String nombre) {
        super(nombre, 90, 300, 630, "Misiles", 400, 600);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        int danio = Danios[random.nextInt(Danios.length)];
        System.out.println(Sonidos[random.nextInt(Sonidos.length)]);
        enemigo.recibirDanio(danio,this);
    }
    @Override
    public int getVida(){
        return vida;
    }
    @Override
    public void activarHabilidad() {
        protegido=true;
        System.out.println(nombre + " Activa Escudo Defensivo, reduce el daño recibido a la mitad");
    }
    public static void mostrarDatos(){
        System.out.println("Las características de este portaaviones son: \n daño = {15, 20, 24}; \n capacidad de aviones: 90 \n blindaje: 300 \n vida=630\n usa un sistema de defensa con misiles\ntiene una velocidad de 400 km/h\n y cuenta con un poder de 600 ");
    }
    
}
