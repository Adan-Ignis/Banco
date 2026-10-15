package menu;

import java.util.Scanner;

public class Banquero {
	
	public void MenuBanquero() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		System.out.println("Menu-Banquero:");
		System.out.println();
		System.out.println("1)");
		System.out.println("2)");
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
			default:
				System.out.println("Opcion no valida");
				break;
		}
	}

}
