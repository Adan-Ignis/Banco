package seguridad;

import java.util.Scanner;

public class Inicio_sesion {
	
	public void iniciar() {
		Scanner scanner = new Scanner(System.in);
		String nombreUsuario, contraseña;
		
		System.out.println();
		System.out.println("Nombre de usuario: ");
		nombreUsuario = scanner.next();
		System.out.println("Contraseña: ");
		contraseña = scanner.next();
	}

}
