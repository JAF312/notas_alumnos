package Notas_Alumnos;

public class Start {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("Pepe","Fernandez",213122416);
		alumno1.addAsignaturas(new Asignaturas("Lengua",3,5,7));
		alumno1.addAsignaturas(new Asignaturas("Mates",4,8,2));
		alumno1.addAsignaturas(new Asignaturas("Ingles",7,3,9));
		alumno1.addAsignaturas(new Asignaturas("TIC",1,7,4));
		
		Alumno alumno2 = new Alumno("Rosa","Rosales",234524678);
		alumno2.addAsignaturas(new Asignaturas("Lengua",9,5,7));
		alumno2.addAsignaturas(new Asignaturas("Mates",6,6,9));
		alumno2.addAsignaturas(new Asignaturas("Ingles",4,8,9));
		alumno2.addAsignaturas(new Asignaturas("TIC",2,3,5));
		
		
		System.out.println(alumno1);
		System.out.println(alumno2);

		System.out.println("La media de la primera evaluacion de todos los alumnos es = " 
		+ (alumno1.calcularMediaPrimeraEvaluacion()+alumno2.calcularMediaPrimeraEvaluacion())/2);
	
		
		
	}
 
}
