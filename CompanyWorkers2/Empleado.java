package CompanyWorkers2;

public abstract class Empleado {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int anioAlta;
	
	public Empleado (String dni, String nombre, String apellidos, int anioAlta) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.anioAlta=anioAlta;
	}
	public Empleado () {
		dni = "12345678A";
		nombre = "No disponible";
		apellidos = "No disponibles";
		anioAlta = 2010;
	}
	
	public String imprimir () {
		return "El empleado con apellidos" + this.apellidos + " y nombre "+ this.nombre + "con dni "
	+ this.dni+ "fue dado de alta en el anio "+ this.anioAlta;
	}
	
	public abstract double getSalario();
	
	public int getAnio() {
		return this.anioAlta;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}

	public String getDni () {
		return this.dni;
	}
}


