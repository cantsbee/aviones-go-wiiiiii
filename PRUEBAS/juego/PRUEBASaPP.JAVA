// package Juego;
// import java.util.*;
// public class Juego {
//     public static void main(String[] args) {
//         lector lector = new lector(System.in);
        
//         System.out.println("Elige tu personaje: 1) Caza F16  2) Caza F35  3) Caza J20  4) Portaaviones Nimitz");
//         int eleccion = lector.nextInt();
//         lector.nextLine();
        
//         System.out.println("Ingresa el nombre de tu aeronave: ");
//         String nombreUsuario = lector.nextLine();
        
//         Personaje jugador;
//         switch (eleccion) {
//             case 1 -> jugador = new F16(nombreUsuario);
//             case 2 -> jugador = new F35(nombreUsuario);
//             case 3 -> jugador = new J20(nombreUsuario);
//             default -> jugador = new PortaavionesClaseNimitz(nombreUsuario);
//         }
//         while (jugador.getVida() > 0 && enemigo.getVida() > 0) {
//             System.out.println("\n¿Qué deseas hacer? 1) Atacar  2) Activar Habilidad");
//             int opcion = lector.nextInt();
            
//             if (opcion == 1) {
//                 jugador.atacar(enemigo);
//             } else {
//                 jugad.activarHabilidad();
//             }
//         }
        
//         System.out.println("\nJuego terminado. " + (jugador.getVida() > 0 ? "¡Ganaste!" : "¡Perdiste!"));
//         lector.close();
//     }
// }

package juego;
import java.util.*;

public class PRUEBASaPP { 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("--------------BIENVENIDO AL JUEGO!--------------\n************************************************\n----Estás preparado para comenzar la batalla?----\n");
        System.out.println("Jugador 1, elige tu personaje: 1) Caza F16  2) Portaaviones Nimitz");
        int eleccion1 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingresa el nombre de tu aeronave: ");
        String nombre1 = lector.nextLine();
        
        Personaje jugador1;
        if (eleccion1 == 1) {
            jugador1 = new F16(nombre1);

        } else {
            jugador1 = new PortaavionesClaseNimitz(nombre1);
        }
        
        System.out.println("Jugador 2, elige tu personaje: 1) Caza F16  2) Portaaviones Nimitz");
        int eleccion2 = lector.nextInt();
        lector.nextLine();
        System.out.println("Ingresa el nombre de tu aeronave: ");
        String nombre2 = lector.nextLine();
        
        Personaje jugador2;
        if (eleccion2 == 1) {
            jugador2 = new F16(nombre2);
        } else {
            jugador2 = new PortaavionesClaseNimitz(nombre2);
        }
        
        do {
            System.out.println("\nTurno de " + jugador1.getNombre());
            System.out.println("¿Qué deseas hacer? '1' Atacar  '2' Activar Habilidad");
            int accion1 = lector.nextInt();
            if (accion1 == 1) {
                jugador1.atacar(jugador2);
            } else {
                jugador1.activarHabilidad();
                // if(accion1==2){
                //     jugador2.habilidadEspecial();
                // }
            }
            
            if (jugador2.getVida() <= 0) break;
            
            System.out.println("\nTurno de " + jugador2.getNombre());
            System.out.println("¿Qué deseas hacer? '1' Atacar  '2' Activar Habilidad");
            int accion2 = lector.nextInt();
            if (accion2 == 1) {
                jugador2.atacar(jugador1);
            } else {
                jugador2.activarHabilidad();
            // } if(accion2==2){
            //     jugador1.habilidadEspecial();
            // }
            
        } while (jugador1.getVida() > 0 && jugador2.getVida() > 0);
        
        System.out.println("\nJuego terminado. ");
        lector.close();
        }
}
}

