package AccountUtils;

public class usoCuenta {

	public static void main(String[] args) {
	
		cuentaBancaria cuenta1 = new cuentaBancaria ("Toñi", 250);
		cuentaBancaria cuenta2 = new cuentaBancaria ("Yunna", 350);
		
		cuenta1.setIngreso(150);
		cuenta1.setReintegro(100);
		
		cuenta1.transferirDinero(cuenta1, cuenta2, 150);
		
		System.out.println(cuenta1.datosCuenta());
		System.out.println(cuenta2.datosCuenta());
		

	}

}
