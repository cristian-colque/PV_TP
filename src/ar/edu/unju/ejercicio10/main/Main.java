package ar.edu.unju.ejercicio10.main;

import java.util.Scanner;
import ar.edu.unju.ejercicio10.model.Pizza;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza[] pizzas = new Pizza[3];

        for (int i = 0; i < 3; i++) {
            pizzas[i] = new Pizza();

            System.out.print("Ingrese el diámetro de la pizza " + (i + 1) + " (20, 30, 40): ");
            int diametro = scanner.nextInt();
            pizzas[i].setDiametro(diametro);

            System.out.print("¿Tiene ingredientes especiales la pizza " + (i + 1) + "? (true/false): ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            pizzas[i].setIngredientesEspeciales(ingredientesEspeciales);

            pizzas[i].calcularPrecio();
            pizzas[i].calcularArea();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\n** Pizza " + (i + 1) + " **");
            System.out.println("Diámetro = " + pizzas[i].getDiametro());
            System.out.println("Ingredientes especiales = " + pizzas[i].isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizzas[i].getPrecio() + "$");
            System.out.println("Área de la pizza = " + pizzas[i].getArea());
        }

        scanner.close();
    }
}
