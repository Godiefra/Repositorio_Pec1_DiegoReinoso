package edu.ucj.programacion.pec1.DiegoReinoso;

import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
//import edu.ucj.programacion.pec1.DiegoReinoso.*  ;
public class Colegio{
	static Scanner scanner = new Scanner(System.in);
	private static  int numAulas;
	private static int numAlumnos;
	private String nombreColegio;
	private String direccionColegio;
	private static Profesor [] profesoresC;
	private static Alumnos[] alumnosC ;
	private static Aula [] aulasTotal = new Aula[numAulas];
	
	
	public static void mostrarDatos() {
		System.out.println(Arrays.toString(profesoresC));
		System.out.println(Arrays.toString(alumnosC));
		System.out.println(Arrays.toString(aulasTotal));
	}
	
	//Constructor Colegio
	public Colegio(int numAulas, int numAlumnos, String nombreColegio, String direccionColegio, Profesor[] profesores, Alumnos[] alumnos) {
		super();
		this.numAulas = numAulas;
		this.numAlumnos = numAlumnos;
		this.nombreColegio = nombreColegio;
		this.direccionColegio = direccionColegio;
		this.profesoresC = profesores;
		this.alumnosC = alumnos;
	}


	//Getters y Setters
	public int getNumAulas() {
		return numAulas;
	}

	public void setNumAulas(int numAulas) {
		this.numAulas = numAulas;
	}

	public int getNumAlumnos() {
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

	public static Profesor[] getProfesoresC() {
		return profesoresC;
	}

	public static void setProfesoresC(Profesor[] profesoresC) {
		Colegio.profesoresC = profesoresC;
	}

	public static Alumnos[] getAlumnosC() {
		return alumnosC;
	}

	public static void setAlumnosC(Alumnos[] alumnosC) {
		Colegio.alumnosC = alumnosC;
	}
	
	public static Aula[] getAulasTotal() {
		return aulasTotal;
	}

	public static void setAulasTotal(Aula[] aulasTotal) {
		Colegio.aulasTotal = aulasTotal;
	}
	
	
	
	//Metodo de crear Aulas
	
	public static Aula[] crearAulas() {
		System.out.println("\nSe estan creando las aulas.");
		Aula[] aulas= new Aula[numAulas];
		int contAulas = 0;
		int contAsiento =0;
		int contAlumnos = 0;
		Boolean seguir = false;
		
		Alumnos [] asientosLlenos = new Alumnos[3];
		
		
		//Temporal
		int numero = 1;
		int planta = 1;
		
		for(int i = 1; i <= numAulas; i++) {
			Aula aula = new Aula(numero,planta); //Creamos el Aula
			
			if (contAulas <= numAulas && seguir == false ) { //Comprobamos que se crean el numero correcto de aulas
				contAulas = contAulas ++;
				Alumnos [] asientosocupados= new Alumnos[3];
				
				for(int j = 1; j <= 3;j++) { //Llenamos los asientos del aula
					
					contAlumnos = contAlumnos ++ ;
					
					if (contAlumnos <= alumnosC.length) { //Comprobamos que se añaden el numero correcto de estudiantes
						
						aula.setAlumno(alumnosC[contAlumnos-1]); //Seleccionamos el alumno
						Alumnos alumno = aula.getAlumno();
						Alumnos [] asientosOcupados = aula.getAsientos();
						asientosOcupados [j-1] = alumno;
						asientosLlenos[j-1] = asientosOcupados[j-1];
						System.out.println("Al alumno: " + alumnosC[contAlumnos-1].getNombre() + " de DNI: " +alumnosC[contAlumnos-1].getDni() + " se le ha asignado el aula numero: " + i);
						continue;
					}else {
						
						seguir = false;
						break;
					}
				 
					
				}
				//Llenamos los asientos del aula
				aula.setAsientos(asientosLlenos);
				continue;
			}else {
				
				break;
			}
			
			
			
		}
		Colegio.setAulasTotal(aulas);
		
return aulasTotal = aulas;
}


	@Override
	public String toString() {
		return "Aulas" + this.aulasTotal;
	}



}
	
	
	


