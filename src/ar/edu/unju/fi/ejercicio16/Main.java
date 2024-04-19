package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] arrayNombres = new String [5];
		
		
		for(int i=0; i<arrayNombres.length; i++) {
			  System.out.print("Ingrese un nombre de persona:  " + i + ": ");
			  arrayNombres[i] = scanner.next();
		}
		
		int indice = 0;
		System.out.println("Nombre");
		while(indice < arrayNombres.length) {
			
			System.out.println( arrayNombres[indice]);
			indice++;
		}
		System.out.println("Tamaño Array: "+arrayNombres.length);
		 
		byte indiceEliminar;
		do {
			System.out.println("Ingresar indice de un elemento a eliminar [0, 4]");
			 indiceEliminar = scanner.nextByte();
		
		}while(indiceEliminar < 0 || indiceEliminar > 4);
			 
		for(int j=0; j < arrayNombres.length; j++) {
			if(j == indiceEliminar) {
				for (int l=indiceEliminar; l < arrayNombres.length -1; l++) {
					arrayNombres[l] = arrayNombres[l+1];
				}
				arrayNombres[4] = " ";	
		}
		}
			
		System.out.println("Nombre");
		for(String nombre : arrayNombres) {
			System.out.println(nombre);
		} 
		scanner.close();	
	}	
}
	


