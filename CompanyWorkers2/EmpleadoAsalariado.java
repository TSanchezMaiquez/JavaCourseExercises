package CompanyWorkers2;

import java.time.LocalDate;

public class EmpleadoAsalariado extends Empleado{

	private double salario;
	
	public EmpleadoAsalariado(String dni, String nombre, String apellidos, int anioAlta, double sueldo) {
		super(dni, nombre, apellidos, anioAlta);
		this.salario = sueldo;
	
	}
	public EmpleadoAsalariado() {
		super();
		salario = 1200;
	}

	@Override
	public double getSalario() {
		 int anioActual = LocalDate.now().getYear();
		 
		 int aniosEmpresa= anioActual - this.getAnio();
		
		 if (aniosEmpresa<2) {
			 return salario;
		 }else if (aniosEmpresa>1 && aniosEmpresa <4) {
			 return salario+(salario*0.07);
		 }else if (aniosEmpresa >3 && aniosEmpresa <9) {
			 return salario + (salario*0.11);
		 }else {
		return salario+ (salario*0.17);
		 }
	}
	
	public String toString() {
		return "Este empleado asalariado con dni " +this.getDni() +" se llama " + this.getNombre() + " "+ this.getApellidos() 
		+ " entro en la empresa en el año "+ this.getAnio()+ " y tiene un sueldo de " + this.getSalario(); 
	}

}
