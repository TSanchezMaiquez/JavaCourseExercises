package Persona;

import java.util.Date;

public class Jefe extends Empleado implements ParaJefes{

	private double incentivo;
	private String cargo;
	
	public Jefe(String nombre, Date fechaAlta, double sueldo) {
		super(nombre, fechaAlta, sueldo);
		
	}

	public void setIncentivo (double incentivo) {
		this.incentivo=incentivo;
	}

	@Override
	public void setCargo(String cargo) {
		this.cargo=cargo;
		
	}

	@Override
	public String getCargo() {
		
		return "\nAdemas tiene el cargo "+cargo;
	}
	
	
}
