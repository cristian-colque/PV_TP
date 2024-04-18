package ar.edu.unju.fi.ejercicio12.main;


import java.util.Scanner;
import  ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {
	 
	public static void main(String[] args) {
		String nombre;
		int diaDeNacimiento;
		int mesDeNacimiento;
		
		int anioDeNacimiento;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingrese sus nombre: ");
		 nombre = scanner.next();
		 System.out.println("Ingrese su dia de nacimiento : ");
		 diaDeNacimiento = scanner.nextInt();
		 System.out.println("Ingrese su mes de nacimiento : ");
		 mesDeNacimiento = scanner.nextInt();
		 System.out.println("Ingrese su año de nacimiento : ");
		 anioDeNacimiento = scanner.nextInt();
		 
		 Persona persona = new Persona(nombre, anioDeNacimiento, mesDeNacimiento, diaDeNacimiento);
		 System.out.println("Nombre: " + persona.getNombre());
		 System.out.println("Edad: "+ persona.calcularEdad());
		 System.out.println("Signo: "+ persona.signoZodiaco());
		 System.out.println("Estacion: "+ persona.estacion(mesDeNacimiento, diaDeNacimiento));
		 
		 scanner.close();

	}


}
