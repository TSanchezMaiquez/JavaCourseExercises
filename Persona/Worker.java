package Persona;

import java.util.Date;

public class Worker extends Persona implements Comparable, ForWorkers{
	
	private double sueldo;
	private Date fechaAlta;
	

	public Worker(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.fechaAlta=fechaAlta;
		this.sueldo=sueldo;
		
	}

	@Override
	public String getDescripcion() {
		
		return "El/La empleado/a con nombre " + this.getNombre() + " tiene un sueldo de "+
		this.sueldo + "€ y fue dado/a de alta el "+ this.fechaAlta;
	}

	@Override
	public int compareTo(Object o) {
		
		Worker auxEmpleado = (Worker) o;
		
		if(this.sueldo <auxEmpleado.sueldo) {
			return -1;
		}else if (this.sueldo >auxEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}

	@Override
	public double setBonus(double bonus) {
		
		
		return bonus + ForWorkers.bonus;
	}

	
}
