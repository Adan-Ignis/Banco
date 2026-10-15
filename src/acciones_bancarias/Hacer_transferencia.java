package acciones_bancarias;

import java.util.Scanner;

public final class Hacer_transferencia {
	
	public void Accion_dinero() {
		Scanner scanner = new Scanner(System.in);
		String nombreString;
		
		System.out.println("¿Ha quien quieres hacerle una transferencia?");
		System.out.println("Usuario: ");
		
		nombreString = scanner.next();
		scanner.close();
	}

}
