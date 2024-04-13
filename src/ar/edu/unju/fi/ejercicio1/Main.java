package ar.edu.unju.fi.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, num5;
		
		num1 = (int) (Math.random() * 101);
		num2 = (int) (Math.random() * 101);
		num3 = (int) (Math.random() * 101);
		num4 = (int) (Math.random() * 101);
		num5 = (int) (Math.random() * 101);
		
		int resultado = calcularPromedio(num1, num2, num3,num4, num5);
		mostrarNumeros(num1, num2, num3,num4, num5);
		mostrarNumeros(resultado);

	}

	private static void mostrarNumeros(int ...numeros) {
		
		int cantidadParametros = numeros.length;
        switch (cantidadParametros) {
           
            case 1:
                System.out.println(numeros[0]);
                break;
            case 5:
            	System.out.println(numeros[0] + "," + numeros[1]+ "," + numeros[2] + "," + numeros[3] + "," + numeros[4] );
        		
                break;
            default:
                System.out.println("Error de parametros");
           
        }
		
	}

	private static int calcularPromedio(int num1, int num2, int num3, int num4, int num5) {
		int sumaTotal = num1 + num2 +num3 + num4 + num5;
		return sumaTotal/5;
	}

}
