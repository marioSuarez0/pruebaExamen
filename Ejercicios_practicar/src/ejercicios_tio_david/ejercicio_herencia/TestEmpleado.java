package ejercicios_tio_david.ejercicio_herencia;

public class TestEmpleado {
	
	public static void main(String[] args) {
		
	Empleado empleado1 = new Empleado("Mario Suárez", "12345", 18, false, 100);
	Programador programador1 = new Programador ("Mario Suárez", "12345", 18, false, 100, 2000, "Java");
	
	programador1.AumentarSalario(10);
	empleado1.Clasificacion();
	programador1.ImprimirEmpleado();
	
	System.out.println(programador1.getLenguajeDominante());	
	
	
	}
}
