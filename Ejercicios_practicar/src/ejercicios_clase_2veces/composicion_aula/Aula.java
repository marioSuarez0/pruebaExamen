package ejercicios_clase_2veces.composicion_aula;

public class Aula {

	public static void main(String[] args) {
		
		Asignatura asignatura1 = new Asignatura("Mates", 6);
		Asignatura asignatura2 = new Asignatura("Lengua", 7);
		
		Alumno alumno1 = new Alumno("Pepe", "Lopez", 9.5, asignatura1);
		Alumno alumno2 = new Alumno("Pepa", "Lopez", 7.0, asignatura2);		
		
		alumno1.estudiar();
		alumno2.estudiar();
		
		System.out.println(alumno1.getAsignaturaAlumno().getNombre());
		

	}

}
