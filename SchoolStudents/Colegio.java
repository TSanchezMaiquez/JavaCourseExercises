package SchoolStudents;

public class Colegio {
	
	private Alumno [] alumnos;
	private String nombre;
	private int posicion =0;
	
	public Colegio (String nombre, int num) {
		this.alumnos= new Alumno[num];
		this.nombre =nombre;
		
	}
	public void nuevoAlumno (String nombre, double nota) {
		Alumno aux = new Alumno(nombre, nota);
		this.alumnos[posicion]=aux;
		posicion++;
		
	}
	public String getDatosAlumno (String nombre) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]!=null && alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
				return "Nombre: "+ alumnos[i].getNombre() + "\nNota: "+ alumnos[i].getNota();
			}
			
		}
		return "Alumno no encontrado";
	}
	
	public void expulsarAlumno (String nombre) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]!=null && alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
				alumnos[i]=null;
			}
		}
	}
	public void setNotaMedia (String nombre, double nota) {
		
		for (int i = 0; i < alumnos.length; i++) {
		if (alumnos[i]!=null && alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
			double notaAlumno =alumnos[i].getNota();
			notaAlumno=(notaAlumno + nota) /2;
			alumnos[i].setNota(notaAlumno);
			
			}
		}
		
	}
	public void getTodosAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i]!=null) {
			System.out.println("Alumno nº "+ (i+1)+ alumnos[i].getAlumno() );
			}
		}
	}
}
