package juego;

public class PortaavionesClaseNimitz extends Portaaviones {
    protected int[] danos = {10, 17, 15};
    protected static String[] Sonidos = {"¡Kaboom!", "¡Boom!", "¡Booom!"};
    public PortaavionesClaseNimitz(String nombre) {
       
        super(nombre, 120, 350, 600, "Misiles", 300, 620);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
       
        int danio = danos[random.nextInt(danos.length)];
        System.out.println(Sonidos[random.nextInt(Sonidos.length)]);
        enemigo.recibirDanio(danio,this);
    }
    @Override
    public int getVida(){
        return vida;
    }
    @Override
    public void activarHabilidad() {
        esquivar=true;
        System.out.println(nombre + " tiene la probabilidad de esquivar el proximo ataque enemigo");
    }
    public static void mostrarDatos(){
        System.out.println("Las características de este portaaviones son: \n daño = {10, 17, 15};\n capacidad de aviones: 120 aviones \n blindaje: 350 puntos \n vida=600 puntos\n usa un sistema de defensa con torpedos\ntiene una velocidad de 300 km/h\n y cuenta con un poder de 620 ");
    }
    
}

