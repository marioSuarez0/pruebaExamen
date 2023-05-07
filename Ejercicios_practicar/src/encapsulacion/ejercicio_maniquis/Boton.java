package encapsulacion.ejercicio_maniquis;

public class Boton {
	
	private String color;
	private String forma;
	private String tamanio;
	
	public Boton(String color, String forma, String tamanio) {
		super();
		this.color = color;
		this.forma = forma;
		this.tamanio = tamanio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public String getTamaño() {
		return tamanio;
	}

	public void setTamaño(String tamaño) {
		this.tamanio = tamaño;
	}
	
	

}