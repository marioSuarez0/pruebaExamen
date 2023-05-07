package encapsulacion.ejercicio_maniquis;

public class Pantalon {

	private String talla;
	private String color;
	private double precio;
	private Boton boton;
	
	public Pantalon(String talla, String color, double precio, Boton boton) {
		super();
		this.talla = talla;
		this.color = color;
		this.precio = precio;
		this.boton = boton;
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

	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}
	
	
}