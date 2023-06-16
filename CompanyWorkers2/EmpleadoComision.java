package CompanyWorkers2;

import java.text.DecimalFormat;

public class EmpleadoComision extends Empleado{
	private double sueldo;
	private int clientesCaptados;
	private double comision;

	public EmpleadoComision(String dni, String nombre, String apellidos, int anioAlta, int clientesCap, double comision) {
		super(dni, nombre, apellidos, anioAlta);
		sueldo =950;
		this.clientesCaptados= clientesCap;
		this.comision=comision;
	}
	public EmpleadoComision() {
		super();
		sueldo= 950;
		
	}
	@Override
	public double getSalario() {
		DecimalFormat df = new DecimalFormat ("#.##");
		String result = df.format(this.clientesCaptados*this.comision);
		double resultado = Double.parseDouble(result.replace(',', '.'));
		if (resultado <950) {
			return sueldo;
		}else {
			return resultado;
		}
		
	}
	public String toString() {
		return "Este empleado a comision con dni " +this.getDni() +" se llama " + this.getNombre() + " "+ this.getApellidos() 
		+ " entro en la empresa en el año "+ this.getAnio()+ " ha captado a " + this.clientesCaptados + " con una comision de "
				+this.comision+ " y tiene un sueldo de " + this.getSalario(); 
	}

}
