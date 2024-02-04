package Notas_Alumnos;

public class Aula {
private Alumno alumno[];
private int cuantosHay;

public Aula() {
	alumno = new Alumno[5];
}

public int getCuantosHay() {
	return cuantosHay;
}
public void setCuantosHay(int cuantosHay) {
	this.cuantosHay = cuantosHay;
}
}
