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
	this.Asignatura = new Asignaturas[4];
	this.cuantosHay=0;
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
public void addAsignaturas(Asignaturas asignatura) {
	
	if(cuantosHay<Asignatura.length) {
		Asignatura[cuantosHay] = asignatura;
		cuantosHay++;
	}
	System.out.println(this);
}
public float calcularMediaPrimeraEvaluacion() {
	float suma=0;
	int contador=0;
	while(contador<4) {
		suma+=Asignatura[contador].getNota1();
		contador++;
		
	}
	System.out.println("La media de la primera evaluación es de : " +suma/4);
	return suma;
}

public String toString() {
	return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", contacto=" + contacto + ", cuantosHay="
			+ cuantosHay + ", " + Arrays.toString(Asignatura) + "]";
}

 
}


