package edu.ucj.programacion.pec1.DiegoReinoso;

import java.util.Scanner;
import java.util.Arrays;
public class GestionColegios {

	public GestionColegios() {

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del colegio: ");
		String nombreColegio = scanner.nextLine();
		System.out.println("Introduce la direccion del colegio: ");
		String direccionColegio = scanner.nextLine();
		System.out.println("Introduce el numero de Aulas: ");
		int numAulas = scanner.nextInt();
		System.out.println("Introduce el numero de Alumnos: ");
		int numAlumnos = scanner.nextInt();

		
		UtilsColegio utilsColegio = new UtilsColegio(numAulas,numAlumnos,nombreColegio,direccionColegio);
		
		
		utilsColegio.crearProfesor();
		
		System.out.println("\nLos profesores creados, son los siguientes: ");
		System.out.println(Arrays.toString(utilsColegio.getProfesores()));
		
		utilsColegio.crearAlumnos();
		
		System.out.println("\nLos alumnos creados, son los siguientes: ");
		System.out.println(Arrays.toString(utilsColegio.getAlumnos()));
		
		
	
		Profesor [] prof = utilsColegio.getProfesores() ;
		System.out.println(Arrays.toString(prof));
		Alumnos [] alum = utilsColegio.getAlumnos();
		System.out.println(Arrays.toString(alum));
		
		
		Colegio colegio = new Colegio(numAulas,numAlumnos,nombreColegio,direccionColegio,prof,alum);
		Colegio.crearAulas();
		System.out.println(Arrays.toString(colegio.getAulasTotal()));
	}



}
