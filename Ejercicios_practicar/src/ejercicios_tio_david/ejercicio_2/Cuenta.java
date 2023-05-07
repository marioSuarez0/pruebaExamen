package ejercicios_tio_david.ejercicio_2;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}

	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresar(double cantidad) {
		if (cantidad > 0) {
			this.cantidad = this.cantidad + cantidad;
		}
	}
	
	public void retirar(double cantidad) {
		this.cantidad = this.cantidad - cantidad;
		if(this.cantidad < 0) {
			this.cantidad = 0;
		}
	}

	@Override
	public String toString() {
		return "El titular de la cuenta es " + titular + " y tiene " + cantidad + " euros";
	}
	
	
}
