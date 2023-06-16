package Persona;

import java.util.Date;

public class UsoPersona {

	public static void main(String[] args) {
	
		/*Empleado Juan = new Empleado ("Juan", new Date (234546549), 2500);
		
		System.out.println(Juan.getNombre());
		
		System.out.println(Juan.getDescripcion());
		
		Jefe Ana = new Jefe ("Ana", new Date (234546549), 3500);
		System.out.println(Ana.getNombre());
		System.out.println(Ana.getDescripcion());
		
		Alumno Maria = new Alumno ("Maria", "Dibujo", "Aula 5");
		System.out.println(Maria.getNombre());
		System.out.println(Maria.getDescripcion());
		
		Jefe David = new Jefe ("David", new Date (5675756), 4800);
		David.setCargo("Director RRPP");
		System.out.println(David.getNombre());
		System.out.println(David.getDescripcion() + David.getCargo());
		*/
		
		Empleado [] empleados = new Empleado[5];
		empleados[0]= new Empleado ("Juan", new Date (346546756), 2500);
		empleados[1]= new Empleado ("Maria", new Date (346546756), 1500);
		empleados[2]= new Empleado ("Ana", new Date (346546756), 3500);
		empleados[3]= new Empleado ("Sandra", new Date (346546756), 6000);
		empleados[4]= new Empleado ("Antonio", new Date (346546756), 2100);

		for (Empleado e: empleados) {
			System.out.println(e.getDescripcion());
			
		}

	}

}
