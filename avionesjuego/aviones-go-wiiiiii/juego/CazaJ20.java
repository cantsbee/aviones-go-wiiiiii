package juego;

class CazaJ20 extends Avion {
    public CazaJ20(String nombre) {
        super(nombre, 1100, 90, 200);
        System.out.println("Tu avión caza " + nombre + " está listo para batallar.");
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        int[] danios = {22, 32, 42};
        int danio = danios[random.nextInt(danios.length)];
        String[] sonidos = {"Pumbaaaa", "Boom", "patada termonuclear"};
        System.out.println(sonidos[random.nextInt(sonidos.length)]);
        enemigo.recibirDanio(danio);
    }
    
    @Override
    public void activarHabilidad() {
        System.out.println(nombre + " activa Camuflaje, el próximo ataque enemigo fallará!");
    }
    
    public void habilidadEspecial(Personaje enemigo){
        int[] danos = {40, 60, 80};
        int danio = danos[random.nextInt(danos.length)];
        enemigo.recibirDanio(danio);
    }
}

