package acciones_bancarias;

import java.util.Scanner;

public final class Sacar_dinero {
	
	public void Accion_dinero() {
		Scanner scanner = new Scanner(System.in);
		int cantidad;
		
		System.out.println("¿Cuanto dinero quieres sacar?");
		System.out.println("Cantidad: ");
		
		cantidad = scanner.nextInt();
		scanner.close();
	}

}
