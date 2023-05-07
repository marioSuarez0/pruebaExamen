package ejercicios_clase_2veces.herencia_zoologico;

public class Zoologico {

	public static void main(String[] args) {
		
		Elefante elefante = new Elefante("elefante1", "dumbo", 3);
		Elefante elefante2 = new Elefante("elefante2", "dumbo2", 4);
		Serpiente serpiente = new Serpiente("serpiente1", "cascabel", 10);
		Vaca vaca = new Vaca("vaca1", "lechera", 2);
		
		Animal[] animales = {elefante, serpiente, vaca};
		
		Zoologico zoo = new Zoologico();
		zoo.alimentarAnimales(animales);
		
		Elefante elefante21 = (Elefante)elefante;
		elefante.desplazar();
		serpiente.desplazar();
		vaca.desplazar();
		elefante21.desplazar();
	}
	
	public void alimentarAnimales(Animal[] animales) {
		for (Animal animal : animales) {
			animal.comer();
		}
	}

}
