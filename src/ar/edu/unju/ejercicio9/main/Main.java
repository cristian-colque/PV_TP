package ar.edu.unju.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.ejercicio9.model.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[3];

        for (int i = 0; i < 3; i++) {
            productos[i] = new Producto();

            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i].setNombre(scanner.nextLine());

            System.out.print("Ingrese el código del producto " + (i + 1) + ": ");
            productos[i].setCodigo(scanner.nextLine());

            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            productos[i].setPrecio(scanner.nextDouble());

            System.out.print("Ingrese el descuento del producto " + (i + 1) + " (entre 0 y 50): ");
            productos[i].setDescuento(scanner.nextInt());
            scanner.nextLine(); // Limpiar el buffer del scanner
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nDatos del producto " + (i + 1) + ":");
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Código: " + productos[i].getCodigo());
            System.out.println("Precio: " + productos[i].getPrecio());
            System.out.println("Descuento: " + productos[i].getDescuento() + "%");
            System.out.println("Precio con descuento: " + productos[i].calcularDescuento());
        }
        
        scanner.close();
    }
}

