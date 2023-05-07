package herencia.ejercicio_vehiculos;

public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private int anioFabricacion;
	
	public Vehiculo(String marca, String modelo, int anioFabricacion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anioFabricacion = anioFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	
	@Override
	public String toString() {
		return "Vehículo [marca=" + marca + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + "]";
	}

	public abstract void acelerar();

	public abstract void frenar();
}
