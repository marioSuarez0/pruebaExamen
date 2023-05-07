package ejercicios_tio_david.ejercicios_politecnica.ejercicio4;

public class TestIngeniero {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		Ingerniero ingeniero = new Ingerniero();
		IngInform informatico = new IngInform();
		
		persona.comer();
		persona.hablar();
		
		ingeniero.comer();
		ingeniero.hablar();
		ingeniero.razonar();
		ingeniero.trabajarEnGrupo();
		
		informatico.comer();
		informatico.hablar();
		informatico.razonar();
		informatico.trabajarEnGrupo();
		informatico.crearPrograma();
		

	}

}
