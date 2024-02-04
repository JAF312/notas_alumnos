package Notas_Alumnos;

import java.util.Arrays;

public class Alumno {
private String nombre;
private String apellidos;
private int contacto;
private int cuantosHay;
private Asignaturas Asignatura[];
public Alumno(String nombre, String apellidos,int contacto) {
	this.nombre=nombre;
	this.apellidos=apellidos;
	this.contacto=contacto;
	Asignatura = new Asignaturas[4];
	cuantosHay=0;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public int getContacto() {
	return contacto;
}
public void setContacto(int contacto) {
	this.contacto = contacto;
}


public String toString() {
	return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", contacto=" + contacto + ", cuantosHay="
			+ cuantosHay + ", " + Arrays.toString(Asignatura) + "]";
}

}


