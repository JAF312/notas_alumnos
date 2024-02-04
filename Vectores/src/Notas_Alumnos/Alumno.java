package Notas_Alumnos;

public class Alumno {
private String nombre;
private String apellidos;
private int numero;
private int cuantosHay;
private Asignaturas Asignatura[];
public Alumno() {
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
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}

}


