package ar.edu.unju.fi.ejercicio4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		short numero= 1;
		boolean bandera = false;
		Scanner scanner = new Scanner(System.in);
		while (! bandera ) {
			
			System.out.println("Ingrese un numero [1-10]");
			 numero = scanner.nextShort();
			
			if (numero >= 1 && numero <= 10) {
				bandera = true;
			}
		}
		
		int factorial = 1;
        int i = 1;

        while (i <= numero) {
            factorial *= i;
            i++;
        }

    
        System.out.println("El factorial de " + numero + " es: " + factorial);
        scanner.close();
    }
	 
}
