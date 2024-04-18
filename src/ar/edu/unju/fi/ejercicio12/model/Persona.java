package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	String nombre;
	Calendar fechaNacimiento = Calendar.getInstance();
    
     public Persona(String nombre, int anio, int mes, int dia) {
         this.nombre = nombre;
         this.fechaNacimiento.set(anio, mes - 1, dia);
     }
	
	
	public int calcularEdad() {
		int anioNacimiento = this.fechaNacimiento.get(Calendar.YEAR);
		Calendar hoy = Calendar.getInstance();
		hoy.add(Calendar.YEAR, -anioNacimiento);
		return hoy.get(Calendar.YEAR);
	}
	
	public String signoZodiaco() {
		
		int dia = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
		int mes = this.fechaNacimiento.get(Calendar.MONDAY);
		String signo = "";
		
		if ((mes == 2 && dia >= 21) || (mes == 3 && dia <= 19)) {
	        signo = "Aries";
	    } else if ((mes == 3 && dia >= 20) || (mes == 4 && dia <= 20)) {
	        signo = "Tauro";
	    } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
	        signo = "Géminis";
	    } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 22)) {
	        signo = "Cáncer";
	    } else if ((mes == 6 && dia >= 23) || (mes == 7 && dia <= 22)) {
	        signo = "Leo";
	    } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	        signo = "Virgo";
	    } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	        signo = "Libra";
	    } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 21)) {
	        signo = "Escorpio";
	    } else if ((mes == 10 && dia >= 22) || (mes == 11 && dia <= 21)) {
	        signo = "Sagitario";
	    } else if ((mes == 11 && dia >= 22) || (mes == 0 && dia <= 19)) {
	        signo = "Capricornio";
	    } else if ((mes == 0 && dia >= 20) || (mes == 1 && dia <= 18)) {
	        signo = "Acuario";
	    } else if ((mes == 1 && dia >= 19) || (mes == 2 && dia <= 20)) {
	        signo = "Piscis";
	    }	
		return signo;
	}
	
	
	public  String estacion(int mes, int dia) {
        String estacion = "";
        mes--;
        if ((mes == 2 && dia >= 21) || (mes == 3) || (mes == 4) || (mes == 5 && dia <= 20)) {
            estacion = "Otoño";
        } else if ((mes == 5 && dia >= 21) || (mes == 6) || (mes == 7) || (mes == 8 && dia <= 22)) {
            estacion = "Invierno";
        } else if ((mes == 8 && dia >= 23) || (mes == 9) || (mes == 10) || (mes == 11 && dia <= 20)) {
            estacion = "Primavera";
        } else if ((mes == 11 && dia >= 21) || (mes == 0) || (mes == 1) || (mes == 2 && dia <= 20)) {
            estacion = "Verano";
        }

        return estacion;
    }


	public String getNombre() {
		return nombre;
	}

}

