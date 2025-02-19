package Juego;
import java.util.*;

public class AppJuego {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		Avion a1 = new Avion("sdad", "adasd", "144", "552", 20.6, 2.2, "p", 2.34);
		int opcion = 0;
		System.out.println("\n ELIGE UNA OPCION \n Presiona '1' para seleccionar un avion \n '2' para seleccionar un helicoptero \n '3' para seleccionar un portaaviones");
		opcion = lector.nextInt();
		if(opcion==1) {
			do { 
				a1.menu();
				opcion= lector.nextInt();
				switch (opcion) {
					case 1:
					System.out.println("HAS ELEGIDO UN AVION CAZA F16");
					break;
					case 2:
					System.out.println("HAS ELEGIDO UN AVION CAZA F35");
					case 3:
					System.out.println("HAS ELEGIDO UN AVION CAZA J20");
					break;
					case 4:
					System.out.println("Saliendo del programa");
					break;
					default:
					System.out.println("Opcion no valida, elige una opcion correcta");
				}
			
		}while (opcion!=4);
		}
	lector.close();
		
	}
	
}
