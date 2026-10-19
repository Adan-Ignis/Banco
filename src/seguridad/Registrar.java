package seguridad;

import java.util.Scanner;

public class Registrar {
	
	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		String nombreUsuario, contraseña1, contraseña2;
		
		System.out.println();
		System.out.println();
		nombreUsuario = scanner.next();
		System.out.println();
		contraseña1 = scanner.next();
		System.out.println();
		contraseña2 = scanner.next();
		
		if (contraseña1 == contraseña2) {}
	}

}
