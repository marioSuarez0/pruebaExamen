package herencia.ejercicio_vehiculos;

public abstract class VehiculoMotorizado extends Vehiculo {
	
	private String matricula;

	public VehiculoMotorizado(String marca, String modelo, int anioFabricacion, String matricula) {
		super(marca, modelo, anioFabricacion);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void arrancar() {
		System.out.println("El vehículo con matrícula " + this.matricula + " está arrancando el motor");
	}
	
	public void parar() {
		System.out.println("El vehículo con matrícula " + this.matricula + " está frenando el motor");
	}

}
