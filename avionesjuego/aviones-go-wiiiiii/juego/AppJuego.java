package juego;
import java.util.*;

public class AppJuego { 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Jugador 1, elige tu personaje: '1' Caza F16 \n'2' CazaF35 \n'3' Caza J20, \n '4' Portaaviones Clase Nimitz");
        int eleccion1 = lector.nextInt();
        lector.nextLine();
        if(eleccion1==1){
            System.out.println("Has elegido un caza F16");
            System.out.println("                __|__");
            System.out.println("       ---o-----(_)--(_)-----o---");
            System.out.println("            //             /");
            System.out.println("            //    ___    /");
            System.out.println("             //__/___//__/");
            System.out.println("              |  _  |");
            System.out.println("             /| | | |//");
            System.out.println("            / | | | | //");
            System.out.println("           |  | | | |  |");
            System.out.println("           |__|_|_|_|__|");
        }else if(eleccion1==2){
            System.out.println("Has elegido un Caza F35");
            System.out.println("             __|__");
            System.out.println("      ------[==o==]------");
            System.out.println("            /  |  //");
            System.out.println("           /   |   //");
            System.out.println("          /    |    //");
            System.out.println("   ______/     |     //______");
            System.out.println("  /            |            \\");
            System.out.println(" |_____________|_____________|");
        }else if(eleccion1 ==3){
            System.out.println("Has elegidp un caza J20");
            System.out.println("                ///");
            System.out.println("         ______/  //______");
            System.out.println("  -------|   [====]   |-------");
            System.out.println("         //___      ___/");
            System.out.println("             //____/");
            System.out.println("            /      //" + "");
            System.out.println("           /        //" + "");
            System.out.println("          /__________//" + "");
        }else if(eleccion1== 4){
            System.out.println("Has elegido un portaaviones clase Nimitz");
            System.out.println("         ___________________________________________________");
            System.out.println("        |                                                   |");
            System.out.println("        |             AIRCRAFT CARRIER                      |");
            System.out.println("        |___________________________________________________|");
            System.out.println("         \\                                               /");
            System.out.println("          \\_____________________________________________/");
        }else{
            System.out.println("Elige una opcion correcta ");
        }


        System.out.println("Ingresa el nombre de tu aeronave: ");
        String nombre1 = lector.nextLine();
        
        Personaje jugador1;
       
        if (eleccion1 == 1) {
            jugador1 = new F16(nombre1);

        } else if(eleccion1 == 2){
            jugador1 = new F35 (nombre1);

        }else if (eleccion1 == 2) {
            jugador1 = new PortaavionesClaseNimitz(nombre1);
        
        }
        
        System.out.println("Jugador 1, elige tu personaje: '1' Caza F16 \n'2' CazaF35 \n'3' Caza J20, \n '4' Portaaviones Clase Nimitz");
        int eleccion2 = lector.nextInt();
        lector.nextLine();
        if(eleccion2==1){
            System.out.println("Has elegido un caza F16");
            System.out.println("                __|__");
            System.out.println("       ---o-----(_)--(_)-----o---");
            System.out.println("            //             /");
            System.out.println("            //    ___    /");
            System.out.println("             //__/___//__/");
            System.out.println("              |  _  |");
            System.out.println("             /| | | |//");
            System.out.println("            / | | | | //");
            System.out.println("           |  | | | |  |");
            System.out.println("           |__|_|_|_|__|");
        }else if(eleccion2==2){
            System.out.println("Has elegido un Caza F35");
            System.out.println("             __|__");
            System.out.println("      ------[==o==]------");
            System.out.println("            /  |  //");
            System.out.println("           /   |   //");
            System.out.println("          /    |    //");
            System.out.println("   ______/     |     //______");
            System.out.println("  /            |            \\");
            System.out.println(" |_____________|_____________|");
        }else if(eleccion2 ==3){
            System.out.println("Has elegidp un caza J20");
            System.out.println("                ///");
            System.out.println("         ______/  //______");
            System.out.println("  -------|   [====]   |-------");
            System.out.println("         //___      ___/");
            System.out.println("             //____/");
            System.out.println("            /      //" + "");
            System.out.println("           /        //" + "");
            System.out.println("          /__________//" + "");
        }else if(eleccion2== 4){
            System.out.println("Has elegido un portaaviones clase Nimitz");
            System.out.println("         ___________________________________________________");
            System.out.println("        |                                                   |");
            System.out.println("        |             AIRCRAFT CARRIER                      |");
            System.out.println("        |___________________________________________________|");
            System.out.println("         \\                                               /");
            System.out.println("          \\_____________________________________________/");
        }else{
            System.out.println("Elige una opcion correcta ");
        }

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
               
            } if(accion1==2){
                jugador1.atacar(jugador2);
            }
            
            if (jugador2.getVida() <= 0) break;
            
            System.out.println("\nTurno de " + jugador2.getNombre());
            System.out.println("¿Qué deseas hacer? '1' Atacar  '2' Activar Habilidad");
            int accion2 = lector.nextInt();
            if (accion2 == 1) {
                jugador2.atacar(jugador1);
            } else {
                jugador2.activarHabilidad();
            } if(accion2==2){
                jugador2.atacar(jugador1);
            }
        }while (jugador1.getVida() > 0 && jugador2.getVida() > 0);
        System.out.println("\nJuego terminado. ");
        lector.close();
       
        } 
}


