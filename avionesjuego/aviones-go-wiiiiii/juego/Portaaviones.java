package juego;

public abstract class Portaaviones extends Personaje {
        protected int capacidadAviones;
        protected int blindaje;
        
        public Portaaviones(String nombre, int capacidadAviones, int blindaje, int vida) {
            super(nombre, 500);
            this.capacidadAviones = capacidadAviones;
            this.blindaje = blindaje;
            
        }
        
        public int getCapacidadAviones() {
            return capacidadAviones;
        }
        
        public int getBlindaje() {
            return blindaje;
        }

    }
    
