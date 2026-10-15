package acciones_bancarias;

import java.util.Scanner;

public final class Meter_dinero {
	
	public void Accion_dinero() {
		Scanner scanner = new Scanner(System.in);
		int cantidad;
		
		System.out.println("¿Cuanto dinero quieres meter?");
		System.out.println("Cantidad: ");
		
		cantidad = scanner.nextInt();
		scanner.close();
	}

}
