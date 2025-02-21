// package juego;

// public class F16 extends Avion {
//     public F16(String nombre) {
//         super(nombre, 900, 85, 350);
//         System.out.println("Tu avión caza " + nombre + " está listo para la batashaaaa eeaaaa oaaaa eaaaa.");
        
//     } 
//     @Override
//     public void atacar(Personaje enemigo) {
//         int[] danos = {10, 20, 35};
//         int danio = danos[random.nextInt(danos.length)];
//         String[] sonidos = {"oaaa", "eeaa", "pumbaaa"};
//         System.out.println(sonidos[random.nextInt(sonidos.length)]);
//         enemigo.recibirDanio(danio);
//     }
    
//     @Override
//     public void activarHabilidad() {
//         System.out.println(nombre + " activa Velocidad Supersonicaaaaaaaaaaa, duplica su próximo ataque de pancho!");
//     }

//     // public void habilidadEspecial(){
//     //      int[] danos = {40, 60, 80};
//     //      int danio = danos[random.nextInt(danos.length)];
//     //      ;
//     //  }
//     public void habilidadEspecial(Personaje enemigo) {
//         int[] danos = {40, 60, 80};
//         int danio = danos[random.nextInt(danos.length)];
//         String[] sonidos = {"oaaa", "eeaa", "pumbaaa"};
//         System.out.println(sonidos[random.nextInt(sonidos.length)]);
//         enemigo.recibirDanio(danio);
//     }
// }

package juego;

public class CazaF16 extends Avion {
    private static int[] Danios = {10, 20, 35};
    private static String[] Sonidos = {"oaaa", "eeaa", "pumbaaa"};

    public CazaF16(String nombre) {
        super(nombre, 900, 85, 350);
    }

    @Override
    public void atacar(Personaje enemigo) {
        
        int danio = Danios[random.nextInt(Danios.length)];
        System.out.println(Sonidos[random.nextInt(Sonidos.length)]);
        if(activarHabilidad){
            danio*=2;
        }
        enemigo.recibirDanio(danio);
        
       
    }

    @Override
    public void activarHabilidad() {
        activarHabilidad=true;
        System.out.println(nombre + " activa Velocidad Supersónica, duplica su próximo ataque!");
    }

    public void mostrarDatos(){
            System.out.println("Las características de este caza son: \n daño = {10, 20, 35}; \n velocidad= 900 \n maniobrabilidad= 85 \n vida=350");
}
