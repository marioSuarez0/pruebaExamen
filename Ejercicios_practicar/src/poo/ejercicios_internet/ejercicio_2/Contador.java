package poo.ejercicios_internet.ejercicio_2;

public class Contador {
	
	private int cont;

	public Contador() {	
	}

	public Contador(int cont) {
		if(cont < 0) {
			this.cont = 0;
		}else {
			this.cont = cont;
		}
	}

	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementar() {
		System.out.println(cont += 1);
	}
	
	public void decrementar() {
		if(cont > 0) {
			System.out.println(cont -= 1);	
		}else {
			System.out.println(cont = 0);
		}
		
	}

}
