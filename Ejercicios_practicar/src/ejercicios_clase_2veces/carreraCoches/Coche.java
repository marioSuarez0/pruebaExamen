package ejercicios_clase_2veces.carreraCoches;

import java.util.Random;

public class Coche {
	
	private String escuderia;
	private String motor;
	private int numero;
	private Piloto piloto;
	private int velocidad;
	private int avance;
	
	public Coche(String escuderia, String motor, int numero, Piloto piloto, int velocidad) {
		super();
		this.escuderia = escuderia;
		this.motor = motor;
		this.numero = numero;
		this.piloto = piloto;
		this.velocidad = velocidad;
	}

	public String getEscuderia() {
		return escuderia;
	}
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
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
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
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
		int valor = valorAleatorio + this.velocidad + this.piloto.getExperiencia();
		System.out.println("El coche "+this.getNumero() + " ha avanzado " + valor);
		
		this.avance += valor;
		System.out.println("El coche "+this.getNumero() + " lleva avanzado " + this.avance);
	}

}
