package Juego;

class F35 extends Avion {
    public F35(String nombre) {
        super(nombre, 1200, 80);
        System.out.println("Tu avión caza " + nombre + " está listo para batallar.");
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        int[] danios = {25, 35, 45};
        int danio = danios[random.nextInt(danios.length)];
        String[] sonidos = {"Fiiiiuuuunnn", "Damn bro", "fiuunx2"};
        System.out.println(sonidos[random.nextInt(sonidos.length)]);
        enemigo.recibirDanio(danio);
    }
    @Override
    public void activarHabilidad() {
        System.out.println(nombre + " activa Disparo de Precisión, inflige un golpe crítico!");
    }
}

