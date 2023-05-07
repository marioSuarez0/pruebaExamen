package ejercicios_tio_david.ejercicios_politecnica.ejercicio3;

public class Gato extends Felino{
	
	public Gato(String ruido) {
		super(ruido);
		
	}
	
	public void sonido() {
		System.out.println("El gato maulla " + ruido);
	}

}
