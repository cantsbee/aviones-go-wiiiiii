package juego;
import java.util.*;

public class AppJuego {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("\n*********************************************");
        System.out.println("            🕹️ 🛩️BIENVENIDO AL JUEGO! 🕹️       ");
        System.out.println("*********************************************\n");
        System.out.println("Hace años, la humanidad libró una gran guerra en los cielos. ");
        System.out.println("Las naciones cayeron y solo unos pocos pilotos de élite resistieron.");
        System.out.println("Ahora, eres la última esperanza de la resistencia. ");
        System.out.println("¿Estás listo para convertirte en leyenda?\n");

        while (true) {
            System.out.println("\n*************************************************");
            System.out.println("🌟 Menú Principal 🌟");
            System.out.println("1️⃣  Iniciar batalla");
            System.out.println("2️⃣  Mostrar estadísticas de cada personaje");
            System.out.println("3️⃣  Salir");
            System.out.println("*************************************************");
            
            int elegir = OpcionValida(lector, 1, 3);
            
            if (elegir == 1) {
                System.out.println("\n🎮 Jugador 1, elige tu personaje:");
                mostrarOpcionesPersonaje();
                int eleccion1 = OpcionValida(lector, 1, 6);
                lector.nextLine();
                System.out.print("\n🛩️ Ingresa el nombre de tu aeronave🛩️:   ");
                String nombre1 = lector.nextLine();
                Personaje jugador1 = crearPersonaje(eleccion1, nombre1);
                
                System.out.println("\n🎮 Jugador 2, elige tu personaje:");
                mostrarOpcionesPersonaje();
                int eleccion2 = OpcionValida(lector, 1, 6);
                lector.nextLine();
                System.out.print("\n🛩️  Ingresa el nombre de tu aeronave🛩️:  ");
                String nombre2 = lector.nextLine();
                Personaje jugador2 = crearPersonaje(eleccion2, nombre2);
                
                while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
                    ejecutarTurno(jugador1, jugador2, lector);
                    if (jugador2.getVida() <= 0) {
                        System.out.println("\n💥 " + jugador2.getNombre() + " ha sido derrotado. ¡" + jugador1.getNombre() + " gana la batalla! 🥇🥇🥇🥇");
                        break;
                    }
                    ejecutarTurno(jugador2, jugador1, lector);
                    if (jugador1.getVida() <= 0) {
                        System.out.println("\n💥 " + jugador1.getNombre() + " ha sido derrotado. ¡" + jugador2.getNombre() + " gana la batalla! 🥇🥇🥇");
                        break;
                    }
                }
                System.out.println("\n🎮 Fin del juego.");
                break;
            } else if (elegir == 2) {
                while (true) {
                    System.out.println("\n📊 Escoge el avión para ver sus características:");
                    mostrarOpcionesPersonaje();
                    System.out.println("7️⃣  Volver al menú principal");
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
                System.out.println("\n🚪 Saliendo del juego...");
                break;
            }
        }
    }

    public static void ejecutarTurno(Personaje atacante, Personaje defensor, Scanner lector) {
        System.out.println("\n🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮\n");
        System.out.println("🎮 Turno de " + atacante.getNombre());
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1️⃣  Atacar");
        System.out.println("2️⃣  Activar Habilidad");
        System.out.println("3️⃣  Defenderse");
        System.out.println("\n🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮🎮\n");
        int accion = OpcionValida(lector, 1, 3);
        
        if (accion == 1) {
            atacante.atacar(defensor);
        } else if (accion == 2) {
            atacante.activarHabilidad();
        } else if (accion == 3) {
            atacante.defender();
        }
    }

    public static int OpcionValida(Scanner lector, int min, int max) {
        int opcion;
        while (true) {
            System.out.print("\n👀Ingresa tu elección:👀\n ");
            if (lector.hasNextInt()) {
                opcion = lector.nextInt();
                if (opcion >= min && opcion <= max) {
                    return opcion;
                } else {
                    System.out.println("\n🚫 Número fuera de rango, intenta de nuevo.");
                }
            } else {
                System.out.println("\n🚫 Entrada no válida, intenta de nuevo.");
                lector.next();
            }
        }
    }

    public static void mostrarOpcionesPersonaje() {
        System.out.println("\n*************************************************");
        System.out.println("\n🛩️ Selecciona tu personaje:🛩️");
        System.out.println("1️⃣  Caza F16");
        System.out.println("2️⃣  Caza F35");
        System.out.println("3️⃣  Caza J20");
        System.out.println("4️⃣  Portaaviones Clase Nimitz");
        System.out.println("5️⃣  Portaaviones Clase Kuznetsov");
        System.out.println("6️⃣  Portaaviones Clase Queen Elizabeth");
        System.out.println("\n🛩️ *************************************************🛩️");
    }

    public static Personaje crearPersonaje(int eleccion, String nombre) {
        switch (eleccion) {
        case 1 :
        System.out.println("\n*************************************************");
        System.out.println("\nHas elegido un caza F16\n");
        System.out.println("                __|__");
        System.out.println("       ---o-----(_)--(_)-----o---");
        System.out.println("            //             /");
        System.out.println("            //    ___    /");
        System.out.println("             //__/___//__/");
        System.out.println("              |  _  |");
        System.out.println("             /| | | |//");
        System.out.println("            / | | | | //");
        System.out.println("           |  | | | |  |");
        System.out.println("           |__|_|_|_|__|");;
        System.out.println("\n*************************************************");
        return new CazaF16(nombre);
        case 2 : 
        System.out.println("\n*************************************************");
        System.out.println("\nHas elegido un Caza F35\n");
        System.out.println("             __|__");
        System.out.println("      ------[==o==]------");
        System.out.println("            /  |  //");
        System.out.println("           /   |   //");
        System.out.println("          /    |    //");
        System.out.println("   ______/     |     //______");
        System.out.println("  /            |            \\");
        System.out.println(" |_____________|_____________|");
        System.out.println("\n*************************************************");
        return new CazaF35(nombre);
        case 3 :
        System.out.println("\n*************************************************");
        System.out.println("\nHas elegidp un caza J20\n");
        System.out.println("                ///");
        System.out.println("         ______/  //______");
        System.out.println("  -------|   [====]   |-------");
        System.out.println("         //___      ___/");
        System.out.println("             //____/");
        System.out.println("            /      //" + "");
        System.out.println("           /        //" + "");
        System.out.println("          /__________//" + "");
        System.out.println("\n*************************************************");
        return new CazaJ20(nombre);
        case 4 : 
        System.out.println("\n*************************************************");
        System.out.println("\nHas elegido un portaaviones clase Nimitz\n");
        System.out.println("         ___________________________________________________");
        System.out.println("        |                                                   |");
        System.out.println("        |             AIRCRAFT CARRIER                      |");
        System.out.println("        |___________________________________________________|");
        System.out.println("         \\                                               /");
        System.out.println("          \\_____________________________________________/");
        System.out.println("\n*************************************************");
        return new PortaavionesClaseNimitz(nombre);
        case 5 : 
        System.out.println("\n*************************************************");
        System.out.println("Has elegido un portaavion clase Kusnetsov");
        System.out.println("             |");
        System.out.println("             | \\");
        System.out.println("             |  \\");
        System.out.println("             |   \\");
        System.out.println("   _________________________");
        System.out.println("  |                         |");
        System.out.println("  |        Kusnetsov        |");
        System.out.println("  |_________________________|");
        System.out.println("      |  |      |  |      |  |");
        System.out.println("      |  |      |  |      |  |");
        System.out.println("      |  |      |  |      |  |");
        System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("      |        |        |        |");
        System.out.println("      |________|________|________|");
        System.out.println("\n*************************************************");
        return new PortaavionesClasekusnetsov(nombre);
        case 6 : 
        System.out.println("\n*************************************************");
        System.out.println("has elegido un avion clase Queen Elizabeth");
        System.out.println("          |");
        System.out.println("          | \\");
        System.out.println("          |  \\");
        System.out.println("          |   \\");
        System.out.println("  _____________________");
        System.out.println(" |                     |");
        System.out.println(" |   Queen Elizabeth   |");
        System.out.println(" |_____________________|");
        System.out.println("    |  |    |  |    |  |");
        System.out.println("    |  |    |  |    |  |");
        System.out.println("    |  |    |  |    |  |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n*************************************************");
        return new PortaavionesClaseQueenElizabeth(nombre);
        default : 
            System.out.println("\nOpción incorrecta, se te asignará un avión por defecto (Caza J20)");
            return new CazaJ20(nombre);
        }
    }
}


