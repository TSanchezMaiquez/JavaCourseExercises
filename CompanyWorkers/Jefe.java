package CompanyWorkers;

public class Jefe extends Empleado{
	
	private double incentivo;
	

	public Jefe(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
		
	}
	
	public void setIncentivo (double b) {
		
		incentivo =b;
	}
	
	public double getSueldo () {
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}

}
