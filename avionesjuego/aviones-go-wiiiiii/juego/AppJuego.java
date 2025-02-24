package juego;
import java.util.*;


public class AppJuego { 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("\n*********************************************\n              BIENVENIDO AL JUEGO!        \n*********************************************\n Eres un piloto de élite de la resistencia, nuestra última esperanza. Tu escuadrón ha sido diezmado, y ahora solo quedas tú entre el enemigo y la libertad.\n" + //
                        "\n" + //
                        "El cielo es tu campo de batalla.\n" + //
                        "\n" + //
                        "La guerra ha comenzado. ¿Estás listo para volar?\n"
                        );



        System.out.println("\n************************************************************************************************************\n");
        System.out.println("\nSelecciona 1 para iniciar batalla, 2 para mostrar stats de cada personaje. Elige con cuidado, soldado!\n");
        System.out.println("\n************************************************************************************************************\n");
        int elegir=lector.nextInt();
        if (elegir==1) {
        System.out.println("\nJugador 1, elige tu personaje:\n'1' Caza F16 \n'2' Caza F35 \n'3' Caza J20 \n'4' Portaaviones Clase Nimitz\n'5' Portaaviones clase Kusnetsov\n'6' Portaavion clase Queen Elizabeth");
        int eleccion1 = OpcionValida(lector);
        System.out.println("\nIngresa el nombre de tu aeronave: ");
        lector.nextLine();
        String nombre1 = lector.nextLine();
        
        Personaje jugador1 = crearPersonaje(eleccion1, nombre1);
        
        System.out.println("\nJugador 1, elige tu personaje:\n'1' Caza F16 \n'2' Caza F35 \n'3' Caza J20 \n'4' Portaaviones Clase Nimitz\n'5' Portaaviones clase Kusnetsov\n'6' Portaavion clase Queen Elizabeth");
        int eleccion2 = OpcionValida(lector);
        System.out.println("\nIngresa el nombre de tu aeronave: ");
        lector.nextLine();
        String nombre2 = lector.nextLine();
        Personaje jugador2 = crearPersonaje(eleccion2, nombre2);

        while (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
            ejecutarTurno(jugador1, jugador2, lector);
            if (jugador2.getVida() <= 0 || jugador1.getVida() <= 0) break;
            ejecutarTurno(jugador2, jugador1, lector);
        }

        System.out.println("\nJuego terminado.");
       
    }else if(elegir==2){
        System.out.println("escoje de que avion quieres ver sus caracteristicas '1' para caza F16, '2' para Caza F35, '3' para Caza J20, '4' para portaaviones clase Nimitz, '5' para cancelar");
        int opcionn=lector.nextInt();
        if(opcionn==1){
            CazaF16.mostrarDatos();
         }else if(opcionn==2){
            CazaF35.mostrarDatos();
            }else if(opcionn==3){
            CazaJ20.mostrarDatos();
                }else if(opcionn==4){
                    PortaavionesClaseNimitz.mostrarDatos();
                    }else if(opcionn==5){
                        System.out.println("saliendo...");
                    }else{
                        System.out.println("opcion invalida");
                    }
                    
                  }
}

    public static void ejecutarTurno(Personaje atacante, Personaje defensor, Scanner lector) {
        System.out.println("\nTurno de " + atacante.getNombre());
        System.out.println("¿Qué deseas hacer?\n'1' Atacar  \n'2' Activar Habilidad");
        int accion = lector.nextInt();
        if (accion == 1) {
            atacante.atacar(defensor);
        } else if (accion == 2) {
            atacante.activarHabilidad();

        }
    }

public static int OpcionValida(Scanner lector) {
    int opcion = 0;
    while (true) {
        System.out.println("\nIngresa tu elección: ");
        try {
            opcion = lector.nextInt();
            if (opcion >= 1 && opcion <= 7) {
                return opcion;
            } else {
                System.out.println("\nNúmero fuera de rango, intenta de nuevo.");
            }
        } catch (Exception e) {
            System.out.println("\nEntrada no válida, intenta de nuevo.");
            lector.nextLine();  
        }
    }
}




    public static Personaje crearPersonaje(int eleccion, String nombre) {
        switch (eleccion) {
            case 1:
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
            return new CazaF16(nombre);

            case 2:
            System.out.println("\nHas elegido un Caza F35\n");
            System.out.println("             __|__");
            System.out.println("      ------[==o==]------");
            System.out.println("            /  |  //");
            System.out.println("           /   |   //");
            System.out.println("          /    |    //");
            System.out.println("   ______/     |     //______");
            System.out.println("  /            |            \\");
            System.out.println(" |_____________|_____________|");
            return new CazaF35(nombre);

            case 3: 
            System.out.println("\nHas elegidp un caza J20\n");
            System.out.println("                ///");
            System.out.println("         ______/  //______");
            System.out.println("  -------|   [====]   |-------");
            System.out.println("         //___      ___/");
            System.out.println("             //____/");
            System.out.println("            /      //" + "");
            System.out.println("           /        //" + "");
            System.out.println("          /__________//" + "");
            return new CazaJ20(nombre);

            case 4: 
            System.out.println("\nHas elegido un portaaviones clase Nimitz\n");
            System.out.println("         ___________________________________________________");
            System.out.println("        |                                                   |");
            System.out.println("        |             AIRCRAFT CARRIER                      |");
            System.out.println("        |___________________________________________________|");
            System.out.println("         \\                                               /");
            System.out.println("          \\_____________________________________________/");

            return new PortaavionesClaseNimitz(nombre);

            case 5:
            System.out.println("Has elegido un portaavion clase Kusnetsov");
                    System.out.println("             |");
                    System.out.println("             | \\");
                    System.out.println("             |  \\");
                    System.out.println("             |   \\");
                    System.out.println("   _________________________");
                    System.out.println("  |                         |");
                    System.out.println("  |    Portaaviones Kusnetsov   |");
                    System.out.println("  |_________________________|");
                    System.out.println("      |  |      |  |      |  |");
                    System.out.println("      |  |      |  |      |  |");
                    System.out.println("      |  |      |  |      |  |");
                    System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("      |        |        |        |");
                    System.out.println("      |________|________|________|");

                    return new PortaavionesClasekusnetsov(nombre);

            case 6:
            System.out.println("has elegido un avion clase Queen Elizabeth");
            System.out.println("          |");
            System.out.println("          | \\");
            System.out.println("          |  \\");
            System.out.println("          |   \\");
            System.out.println("  _____________________");
            System.out.println(" |                     |");
            System.out.println(" |      Queen Elizabeth   |");
            System.out.println(" |_____________________|");
            System.out.println("    |  |    |  |    |  |");
            System.out.println("    |  |    |  |    |  |");
            System.out.println("    |  |    |  |    |  |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            return new PortaavionesClaseQueenElizabeth(nombre);

            default:
                System.out.println("\nOpción incorrecta, se te asignara un avion por defecto");
                return new CazaJ20(nombre);
        }
    }
}

