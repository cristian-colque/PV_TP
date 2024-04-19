package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Ingresar un numero [5, 10]");
			 numero = scanner.nextInt();
		
		}while(numero < 5 || numero > 10);
		String [] arrayUsuario = new String[numero];
		
		for(int i=0; i<arrayUsuario.length; i++) {
			  System.out.print("Ingrese un nombre de persona:  " + i + ": ");
			  arrayUsuario[i] = scanner.next();
		}
		int j = arrayUsuario.length -1;
		
		System.out.println("Índice\tNombre");
        for (int i = 0; i < arrayUsuario.length; i++, j--) {
            System.out.println(i + "\t" + arrayUsuario[j]);
        }
        
        scanner.close();

	}

}


