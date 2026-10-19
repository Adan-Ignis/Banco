package acciones_administrador;

import java.util.Scanner;

public final class Descongelar_usuario {
	
	public void descongelar_usuario() {
		Scanner scanner = new Scanner(System.in);
		String nombreString;
		
		System.out.println("¿Ha quien quieres descongelar?");
		System.out.println("Usuario: ");
		
		nombreString = scanner.next();
		scanner.close();
	}

}
