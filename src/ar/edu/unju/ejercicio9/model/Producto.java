package ar.edu.unju.ejercicio9.model;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento; // valor entero comprendido entre [0,50]

    // Constructor por defecto
    public Producto() {
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        if (descuento >= 0 && descuento <= 50) {
            this.descuento = descuento;
        } else {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 50");
        }
    }

    // Método para calcular el precio con descuento
    public double calcularDescuento() {
        return precio - (precio * descuento / 100.0);
    }
}

