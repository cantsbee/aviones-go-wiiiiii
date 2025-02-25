package juego;
import java.util.*;

public class AppJuego {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("\n*********************************************\n              BIENVENIDO AL JUEGO!        \n*********************************************\n");
        System.out.println("Hace años, la humanidad libró una gran guerra en los cielos. Las naciones cayeron y solo unos pocos pilotos de élite resistieron el avance del enemigo. Ahora, eres la última esperanza de la resistencia. Debes tomar los cielos, luchar con valentía y reclamar la victoria. ¿Estás listo para convertirte en leyenda?\n");
        
        System.out.println("\nEl cielo es tu campo de batalla.\n\nLa guerra ha comenzado. ¿Estás listo para volar?\n");

        while (true) {
            System.out.println("\n************************************************************************************************************\n");
            System.out.println("\nSelecciona 1 para iniciar batalla, 2 para mostrar stats de cada personaje, 3 para salir. Elige con cuidado, soldado!\n");
            System.out.println("\n************************************************************************************************************\n");
            
            int elegir = OpcionValida(lector, 1, 3);
            
            if (elegir == 1) {
                System.out.println("\nJugador 1, elige tu personaje:");
                mostrarOpcionesPersonaje();
                int eleccion1 = OpcionValida(lector, 1, 6);
                lector.nextLine();
                System.out.println("\nIngresa el nombre de tu aeronave: ");
                String nombre1 = lector.nextLine();
                Personaje jugador1 = crearPersonaje(eleccion1, nombre1);
                
                System.out.println("\nJugador 2, elige tu personaje:");
                mostrarOpcionesPersonaje();
                int eleccion2 = OpcionValida(lector, 1, 6);
                lector.nextLine();
                System.out.println("\nIngresa el nombre de tu aeronave: ");
                String nombre2 = lector.nextLine();
                Personaje jugador2 = crearPersonaje(eleccion2, nombre2);
                
                while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
                    ejecutarTurno(jugador1, jugador2, lector);
                    if (jugador2.getVida() <= 0) {
                        System.out.println("\n" + jugador2.getNombre() + " ha sido derrotado. ¡" + jugador1.getNombre() + " gana la batalla!");
                        break;
                    }
                    ejecutarTurno(jugador2, jugador1, lector);
                    if (jugador1.getVida() <= 0) {
                        System.out.println("\n" + jugador1.getNombre() + " ha sido derrotado. ¡" + jugador2.getNombre() + " gana la batalla!");
                        break;
                    }
                }
                System.out.println("\nFin del juego.");
                break;
            } else if (elegir == 2) {
                while (true) {
                    System.out.println("Escoge el avión para ver sus características:");
                    mostrarOpcionesPersonaje();
                    System.out.println("'7' para volver al menú principal");
                    int opcionn = OpcionValida(lector, 1, 7);
                    
                    if (opcionn == 7) break;
                    
                    switch (opcionn) {
                        case 1 -> CazaF16.mostrarDatos();
                        case 2 -> CazaF35.mostrarDatos();
                        case 3 -> CazaJ20.mostrarDatos();
                        case 4 -> PortaavionesClaseNimitz.mostrarDatos();
                        case 5 -> PortaavionesClasekusnetsov.mostrarDatos();
                        case 6 -> PortaavionesClaseQueenElizabeth.mostrarDatos();
                    }
                }
            } else {
                System.out.println("Saliendo del juego...");
                break;
            }
        }
    }

    public static void ejecutarTurno(Personaje atacante, Personaje defensor, Scanner lector) {
        System.out.println("\nTurno de " + atacante.getNombre());
        System.out.println("¿Qué deseas hacer?\n'1' Atacar  \n'2' Activar Habilidad");
        int accion = OpcionValida(lector, 1, 2);
        if (accion == 1) {
            atacante.atacar(defensor);
        } else {
            atacante.activarHabilidad();
        }
    }

    public static int OpcionValida(Scanner lector, int min, int max) {
        int opcion;
        while (true) {
            System.out.println("\nIngresa tu elección: ");
            if (lector.hasNextInt()) {
                opcion = lector.nextInt();
                if (opcion >= min && opcion <= max) {
                    return opcion;
                } else {
                    System.out.println("\nNúmero fuera de rango, intenta de nuevo.");
                }
            } else {
                System.out.println("\nEntrada no válida, intenta de nuevo.");
                lector.next();
            }
        }
    }

    public static void mostrarOpcionesPersonaje() {
        System.out.println("'1' Caza F16 \n'2' Caza F35 \n'3' Caza J20 \n'4' Portaaviones Clase Nimitz\n'5' Portaaviones clase Kusnetsov\n'6' Portaavion clase Queen Elizabeth");
    }
    
    public static Personaje crearPersonaje(int eleccion, String nombre) {
        return switch (eleccion) {
            case 1 -> new CazaF16(nombre);
            case 2 -> new CazaF35(nombre);
            case 3 -> new CazaJ20(nombre);
            case 4 -> new PortaavionesClaseNimitz(nombre);
            case 5 -> new PortaavionesClasekusnetsov(nombre);
            case 6 -> new PortaavionesClaseQueenElizabeth(nombre);
            default -> {
                System.out.println("\nOpción incorrecta, se te asignará un avión por defecto (Caza J20)");
                yield new CazaJ20(nombre);
            }
        };
    }
}
