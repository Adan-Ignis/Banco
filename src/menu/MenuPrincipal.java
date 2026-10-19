package menu;

import java.util.Scanner;

public class MenuPrincipal {
	
	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		int opcion;
		
		Cliente menuCliente = new Cliente();
		Administrador menuAdministrador = new Administrador();
		Banquero menuBanquero = new Banquero();
		
		System.out.println("¿Que tipo de usuario eres?:");
		System.out.println();
		System.out.println("1) Administrador");
		System.out.println("2) Banquero");
		System.out.println("3) Cliente");
		System.out.println();
		System.out.print("Opcion: ");
		
		opcion = scanner.nextInt();
		scanner.close();
		
		// Antes de entrar en cualquier menu el usuario debe iniciar sesión
		switch (opcion) {
		case 1:
			menuCliente.iniciar();
			break;
		case 2:
			menuAdministrador.iniciar();
			break;
		case 3:
			menuBanquero.iniciar();
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}

}
