package CompanyWorkers;

public class UsoEmpleado {

	public static void main(String[] args) {

	Empleado Antonio = new Empleado ("Antonio", 2300.5, 2005, 7, 15);
	Jefe Ana = new Jefe ("Ana", 2900, 2008, 8, 9);
	
	Ana.setIncentivo(300.5);
	System.out.println(Ana.getSueldo());
	
	Jefe Juan = new Jefe ("Juan", 8000, 2013, 8, 5);
	Juan.setIncentivo(200);
	
	Empleado [] empleados = new Empleado[6];
	empleados [0]= new Empleado ("Antonio", 2330.5, 2005, 7, 5);
	empleados [1]= new Empleado ("Carlos", 5000.5, 2007, 6, 5);
	empleados [2]= new Empleado ("MAria", 2500.5, 2006,11, 7);
	empleados [3]= new Empleado ("Ana", 7000, 2009, 5, 3);
	empleados [4]= Juan;
	empleados [5]= new Jefe ("Isabel", 8000,2007, 5, 6);
	
	Jefe Isabel = (Jefe) empleados [5];
	Isabel.setIncentivo(500);
	
	Empleado Patricia = new Jefe ("Patricia", 2500, 2013, 5, 6);
	Jefe PatriciaDirectora = (Jefe) Patricia;
	
	for (Empleado obj : empleados) {
		System.out.println(obj.getDatosEmpleado() + " y un salario de: "+ obj.getSueldo());
	}

	}

}
