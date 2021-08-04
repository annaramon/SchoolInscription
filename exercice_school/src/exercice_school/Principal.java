package exercice_school;

import java.util.Scanner;

//Nomes els alumnes de mes de 8 anys i menors de 13 que tinguin germans a l'escola
//pagaran nomes un 50% de la inscripcio

public class Principal {

	public static void main(String[] args) {
		 double costoInscripcion=1250;
		 int edadesAlumnos[]=new int[5];
		 String tieneHermanos[]=new String[5];
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Introduce los datos de cada alumno ");
		 
		 for(int i=0; i<5; ++i) {
			 System.out.println("Edad del alumno "+(i+1)+ " :");
			 edadesAlumnos[i]=sc.nextInt();
			 System.out.println("¿Tiene hermanos? ");
			 tieneHermanos[i]=sc.next();
		 }
		 
		 CalcularPreuAlumnes(edadesAlumnos, tieneHermanos, costoInscripcion);
		 
	}
	
	public static void CalcularPreuAlumnes(int edades[], String hermanos[], double costo) {
		for(int i=0; i<5; i++) {
			if(edades[i]>=8 && edades[i]<=13) {
				if(hermanos[i].equals("si")) {
					System.out.println("El alumno "+(i+1)+" tiene le 50% de descuento");
					System.out.println("Pagara "+ costo*0.5);
				}
			}
			
			System.out.println("El alumno "+(i+1)+" no tiene ningun descuento");
			System.out.println("Pagara "+costo);
		}
	}

}
