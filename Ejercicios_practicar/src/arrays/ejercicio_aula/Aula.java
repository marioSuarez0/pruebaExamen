package arrays.ejercicio_aula;

public class Aula {

	public static void main(String[] args) {

		// Creo al alumno1 y las asignaturas correspondietes
		Asignatura asignatura1Alumno1 = new Asignatura("Programación", 7.0);
		Asignatura asignatura2Alumno1 = new Asignatura("Matemáticas", 6.0);
		
		Asignatura [] asignaturasAlumno1 = {asignatura1Alumno1, asignatura2Alumno1};
		
		Alumno alumno1 = new Alumno("Pepe", "Gomez", asignaturasAlumno1);
		
		// Creo al alumno2 y las asignaturas correspondietes
		Asignatura asignatura1Alumno2 = new Asignatura("Programación", 6.0);
		Asignatura asignatura2Alumno2 = new Asignatura("Matemáticas", 2.0);
				
		Asignatura [] asignaturasAlumno2 = {asignatura1Alumno2, asignatura2Alumno2};
		
		Alumno alumno2 = new Alumno("Juan", "Perez", asignaturasAlumno2);
		
		// Creo el aula con los alumnos
		Alumno [] alumnos = {alumno1, alumno2};
		
		System.out.println("Hay " + alumnos.length + " alumnos en el aula");
 		
		// Muestro el nombre de los alumnos y las asignaturas con sus notas
		for (Alumno alumno : alumnos) {
			System.out.println(alumno.getNombre());
			Asignatura [] asignaturasAlumno = alumno.getAsignaturas();
			for (Asignatura asignatura : asignaturasAlumno) {
				System.out.println(asignatura.getNombre() + " nota: " + asignatura.getNota());
			}
		}
		
		// Calculo la nota media de los alumnos
		double notasAlumnos = 0;
		int totalAsignaturas = 0;
		for (Alumno alumno : alumnos) {
			Asignatura [] asignaturasAlumno = alumno.getAsignaturas();
			int numAsignaturas = asignaturasAlumno.length; 
			totalAsignaturas += numAsignaturas;
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumnos += asignatura.getNota();
			}
		}	
		System.out.println("La nota media de los alumnos es de " + notasAlumnos/totalAsignaturas);	
		
		// Indico que alumno tiene la nota media más alta
		double notaMediaMasAlta = 0;
		Alumno alumnoNotaMediaMasAlta=null;
		for (Alumno alumno : alumnos) {
			double notasAlumno = 0;
			Asignatura[] asignaturasAlumno = alumno.getAsignaturas();
			int numAsignaturasAlumno = asignaturasAlumno.length;
			for (Asignatura asignatura : asignaturasAlumno) {
				notasAlumno+=asignatura.getNota();
			}
			double mediaAlumno = notasAlumno/numAsignaturasAlumno;

			if (mediaAlumno>notaMediaMasAlta) {

				notaMediaMasAlta = mediaAlumno;
				alumnoNotaMediaMasAlta = alumno;
				
			}
			
		}
		System.out.println("El alumno con la media mas alta es " + 
				alumnoNotaMediaMasAlta.getNombre() + " con un " +notaMediaMasAlta);
	}
}