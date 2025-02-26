package juego;

public class PortaavionesClaseNimitz extends Portaaviones {
    public PortaavionesClaseNimitz(String nombre) {
        super(nombre, 120, 350, 600, "Torpedos", 300, 620);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        int[] danos = {10, 17, 15};
        int danio = danos[random.nextInt(danos.length)];
        String[] sonidos = {"¡Kaboom!", "¡Boom!", "¡Booom!"};
        System.out.println(sonidos[random.nextInt(sonidos.length)]);
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

