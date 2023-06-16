package CompanyWorkers2;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		Empleado Antonio = new EmpleadoAsalariado("12345678U", "Antonio", "Lopez",2014, 1125);
		Empleado Sandra = new EmpleadoComision("12345432E", "Sandra", "Nieto", 2011, 169, 7.10);
		Empleado Manuel = new EmpleadoComision();
		Empleado Ramos = new EmpleadoAsalariado();
		
		Empleado [] empleados = new Empleado [4];
		empleados[0]= Antonio;
		empleados[1]= Sandra;
		empleados[2]= Manuel;
		empleados[3]= Ramos;
		
		
		UsoEmpleado.sueldoMayor(empleados);
		UsoEmpleado.mostrarTodos(empleados);

	}
	
	public static void sueldoMayor(Empleado [] empleados) {
		
		int empMayor=0;
		double sueldoMayor=0;
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i].getSalario()>sueldoMayor) {
				sueldoMayor=empleados[i].getSalario();
				empMayor=i;
			}
			
		}
		System.out.println("El trabajador con un salario mayor se llama "+ empleados[empMayor].getNombre()
				+ " " + empleados[empMayor].getApellidos()+ " y tiene un sueldo de "+ empleados[empMayor].getSalario());
		
	}

	public static void mostrarTodos (Empleado [] empleados) {
		
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i]);
		}
	}
	
}
