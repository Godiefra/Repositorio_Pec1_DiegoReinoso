package edu.ucj.programacion.pec1.DiegoReinoso;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

public class UtilsColegio {
static Scanner scanner = new Scanner(System.in);
private static int numAulas;
private static int numAlumnos;
private String nombreColegio;
private String direccionColegio;
public  static Profesor [] profesores= new Profesor[numAulas];
public  static Alumnos[] alumnos = new Alumnos[numAlumnos];


public static int getNumAulas() {
	return numAulas;
}

public void setNumAulas(int numAulas) {
	this.numAulas = numAulas;
}

public static  int getNumAlumnos() {
	return numAlumnos;
}

public void setNumAlumnos(int numAlumnos) {
	this.numAlumnos = numAlumnos;
}

public String getNombreColegio() {
	return nombreColegio;
}

public void setNombreColegio(String nombreColegio) {
	this.nombreColegio = nombreColegio;
}

public String getDireccionColegio() {
	return direccionColegio;
}

public void setDireccionColegio(String direccionColegio) {
	this.direccionColegio = direccionColegio;
}

public static Profesor[] getProfesores() {
	return profesores;
}

public static Alumnos[] getAlumnos() {
	return alumnos;
}

public static void setProfesores(Profesor[] profesores) {
	UtilsColegio.profesores = profesores;
}

public UtilsColegio(int numAulas, int numAlumnos, String nombreColegio, String direccionColegio) {
	super();
	this.numAulas = numAulas;
	this.numAlumnos = numAlumnos;
	this.nombreColegio = nombreColegio;
	this.direccionColegio = direccionColegio;
	
}



//Creamos el metodo que creara un array de profesores
public static  Profesor[] crearProfesor() {
	Profesor[] profes = new Profesor[numAulas];
	for (int i = 1; i <= numAulas;i ++ ) {
		
		System.out.println("\nVamos a diseñar al profesor " + i);
		System.out.println("Introduce su nombre: ");
		String nombreP = scanner.nextLine();
		System.out.println("Introduce su apellido: ");
		String apellidoP = scanner.nextLine();
		System.out.println("Introduce su DNI: ");
		String dniP = scanner.nextLine();
		System.out.println("Introduce su Asignatura: ");
		String asignaturaP = scanner.nextLine();
		
		Profesor profesor = new Profesor(nombreP,apellidoP,dniP,asignaturaP);
		
		
		profes [i-1] = profesor; 
		System.out.println(profes[i-1]);
		continue;
	}
	return profesores = profes;
}
	
	//Creamos el metodo que creara un array de alumnos
	public static  Alumnos[] crearAlumnos() {
		Alumnos[] alumns= new Alumnos[numAlumnos];
		for (int i = 1; i <= numAlumnos;i ++ ) {
	
			System.out.println("\nVamos a diseñar al alumno" + i);
			System.out.println("Introduce su nombre: ");
			String nombre = scanner.nextLine();
			System.out.println("Introduce su apellido: ");
			String apellido = scanner.nextLine();
			System.out.println("Introduce su DNI: ");
			String dni = scanner.nextLine();
			System.out.println("Introduce su Nota: ");
			int nota = scanner.nextInt();
			
			Alumnos alumno = new Alumnos(nombre,apellido,dni,nota);
			
			
			alumns [i-1] = alumno; 
			System.out.println(alumns[i-1]);
			continue;
		
	}


return alumnos = alumns;
}

	
	

}