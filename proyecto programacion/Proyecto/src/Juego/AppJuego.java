package Juego;
import java.util.*;

public class AppJuego {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		Avion a1 = new Avion (12, "sdad", "adasd", 144, 55, "dasd", "adasd");
		int opcion1 = 0;
		System.out.println("Elige 1 para seleccionar un avion");
		if(opcion1==1) {
			do { 
				a1.menu();
				opcion1= lector.nextInt();
				switch (opcion1) {
				
				
				}
			
		}while (opcion1!=4);
		}
	
		
		
		
	}
	
}

		
