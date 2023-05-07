package herencia.ejercicio_zoologico;

public final class Zoologico {

	public static void main(String[] args) {
		
		Elefante elefante1 = new Elefante("Dumbo", "Asiático", 2);
		elefante1.desplazarse();
		
		Serpiente serpiente1 = new Serpiente("Serpiente1","Víbora",3);
		serpiente1.desplazarse();
		
		Vaca vaca1 = new Vaca("Vaca1", "Lechera", 2);
		vaca1.desplazarse();
	
		Animal[] animales = {elefante1, serpiente1, vaca1};
		
		Zoologico zoo = new Zoologico();
		zoo.alimentarAnimales(animales);

	}

	public void alimentarAnimales(Animal[] animales) {
		for (Animal animal : animales) {
			animal.comer();
		}
		
	}

	


}
