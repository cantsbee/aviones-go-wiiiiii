package juego;

class CazaF35 extends Avion {

    public CazaF35(String nombre) {
        super(nombre, 1200, 80, 450);
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

    public void habilidadEspecial(Personaje enemigo){
        int[] danos = {40, 60, 80};
        int danio = danos[random.nextInt(danos.length)];
        enemigo.recibirDanio(danio);
    }
}

