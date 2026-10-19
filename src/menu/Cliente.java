package menu;

import java.util.Scanner;

public class Cliente {
	
	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		System.out.println("Menu-cliente");
		System.out.println();
		System.out.println("1) Ver dinero");
		System.out.println("2) Sacar dinero");
		System.out.println("3) Meter dinero");
		System.out.println("4) Hacer transferencia");
		System.out.println("5) Salir");
		System.out.println();
		System.out.println("Opcion: ");
		
		opcion = scanner.nextInt();
		scanner.close();
		
		switch (opcion) {
			case 1:
				// Opcion 1
				break;
			case 2:
				// Opcion 2
				break;
			case 3:
				// Opcion 3
				break;
			case 4:
				// Opcion 4
				break;
			case 5:
				// Opcion 5
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
	}

}
