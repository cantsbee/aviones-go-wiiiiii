package juego;

public class CazaF16 extends Avion {
    protected static int[] Danios = {10, 20, 35};
    protected static String[] Sonidos = {"oaaa", "eeaa", "pumbaaa"};

    public CazaF16(String nombre) {
        super(nombre, 900, 85, 350,15000,"Misiles",60, 50);
    }

    @Override
    public void atacar(Personaje enemigo) {
        
        int danio = Danios[random.nextInt(Danios.length)];
        System.out.println(Sonidos[random.nextInt(Sonidos.length)]);
        if(activarHabilidad){
            danio*=2;
        }
        enemigo.recibirDanio(danio,this);
        
    }

    @Override
    public void activarHabilidad() {
        activarHabilidad=true;
        System.out.println(nombre + " activa Velocidad Supersónica, duplica su próximo ataque!");
    }

    public static void mostrarDatos(){
            System.out.println("Las características de este caza son: \n daño = {10, 20, 35}; \n velocidad= 900 \n maniobrabilidad= 85 \n vida=350\n vuela a una altura maxima de 15000 pies\n usa un armamento de misiles, su autonomia es de 60 horas  ");
}

}
