package acciones_administrador;

import java.util.Scanner;

public class Congelar_usuario {
	
	public void Congelar_usuario() {
		Scanner scanner = new Scanner(System.in);
		String nombreString;
		
		System.out.println("¿Ha quien quieres congelar?");
		System.out.println("Usuario: ");
		
		nombreString = scanner.next();
		scanner.close();
	}

}
