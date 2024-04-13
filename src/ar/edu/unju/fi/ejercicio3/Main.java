package ar.edu.unju.fi.ejercicio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        boolean esEntero = false;

    
        while (!esEntero) {
            System.out.print("Ingrese un número entero: ");

            
            if (scanner.hasNextInt()) {
               
                numero = scanner.nextInt();
                esEntero = true; 
            } else {
                
                System.out.println("Error: Debes ingresar un número entero.");
                scanner.next();
            }
        }

        
        if (numero % 2 == 0) {
          
            int triple = numero * 3;
            System.out.println("El número ingresado es par. El triple del número es: " + triple);
        } else {
           
            int doble = numero * 2;
            System.out.println("El número ingresado es impar. El doble del número es: " + doble);
        }

       
        scanner.close();
    }
}

