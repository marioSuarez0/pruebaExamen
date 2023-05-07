package herencia.ejercicio_vehiculos;

public class Ciudad {

	private String nombre;
	
	public Ciudad(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		
		Ciudad ciudad1 = new Ciudad("nombre1");
		ciudad1.iniciarCiudad();
	
	}

	public void iniciarCiudad() {
		Vehiculo[] vehiculos = UtilsCiudad.generarVehiculos();

		Garaje garaje = new Garaje("Garaje1");
		garaje.aparcar(vehiculos);
	}

	
}
