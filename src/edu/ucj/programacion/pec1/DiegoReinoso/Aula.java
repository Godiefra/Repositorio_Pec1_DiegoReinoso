package edu.ucj.programacion.pec1.DiegoReinoso;

public class Aula   {

	private int numero;
	private int planta;
	private Alumnos alumno;
	private static Alumnos [] asientos;
	
	//Creamos un constructor que por defecto crea un aula con 3 asientos
	public Aula(int numero, int planta, Alumnos alumno) {
		super();
		this.numero = numero;
		this.planta = planta;
		this.alumno = alumno;
		 asientos = new Alumnos[3];
	}
	public Aula(int numero, int planta) {
		super();
		this.numero = numero;
		this.planta = planta;
		asientos = new Alumnos[3];
	}


public static Alumnos[] getAsientos() {
		return asientos;
	}

	public void setAsientos(Alumnos[] asientos) {
		this.asientos = asientos;
	}



//Getters y Setters
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public int getPlanta() {
	return planta;
}
public void setPlanta(int planta) {
	this.planta = planta;
}

public Alumnos getAlumno() {
	return alumno;
}

public void setAlumno(Alumnos alumno) {
	this.alumno = alumno;
}




//Creamos el toString para mostrar datos del aula
//Creamos el toString para mostrar Datos de los alumnos creados


@Override
	public String toString() {
		return "Número:  "+ this.numero + " Planta:  " + this.planta + " Alumnos:   " + this.alumno;
	}

 
}
