package edu.ucj.programacion.pec1.DiegoReinoso;

public class Alumnos {
		private String nombre;
		private String apellido;
		private String dni;
		private int nota;
		
		
		public Alumnos(String nombre, String apellido, String dni, int nota) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.dni = dni;
			this.nota = nota;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public double getNota() {
			return nota;
		}
		public void setNota(int nota) {
			this.nota = nota;
		}
	
	//Creamos el toString para mostrar Datos de los alumnos creados

	@Override
		public String toString() {
			return "Nombre: "+ this.nombre + " Apellido:  " + this.apellido + " DNI:  " + this.dni + " Nota:  " + this.nota;
		}
	public Alumnos() {
		super();
	}

	

}
