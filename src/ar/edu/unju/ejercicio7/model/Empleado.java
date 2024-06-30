package ar.edu.unju.ejercicio7.model;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    public static final double SALARIO_MINIMO = 210_000.00;
    public static final double AUMENTO_POR_MERITOS = 20_000.00;

    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + String.format("%.2f", salario));
    }

    public void darAumento() {
        this.salario += AUMENTO_POR_MERITOS;
    }
}

