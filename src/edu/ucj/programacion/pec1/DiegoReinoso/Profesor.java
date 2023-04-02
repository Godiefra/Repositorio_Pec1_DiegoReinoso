package edu.ucj.programacion.pec1.DiegoReinoso;

public class Profesor {
	private String nombreP;
	private String apellidoP;
	private String dniP;
	private String asignaturaP;
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getDniP() {
		return dniP;
	}
	public void setDniP(String dniP) {
		this.dniP = dniP;
	}
	public String getAsignaturaP() {
		return asignaturaP;
	}
	public Profesor() {
		super();
	}
	public void setAsignaturaP(String asignaturaP) {
		this.asignaturaP = asignaturaP;
	}
	public Profesor(String nombreP, String apellidoP, String dniP, String asignaturaP) {
		super();
		this.nombreP = nombreP;
		this.apellidoP = apellidoP;
		this.dniP = dniP;
		this.asignaturaP = asignaturaP;
	}

	//Creamos el toString para mostrar Datos de los profesores creados

	@Override
	public String toString() {
		return "Nombre: "+ this.nombreP + " Apellido:  " + this.apellidoP + " DNI:  " + this.dniP + " Asignatua:  " + this.asignaturaP;
	}


}
