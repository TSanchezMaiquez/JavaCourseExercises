package PackageDeliveryAgency;

public class Paquete {

	public String referenciaEnvio;
	private int peso;
	private String dni;
	private int prioridad;
	
	public Paquete (int peso, String dni, int prioridad) {
		if (peso<0) {
			this.peso=0;
		}else {
			this.peso=peso;
		}
		this.dni = dni;
		if (prioridad >=0 && prioridad <=2) {
			this.prioridad=prioridad;
		}else {
			this.prioridad = 0;
		}
		int referencia = (int)(Math.random()* 999999 +1);
		this.referenciaEnvio = "RS" + referencia;
	}
	
	public void setpeso (int peso) {
		
		if (peso <=0) {
			System.out.println("El peso no debe ser inferior o igual a 0");
		}else
			this.peso=peso;
	}
	public void setprioridad (int prioridad) {
		if (prioridad >=0 && prioridad <3) {
			this.prioridad = prioridad;
		}else {
			System.out.println("prioridad no valida");
		}
			
	}
	public int getPeso () {
		return peso;
	}
	public int getPrioridad () {
		return prioridad;
	}
}
