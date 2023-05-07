package ejercicios_tio_david.ejercicio_empresa;

public class ClaseMain {

	public static void main(String[] args) {
		
		Direccion direccion1 = new Direccion("calle1", 56, 28045, "madrid", "madrid");
		
		Empresa empresa1 = new Empresa("nombreEmpresa", 1, direccion1);
		
		Departamento dep1 = new Departamento("departamento1", 1, "Madrid", empresa1);
		Departamento dep2 = new Departamento("departamento2", 2, "Madrid", empresa1);
		
		Direccion diremp1 = new Direccion("calleEmp1", 1, 28045, "madrid", "madrid");
		Direccion diremp2 = new Direccion("calleEmp2", 2, 28045, "madrid", "madrid");
		Direccion diremp3 = new Direccion("calleEmp3", 3, 28045, "madrid", "madrid");
		
		Empleado empleado1 = new Empleado("dni1", "nombre1", "apellidos1", "estado1", 12000, "programador", dep1, diremp1);
		Empleado empleado2 = new Empleado("dni2", "nombre2", "apellidos2", "estado2", 1200, "matematico", dep1, diremp2);
		Empleado empleado3 = new Empleado("dni3", "nombre3", "apellidos3", "estado3", 120, "fisico", dep2, diremp3);
		
		System.out.println(empresa1.toString());
		System.out.println(dep1.toString());
		System.out.println(empleado3.toString());
		//System.out.println(empleado1.salarioNeto(12000));
	}


}
