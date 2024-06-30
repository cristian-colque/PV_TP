package ar.edu.unju.ejercicio18.main;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.ejercicio18.model.Pais;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pais> paises = new ArrayList<>();
        ArrayList<DestinoTuristico> destinosTuristicos = new ArrayList<>();

        // Precarga de países
        paises.add(new Pais("ARG", "Argentina"));
        paises.add(new Pais("BRA", "Brasil"));
        paises.add(new Pais("USA", "Estados Unidos"));

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 – Alta de destino turístico");
            System.out.println("2 – Mostrar todos los destinos turísticos");
            System.out.println("3 – Modificar el país de un destino turístico");
            System.out.println("4 – Limpiar el ArrayList de destino turísticos");
            System.out.println("5 – Eliminar un destino turístico");
            System.out.println("6 – Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 – Mostrar todos los países");
            System.out.println("8 – Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 – Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese el código del destino turístico: ");
                        String codigo = scanner.nextLine();
                        System.out.print("Ingrese el nombre del destino turístico: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio del destino turístico: ");
                        double precio = scanner.nextDouble();
                        System.out.print("Ingrese la cantidad de días: ");
                        int cantidadDias = scanner.nextInt();
                        scanner.nextLine();  // Consumir el salto de línea
                        System.out.print("Ingrese el código del país: ");
                        String codigoPais = scanner.nextLine();

                        Pais pais = null;
                        for (Pais p : paises) {
                            if (p.getCodigo().equals(codigoPais)) {
                                pais = p;
                                break;
                            }
                        }

                        if (pais == null) {
                            System.out.println("País no encontrado.");
                        } else {
                            DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
                            destinosTuristicos.add(destino);
                            System.out.println("Destino turístico agregado exitosamente.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al agregar destino turístico: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Destinos turísticos:");
                    for (DestinoTuristico destino : destinosTuristicos) {
                        System.out.println(destino);
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Ingrese el código del destino turístico a modificar: ");
                        String codigoDestino = scanner.nextLine();
                        System.out.print("Ingrese el nuevo código del país: ");
                        String nuevoCodigoPais = scanner.nextLine();

                        Pais nuevoPais = null;
                        for (Pais p : paises) {
                            if (p.getCodigo().equals(nuevoCodigoPais)) {
                                nuevoPais = p;
                                break;
                            }
                        }

                        if (nuevoPais == null) {
                            System.out.println("País no encontrado.");
                        } else {
                            boolean encontrado = false;
                            for (DestinoTuristico destino : destinosTuristicos) {
                                if (destino.getCodigo().equals(codigoDestino)) {
                                    destino.setPais(nuevoPais);
                                    encontrado = true;
                                    System.out.println("País del destino turístico modificado exitosamente.");
                                    break;
                                }
                            }
                            if (!encontrado) {
                                System.out.println("Destino turístico no encontrado.");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error al modificar país del destino turístico: " + e.getMessage());
                    }
                    break;
                case 4:
                    destinosTuristicos.clear();
                    System.out.println("Lista de destinos turísticos limpiada.");
                    break;
                case 5:
                    try {
                        System.out.print("Ingrese el código del destino turístico a eliminar: ");
                        String codigoEliminar = scanner.nextLine();
                        Iterator<DestinoTuristico> iterator = destinosTuristicos.iterator();
                        boolean eliminado = false;
                        while (iterator.hasNext()) {
                            DestinoTuristico destino = iterator.next();
                            if (destino.getCodigo().equals(codigoEliminar)) {
                                iterator.remove();
                                eliminado = true;
                                System.out.println("Destino turístico eliminado exitosamente.");
                                break;
                            }
                        }
                        if (!eliminado) {
                            System.out.println("Destino turístico no encontrado.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error al eliminar destino turístico: " + e.getMessage());
                    }
                    break;
                case 6:
                    destinosTuristicos.sort(Comparator.comparing(DestinoTuristico::getNombre));
                    System.out.println("Destinos turísticos ordenados por nombre:");
                    for (DestinoTuristico destino : destinosTuristicos) {
                        System.out.println(destino);
                    }
                    break;
                case 7:
                    System.out.println("Países:");
                    for (Pais pais : paises) {
                        System.out.println(pais);
                    }
                    break;
                case 8:
                    try {
                        System.out.print("Ingrese el código del país: ");
                        String codigoPaisBuscar = scanner.nextLine();
                        System.out.println("Destinos turísticos en el país con código " + codigoPaisBuscar + ":");
                        for (DestinoTuristico destino : destinosTuristicos) {
                            if (destino.getPais().getCodigo().equals(codigoPaisBuscar)) {
                                System.out.println(destino);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error al mostrar destinos turísticos por país: " + e.getMessage());
                    }
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
