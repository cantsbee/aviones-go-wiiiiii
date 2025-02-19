package juego;

public class F16 extends Avion {
    public F16(String nombre) {
        super(nombre, 900, 85, 350);
        System.out.println("Tu avión caza " + nombre + " está listo para la batashaaaa eeaaaa oaaaa eaaaa.");
        
    } 
    @Override
    public void atacar(Personaje enemigo) {
        int[] danos = {10, 20, 35};
        int danio = danos[random.nextInt(danos.length)];
        String[] sonidos = {"oaaa", "eeaa", "pumbaaa"};
        System.out.println(sonidos[random.nextInt(sonidos.length)]);
        enemigo.recibirDanio(danio);
    }
    
    @Override
    public void activarHabilidad() {
        System.out.println(nombre + " activa Velocidad Supersonicaaaaaaaaaaa, duplica su próximo ataque de pancho!");
    }

    // public void habilidadEspecial(){
    //     int[] danos = {40, 60, 80};
    //     int danio = danos[random.nextInt(danos.length)];
    //     enemigo.recibirDanio(danio);
    // }
}