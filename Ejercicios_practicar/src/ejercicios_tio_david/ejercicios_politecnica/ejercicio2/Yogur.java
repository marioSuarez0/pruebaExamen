package ejercicios_tio_david.ejercicios_politecnica.ejercicio2;

public class Yogur {
	
	protected double calorias;

	public Yogur() {
		super();
		this.calorias = 120.5;
	}

	public Yogur(double calorias) {
		super();
		this.calorias = calorias;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "calorias=" + calorias;
	}
	
	

}
