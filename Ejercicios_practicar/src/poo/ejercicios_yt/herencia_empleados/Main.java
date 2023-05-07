package poo.ejercicios_yt.herencia_empleados;

public class Main {

	public static void main(String[] args) {
		
		Repartidor repartidor1 = new Repartidor("Julio José", 36, 10, "zona1");
		Repartidor repartidor2 = new Repartidor("Wellinton", 18, 50, "zona3");
		Comercial comercial1 = new Comercial("Juan", 2000, 30, 250); 
		
		System.out.println(repartidor1);
		repartidor1.plus();
		repartidor2.plus();
		comercial1.plus();
	}

}
