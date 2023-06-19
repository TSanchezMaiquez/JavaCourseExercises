package Persona;

import java.util.Date;

public class Manager extends Worker implements ForManagers{

	private double incentivo;
	private String cargo;
	
	public Manager(String nombre, Date fechaAlta, double sueldo) {
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

	@Override
	public double setBonus(double bonus) {
		
		return 2000 + bonus + ForWorkers.bonus;
	}
	
	
}
