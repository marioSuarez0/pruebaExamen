package encapsulacion.ejercicio_maniquis;

public class Vestido {

	private String talla;
	private String color;
	private double precio;
	
	public Vestido(String talla, String color, double precio) {
		super();
		this.talla = talla;
		this.color = color;
		this.precio = precio;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}