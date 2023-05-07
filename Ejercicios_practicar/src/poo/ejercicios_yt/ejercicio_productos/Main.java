package poo.ejercicios_yt.ejercicio_productos;

public class Main {

	public static void main(String[] args) {
		
		Producto producto1 = new Perecedero("perecedero1", 100, 1);
		Producto producto2 = new Perecedero("perecedero2", 100, 2);
		Producto producto3 = new Perecedero("perecedero3", 100, 3);
		Producto producto4 = new NoPerecedero("NoPerecedero1", 100, "tipo1");
		Producto producto5 = new NoPerecedero("NoPerecedero2", 50, "tipo2");
		
		Producto[] productos = {producto1, producto2, producto3, producto4, producto5};
		
		double total = 0;
		for (int i = 0; i < productos.length; i++) {
			total = productos[i].calcular(5);
			
		}
		System.out.println(total);
	}
}
