package herencia.ejercicio_vehiculos;

public final class Bicicleta extends Vehiculo{
	
	private int numMarchas;

	public Bicicleta(String marca, String modelo, int anioFabricacion) {
		super(marca, modelo, anioFabricacion);
		this.numMarchas = numMarchas;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}
	
	public void inflarRuedas() {
		System.out.println("Inflando ruedas de la bicicleta " + getModelo());
	}

	@Override
	public String toString() {
		return "Bicicleta [numMarchas=" + numMarchas + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() +  "]";
	}

	@Override
	public void acelerar() {
		System.out.println("La bicileta está acelerando");
	}

	@Override
	public void frenar() {
		System.out.println("La bicileta está frenando");		
	}

	
}
