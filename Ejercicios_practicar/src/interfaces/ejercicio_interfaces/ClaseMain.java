package interfaces.ejercicio_interfaces;

public class ClaseMain {

	public static void main(String[] args) {

		Persona persona = new Persona("N1", "DNI1");
		Empleado empleado = new Empleado("N1", "DNI1", 1, 5);
		Ordenador ordenador = new Ordenador("Marca1", "Modelo1");
		
		Insertable [] objetos = {persona, empleado, ordenador};
		
		ClaseMain main = new ClaseMain();
		main.insertar(objetos);
	}

	public void insertar(Insertable [] objetos) {
		for (Insertable objeto : objetos) {
			objeto.insert();
			
		}
		
		
	}
}
