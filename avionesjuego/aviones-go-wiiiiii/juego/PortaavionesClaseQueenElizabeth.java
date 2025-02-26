package juego;

public class PortaavionesClaseQueenElizabeth extends Portaaviones {
    public PortaavionesClaseQueenElizabeth(String nombre) {
        super(nombre, 120, 500, 650, "lanza cohetes", 450, 550);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        int[] danos = {11, 14, 16};
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
        contraataque=true;
        System.out.println(nombre + " Contraataca al recibir daño");
    }
    public static void mostrarDatos(){
        System.out.println("Las características de este portaaviones son: \n daño = {11, 14, 16};\n capacidad de aviones: 120 \n blindaje: 500 puntos \n vida=650 puntos\n usa un sistema de defensa con lanza cohetes\ntiene una velocidad de 450 km/h\n y cuenta con un poder de 550 ");
    }
    
}