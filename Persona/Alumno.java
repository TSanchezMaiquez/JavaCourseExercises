package Persona;

public class Alumno extends Persona{
	
	private String aOptitiva;
	private String aula;

	public Alumno(String nombre, String optativa, String aula) {
		super(nombre);
		this.aOptitiva=optativa;
		this.aula=aula;
		
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El/La alumno/a con nombre "+ this.getNombre() +" tiene como optativa "+ this.aOptitiva +
				" que se da en el aula"+ this.aula;
	}

}
