package menu;

import java.util.Scanner;

public class Administrador {
	
	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		System.out.println("Menu-Administrador:");
		System.out.println();
		System.out.println("1) Congelar usuario");
		System.out.println("2) Des-congelar usuario");
		System.out.println();
		System.out.print("Opcion: ");
		
		opcion = scanner.nextInt();
		scanner.close();
		
		switch (opcion) {
			case 1:
				// Opcion 1
				break;
			case 2:
				// Opcion 2
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
	}

}
