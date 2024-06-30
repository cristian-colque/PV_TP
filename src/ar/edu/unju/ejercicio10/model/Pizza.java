package ar.edu.unju.ejercicio10.model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    public static final double ADICIONAL_INGREDIENTES_ESPECIALES_20 = 500.00;
    public static final double ADICIONAL_INGREDIENTES_ESPECIALES_30 = 750.00;
    public static final double ADICIONAL_INGREDIENTES_ESPECIALES_40 = 1000.00;

    // Constructor por defecto
    public Pizza() {
    }

    // Getters y Setters
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        if (diametro == 20 || diametro == 30 || diametro == 40) {
            this.diametro = diametro;
        } else {
            throw new IllegalArgumentException("El diámetro debe ser 20, 30 o 40 cm");
        }
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    public void calcularPrecio() {
        double precioBase = 0.0;
        double adicional = 0.0;

        switch (diametro) {
            case 20:
                precioBase = 4500.00;
                adicional = ingredientesEspeciales ? ADICIONAL_INGREDIENTES_ESPECIALES_20 : 0;
                break;
            case 30:
                precioBase = 4800.00;
                adicional = ingredientesEspeciales ? ADICIONAL_INGREDIENTES_ESPECIALES_30 : 0;
                break;
            case 40:
                precioBase = 5500.00;
                adicional = ingredientesEspeciales ? ADICIONAL_INGREDIENTES_ESPECIALES_40 : 0;
                break;
        }

        setPrecio(precioBase + adicional);
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
        double radio = diametro / 2.0;
        setArea(Math.PI * Math.pow(radio, 2));
    }
}

