package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Ingresar un numero [3, 10]");
			 numero = scanner.nextInt();
		
		}while(numero < 3 || numero > 10);
		
		int [] arrayUsuario = new int[numero];
		int sumaTotal = 0;
		
		for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arrayUsuario[i] = scanner.nextInt();
            sumaTotal +=  arrayUsuario[i];
        }
		
		System.out.println("Índice\tValor");
        for (int i = 0; i < arrayUsuario.length; i++) {
            System.out.println(i + "\t" + arrayUsuario[i]);
        }
    
		System.out.println("Suma de todos los valores ingresados: " + sumaTotal);
		scanner.close();
	
		
	}		

}

