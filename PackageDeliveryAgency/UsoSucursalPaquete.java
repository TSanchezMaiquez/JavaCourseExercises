package PackageDeliveryAgency;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoSucursalPaquete {

	
	public static void main (String args []) {
		
		Scanner kb = new Scanner (System.in);
		
		Sucursal sucursal1 = new Sucursal(134, "calle alegria", "Murcia");
		System.out.print("¿Cuantos paquetes se van a enviar? \nIntroduce numero: ");
		int numPaquetes = kb.nextInt();
		
		ArrayList <Paquete> paquetes = new ArrayList();
		
		for (int i = 0; i < numPaquetes; i++) {
			System.out.println("\nPaquete numero "+ (i+1));
			System.out.print("Introduce peso: ");
			int peso = kb.nextInt();
			kb.nextLine();
			System.out.print("Introduce dni: ");
			String dni = kb.nextLine();
			System.out.print("Introduce prioridad: ");
			int prioridad = kb.nextInt();
			
		
			Paquete aux = new Paquete (peso, dni, prioridad);
			paquetes.add(aux);
			
		}
		System.out.println(sucursal1);
		
		for (int i = 0; i < paquetes.size(); i++) {
			System.out.println("\nDatos del paquete "+ (i+1) +"\n-------------------\n");
			System.out.println("Referencia paquete: "+paquetes.get(i).referenciaEnvio);
			System.out.println("Peso: "+paquetes.get(i).getPeso());
			System.out.println("Prioridad: "+ paquetes.get(i).getPrioridad());
			System.out.println("Precio: "+ Sucursal.setPrecio(paquetes.get(i)));
		}
	}
}
