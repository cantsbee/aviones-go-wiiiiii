package juego;

public class PortaavionesClaseQueenElizabeth extends Portaaviones {
    public PortaavionesClaseQueenElizabeth(String nombre) {
        super(nombre, 120, 500, 650, "Torpedos", 450, 550);
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
        System.out.println("Las características de este portaaviones son: \n daño = {10, 20, 35}; \n capacidad de aviones: 90 \n blindaje: 300 \n vida=400");
    }
    
}