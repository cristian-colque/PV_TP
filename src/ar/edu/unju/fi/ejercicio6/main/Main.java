package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;



public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Construcción de un objeto utilizando el constructor por defecto
        System.out.println("Ingrese los datos para la persona (Constructor por defecto):");
        Persona persona1 = new Persona();
        ingresarDatosPersona(scanner, persona1);
        persona1.mostrarDatos();
        System.out.println();
        
        // Construcción de un objeto utilizando el constructor parametrizado
        System.out.println("Ingrese los datos para la persona (Constructor parametrizado):");
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();
        Persona persona2 = new Persona(dni, nombre, fechaNacimiento, provincia);
        persona2.mostrarDatos();
        System.out.println();
        
        // Construcción de un objeto utilizando el constructor que lleva como parámetros el dni, nombre y fecha de nacimiento
        System.out.println("Ingrese los datos para la persona (Constructor con dni, nombre y fecha de nacimiento):");
        System.out.print("DNI: ");
        dni = scanner.nextLine();
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        fechaNacimiento = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni, nombre, fechaNacimiento);
        persona3.mostrarDatos();
        
        scanner.close();
    }

    private static void ingresarDatosPersona(Scanner scanner, Persona persona) {
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        persona.setDni(dni);
        
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        persona.setNombre(nombre);
        
        System.out.print("Fecha de Nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        persona.setFechaNacimiento(fechaNacimiento);
        
        System.out.print("Provincia: ");
        String provincia = scanner.nextLine();
        persona.setProvincia(provincia);
    }

}
