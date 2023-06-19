package Persona;

import java.util.Arrays;
import java.util.Date;

public class UsoPersona {

	public static void main(String[] args) {
	
		
		Worker [] empleados = new Worker[5];
		empleados[0]= new Worker ("Juan", new Date (346546756), 2500);
		empleados[1]= new Worker ("Maria", new Date (346546756), 1500);
		empleados[2]= new Worker ("Ana", new Date (346546756), 3500);
		empleados[3]= new Worker ("Sandra", new Date (346546756), 6000);
		empleados[4]= new Worker ("Antonio", new Date (346546756), 2100);

		Arrays.sort(empleados);
		
		for (Worker e: empleados) {
			System.out.println(e.getDescripcion());
			
		}
		
		Manager Manuel = new Manager ("Manuel", new Date(465675), 5000);
		Worker Sonia = new Worker ("Sonia", new Date(3454646), 3000);

		System.out.println("The manager "+ Manuel.getNombre() + " has a bonus of "+ Manuel.setBonus(500));
		System.out.println("The worker "+ Sonia.getNombre() + " has a bonus of "+ Sonia.setBonus(500));
		
	}

}
