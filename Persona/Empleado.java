package Persona;

import java.util.Date;

public class Empleado extends Persona{
	
	private double sueldo;
	private Date fechaAlta;
	

	public Empleado(String nombre, Date fechaAlta, double sueldo) {
		super(nombre);
		this.fechaAlta=fechaAlta;
		this.sueldo=sueldo;
		
	}

	@Override
	public String getDescripcion() {
		
		return "El/La empleado/a con nombre " + this.getNombre() + " tiene un sueldo de "+
		this.sueldo + "€ y fue dado/a de alta el "+ this.fechaAlta;
	}

	
}
