package juego;
public class CazaJ20 extends Avion {
    protected static int[] Danios = {20, 40, 60};
    protected static String[] Sonidos = {"oaaa", "eeaa", "pumbaaa"};

    public CazaJ20(String nombre) {
        super(nombre, 1200, 95, 400,20000,"Municiones de ataque directo", 120, 50);
    }

    @Override
    public void atacar(Personaje enemigo) {
        
        int danio = Danios[random.nextInt(Danios.length)];
        System.out.println(Sonidos[random.nextInt(Sonidos.length)]);
        if(activarHabilidad){
            danio*=1.5;
        }
        enemigo.recibirDanio(danio,this);
    
    }
    @Override
    public void activarHabilidad() {
        activarHabilidad = true;
        System.out.println(nombre + " Activa ataque fantasma, el proximo ataque ignora la habilidad del enemigo! ");
    }

    public static void mostrarDatos() {
        System.out.println("Las características de este caza son:\n daño = {20, 40, 60};\n velocidad= 1200 km/h\n maniobrabilidad= 95 %\n vida=400\n la altura maxima a la que vuela es: 20000 pies\n usa un sistema de defensa con municiones de ataque directo \ntiene una autonomia de 120 horas ");
    }
}
