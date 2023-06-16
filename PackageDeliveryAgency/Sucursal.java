package PackageDeliveryAgency;

public class Sucursal {
	
	private int numSucursal;
	private String direccion;
	private String ciudad;
	
	public Sucursal (int numSucursal, String direccion, String ciudad) {
		 this.numSucursal= numSucursal;
		 this.direccion = direccion;
		 this.ciudad = ciudad;
	}

	public int getNumSucursal() {
		return numSucursal;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public static int setPrecio (Paquete paquete) {
		
		if (paquete.getPrioridad()==0) {
			return paquete.getPeso() * 10;
			
		}else if (paquete.getPrioridad()==1) {
			return paquete.getPeso() * 10 + 10;
		}else {
			return paquete.getPeso() * 10 +20;
		}
	}
	public String toString () {
		return "\nDatos de la sucursal: \n---------------------\nNúmero de sucursal: "+ this.getNumSucursal() +"\nDireccion: "
	+ this.getDireccion() + "\nCiudad: "+ this.getCiudad();
	}
	
}
