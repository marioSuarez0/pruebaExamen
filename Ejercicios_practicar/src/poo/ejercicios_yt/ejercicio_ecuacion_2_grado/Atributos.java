package poo.ejercicios_yt.ejercicio_ecuacion_2_grado;

public class Atributos {
	
	private double a;
	private double b;
	private double c;
	
	public Atributos(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	private void obtenerRaices() {
		double x1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
		double x2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
		
		System.out.println("x1 =");
		System.out.println(x1);
		System.out.println("x2 =");
		System.out.println(x2);
	}
	
	private void obtenerRaiz() {
		double x = (-b) / (2 * a);
		
		System.out.println("Unica solución");
		System.out.println(x);
	}
	
	private double getDiscriminante() {
		return Math.pow(b, 2) - (4 * a * c);		 
	}
	
	private boolean tieneRaices() {
		return getDiscriminante() >= 0;
	}
	
	public boolean tieneRaiz() {
		return getDiscriminante() == 0;
	}
	
	public void calcular() {
		
		if(tieneRaices()) {
			obtenerRaices();
		}else if(tieneRaiz()){
			obtenerRaiz();
		}else {
			System.out.println("No tiene solución");
		}
		
	}

}
