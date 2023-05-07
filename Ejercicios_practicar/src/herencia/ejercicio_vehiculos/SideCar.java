package herencia.ejercicio_vehiculos;

public final class SideCar extends Moto {
	
	private int tamanio;

	public SideCar(String marca, String modelo, int anioFabricacion, String matricula, int cilindrada) {
		super(marca, modelo, anioFabricacion, matricula, cilindrada);
		this.tamanio = tamanio;
	}

	public int getTamanio() {
		return tamanio;
	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	public void desmontar() {
		System.out.println("Desmontando el sidecar con matrícula "+ getMatricula());
	}

}
