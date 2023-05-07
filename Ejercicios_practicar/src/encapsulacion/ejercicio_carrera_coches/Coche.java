package encapsulacion.ejercicio_carrera_coches;

import java.util.Random;

public class Coche {
	
	private String escudería;
	private String motor;
	private int numero;
	private Piloto piloto;
	private double velocidad;
	private int avance;
	
	
	public Coche(String escudería, String motor, int numero, Piloto piloto, double velocidad, int avance) {
		super();
		this.escudería = escudería;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
		this.avance = avance;
	}

	public Coche(String escudería, String motor, int numero, Piloto piloto, double velocidad) {
		super();
		this.escudería = escudería;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
	}


	public String getEscudería() {
		return escudería;
	}


	public void setEscudería(String escudería) {
		this.escudería = escudería;
	}


	public String getMotor() {
		return motor;
	}


	public void setMotor(String motor) {
		this.motor = motor;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Piloto getPiloto() {
		return piloto;
	}


	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	public int getAvance() {
		return avance;
	}


	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	public void correr() {
		int valorAleatorio = new Random().nextInt(100);
		int valor = valorAleatorio + (int)this.velocidad + this.piloto.getExperiencia();
		System.out.println("El coche " + this.getNumero() + " ha avanzado " + valor);
		
		avance += valor;
		System.out.println("El coche " + this.getNumero() + " lleva avanzado " + avance);	
		
	}

}
