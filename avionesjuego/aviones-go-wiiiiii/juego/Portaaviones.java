package juego;

public abstract class Portaaviones extends Personaje {
        protected int capacidadAviones;
        protected int blindaje;
        String sistemaDefensa;
        int velocidad;
        int poder;
        
        public Portaaviones(String nombre, int capacidadAviones, int blindaje, int vida, String sistemaDefensa, int velocidad, int poder) {
            super(nombre, vida);
            this.capacidadAviones = capacidadAviones;
            this.blindaje = blindaje;
        }
        public int getCapacidadAviones() {
            return capacidadAviones;
        }
        
        public int getBlindaje() {
            return blindaje;
        }
        public String getSistemaDefensa(){
            return sistemaDefensa;
        }
        public int getVelocidad(){
            return velocidad;
        }
        public int poder(){
            return poder;
        }
    }
    
