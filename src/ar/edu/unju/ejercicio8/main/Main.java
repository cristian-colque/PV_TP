package ar.edu.unju.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.ejercicio8.model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        CalculadoraEspecial calculadora = new CalculadoraEspecial();
        calculadora.setN(n);

        double sumatoria = calculadora.calcularSumatoria();
        double productoria = calculadora.calcularProductoria();

        System.out.println("El resultado de la sumatoria es: " + sumatoria);
        System.out.println("El resultado de la productoria es: " + productoria);
        
        scanner.close();
    }
}

