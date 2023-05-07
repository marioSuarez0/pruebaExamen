package ejercicios_tio_david.ejercicios_politecnica.ejercicio1;

public class Persona {
	
	private String nif;
	private int altura;
	private int edad;
	
	public Persona() {
		super();
		this.nif = "11111111A";
		this.altura = 175;
		this.edad = 25;
	}

	public Persona(String nif, int altura, int edad) {
		super();
		this.nif = nif;
		this.altura = altura;
		this.edad = edad;
	}

	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "nif=" + nif + ", altura=" + altura + ", edad=" + edad;
	}

	
}
