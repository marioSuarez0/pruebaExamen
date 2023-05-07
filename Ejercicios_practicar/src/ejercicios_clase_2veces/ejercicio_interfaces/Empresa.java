package ejercicios_clase_2veces.ejercicio_interfaces;

public class Empresa {

	public static void main(String[] args) {
		
		Persona persona = new Persona("nombrePersona", "dniPersona");
		Empleado empleado = new Empleado("nombreEmpleado", "dniEmpleado", 1, 10);
		Ordenador ordenador = new Ordenador("marcaOrdenador", "modeloOrdenador");
		
		Insertable[] objetos = {persona, empleado, ordenador};
		
		Empresa empresa = new Empresa();
		empresa.insertar(objetos);
		empleado.fichar();
		

	}
	
	public void insertar(Insertable [] objetos) {
		for (Insertable objeto : objetos) {
			objeto.insert();
		}
	}
	
	public void fichar(Empleable empleado) {
		empleado.fichar();
		
	}

}
