package menu;

import java.util.Scanner;

public class Main {
	
	public void MenuPrincipal() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		System.out.println("¿Que tipo de usuario eres?:");
		System.out.println();
		System.out.println("1) Administrador");
		System.out.println("2) Cliente");
		System.out.println();
		System.out.print("Opcion: ");
		
		opcion = scanner.nextInt();
		scanner.close();
		
		// Antes de entrar en cualquier menu el usuario debe iniciar sesión
		switch (opcion) {
		case 1:
			Administrador menu1 = new Administrador();
			menu1.MenuAdministrador();
			break;
		case 2:
			Cliente menu2 = new Cliente();
			menu2.MenuCliente();
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}

}
