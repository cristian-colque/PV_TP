package ar.edu.unju.fi.ejercicio5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int numero = 1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un numero [1-9]");
		if(scanner.hasNextInt()) {
			
			numero = scanner.nextInt();
			if(numero >= 1 && numero <= 9) {
				
				for(int i=0; i <= 10; i++) {
					
					System.out.println(numero +" "+ "x"+" " + i +" "+ "=" +" "+ (numero * i));
				}
				
			} else
				System.out.println("Fuera de rango");
		}else 
			System.out.println("Numero no entero");
		
		scanner.close();
	}

}
