package Notas_Alumnos;

public class Aula {
private Alumno alumno[];
private int cuantosHay;

public Aula() {
	this.alumno = new Alumno[4];
	this.cuantosHay=0;
}

public int getCuantosHay() {
	return cuantosHay;
}
public void setCuantosHay(int cuantosHay) {
	this.cuantosHay = cuantosHay;
}
public void addAlumno(Alumno Alumno, Alumno Alumno2) {
	
	if(cuantosHay<alumno.length) {
		alumno[cuantosHay] = Alumno;
		cuantosHay++;
		alumno[cuantosHay] = Alumno;
		cuantosHay++;
	}
	System.out.println(this);
}

}