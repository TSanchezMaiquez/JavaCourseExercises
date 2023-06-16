package CompanyWorkers;

import java.util.GregorianCalendar;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	GregorianCalendar calendario;
	private int id;
	private static int idSiguiente =1;

	public Empleado (String nombre, double sueldo, int agno, int mes, int dia) {
		this.nombre=nombre;
		this.sueldo=sueldo;
		this.calendario=new GregorianCalendar (agno, mes, dia);
		id=idSiguiente;
		idSiguiente++;
	}
	
	public String getDatosEmpleado () {
		return "El empleado " + nombre + " tiene el Id "+ id;
	}
	
	public double getSueldo () {
		return sueldo;
	}
	
	public GregorianCalendar getFechaAlta() {
		return calendario;
	}
	
	public void setSubirSueldo (double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public static String getIdSiguiente() {
		return "El id del siguiente empleado sera: "+ idSiguiente;
	}
	
}
