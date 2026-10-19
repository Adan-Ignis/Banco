package acciones_administrador;

import java.util.Scanner;

public final class Congelar_usuario {
	
	public void congelar_usuario() {
		Scanner scanner = new Scanner(System.in);
		String nombreString;
		
		System.out.println("¿Ha quien quieres congelar?");
		System.out.println("Usuario: ");
		
		nombreString = scanner.next();
		scanner.close();
	}

}
