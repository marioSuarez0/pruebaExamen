package herencia.ejercicio_vehiculos;

public class Moto extends VehiculoMotorizado {
	
	private int cilindrada;

	public Moto(String marca, String modelo, int anioFabricacion, String matricula, int cilindrada) {
		super(marca, modelo, anioFabricacion, matricula);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void acelerar() {
		System.out.println("La moto con matrícula "+ this.getMatricula() + " esta acelerando");
	}

	@Override
	public void frenar() {
		System.out.println("La moto con matrícula "+ this.getMatricula() + " esta frenando");
	}

	
	
	

}
