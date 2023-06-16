package AccountUtils;

public class cuentaBancaria {
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public cuentaBancaria(String nombreTitular, double saldo) {
		
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
		this.numeroCuenta = (long) ((Math.random()*999999999)+1);
	}
	
	public void setIngreso (double saldo) {
		if(saldo > 0) {
			this.saldo += saldo;
		}
		
	}
	public void setReintegro (double saldo) {
		
			this.saldo -= saldo;
		
	}
	
	public double getSaldo () {
		
		return this.saldo;
	}
	
	public String datosCuenta () {
		
		return "Titular de la cuenta: " + this.nombreTitular +"\nSaldo: " 
		+ this.saldo + "\nNº de cuenta: " + this.numeroCuenta+ "\n";
	}
	
	public void transferirDinero (cuentaBancaria cuenta1,cuentaBancaria cuenta2, double saldo) {
		cuenta1.saldo -= saldo;
		cuenta2.saldo += saldo;
		
	}
}
