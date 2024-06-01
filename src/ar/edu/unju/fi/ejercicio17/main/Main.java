package ar.edu.unju.fi.ejercicio17.main;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio17.model.Jugador.Posicion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		
			do {
				
				
					
				System.out.println("Ingresa un numero segun tu opcion: ");
				System.out.println(
						"1 – Alta de jugador\n" +
		                "2 – Mostrar los datos del jugador\n" +
		                "3 – Mostrar todos los jugadores ordenados por apellido\n" +
		                "4 – Modificar los datos de un jugador\n" +
		                "5 – Eliminar un jugador\n" +
		                "6 – Mostrar la cantidad total de jugadores\n" +
		                "7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad\n" +
		                "8 – Salir");
				 opcion = scanner.nextInt();
			
					System.out.println("Ingresa un número válido");
	                scanner.next(); 
	                opcion = 0; 
			
		            scanner.close();
		        
					
			
			switch( opcion) {
			case 1:
				agregarJugador(jugadores);
				break;
			case 2:
				mostrarDatosJugador(jugadores, scanner);
				break;
			case 3:
				mostrarJugadoresOrdenados(jugadores);
				break;
			case 4:
				modificarJugador(jugadores, scanner);
				break;
			case 5:
				 eliminarJugador(jugadores, scanner);
				break;
			case 6:
				 mostrarCantidadTotal(jugadores);
				break;
			case 7:
				  mostrarCantidadPorNacionalidad(jugadores, scanner);
				break;
			case 8:
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opcion invalida ...");
			}
		}while(opcion != 8);
	
    }
	
	private static void agregarJugador(ArrayList<Jugador> jugadores) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento (yyyy-mm-dd): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
        System.out.print("Ingrese la nacionalidad del jugador: ");
        String nacionalidad = scanner.nextLine();
        System.out.print("Ingrese la estatura del jugador: ");
        double estatura = scanner.nextDouble();
        System.out.print("Ingrese el peso del jugador: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Ingrese la posición del jugador: ");
        Posicion posicion = Posicion.valueOf(scanner.next().toUpperCase());
        
     
        jugadores.add(new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion));
    }

    private static void mostrarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.next();
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Nombre: " + jugador.getNombre());
                System.out.println("Apellido: " + jugador.getApellido());
                System.out.println("Fecha de nacimiento: " + jugador.getFechaNacimiento());
                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                System.out.println("Estatura: " + jugador.getEstatura());
                System.out.println("Peso: " + jugador.getPeso());
                System.out.println("Posición: " + jugador.getPosicion());
                return;
            }
        }
        System.out.println("No se encontró al jugador.");
    }

    private static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
        Collections.sort(jugadores, Comparator.comparing(Jugador::getApellido));
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getApellido() + ", " + jugador.getNombre());
        }
    }

    private static void modificarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.next();
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.print("Ingrese la nueva nacionalidad: ");
                jugador.setNacionalidad(scanner.next());
                return;
            }
        }
        System.out.println("No se encontró al jugador.");
    }

    private static void eliminarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.next();
        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove();
                System.out.println("Jugador eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encontró al jugador.");
    }

    private static void mostrarCantidadTotal(ArrayList<Jugador> jugadores) {
        System.out.println("Cantidad total de jugadores: " + jugadores.size());
    }

    private static void mostrarCantidadPorNacionalidad(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.next();
        int cantidad = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                cantidad++;
            }
        }
        System.out.println("Cantidad de jugadores de " + nacionalidad + ": " + cantidad);
    }
}
