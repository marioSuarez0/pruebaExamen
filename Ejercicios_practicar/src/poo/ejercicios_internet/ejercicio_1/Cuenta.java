package poo.ejercicios_internet.ejercicio_1;

public class Cuenta {
	
	private String titular;
	private double dinero;

	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}

	public Cuenta(String titular, double dinero) {
		super();
		this.titular = titular;
		this.dinero = dinero;
	}

	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	@Override
	public String toString() {
		return "El titular se llama " + titular + " tiene " + dinero + " euros en la cuenta";
	}
	
	public void ingresar(double dinero) {
		if(dinero > 0) {
			this.dinero += dinero;
		}
	}
	
	public void retirar(double dinero) {
		this.dinero = this.dinero - dinero;
		if(this.dinero < 0) {
			this.dinero = 0;
		}	
	}
}
