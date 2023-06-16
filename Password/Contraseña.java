package Password;


public class Contraseña {
	
	private String [] contraseña;
	private int longitud;
	private int minuscula;
	private int mayuscula;
	private int numero;
	private char [] abecedario;
	
	public Contraseña (int num, int longitud) {
		contraseña = new String [num];
		this.longitud=longitud;
		
	}
	
	public String [] getContraseña () {
		
		this.construirContraseña();
		return contraseña;
	}
	
	public int getLongitudContraseña () {
		return longitud;
	}
	
	private void construirContraseña () {
		
		   this.abecedario = new char[62];
		    int indice = 0;

		    for (char letra = 'a'; letra <= 'z'; letra++) {
		        abecedario[indice] = letra;
		        indice++;
		    }
		    for (char letra = 'A'; letra <= 'Z'; letra++) {
		        abecedario[indice] = letra;
		        indice++;
		    }
		    for (char numero = '0'; numero <= '9'; numero++) {
		        abecedario[indice] = numero; 
		        indice++;
		    }

		for (int i = 0; i < contraseña.length; i++) {
			contraseña[i]="";
			for (int j = 0; j < longitud; j++) {
				double random = Math.random()*62;
				int ind = (int) random;
				contraseña[i]+=abecedario[ind];
			}
		}
	}
	
	public String comprobarContraseña(String contra) {
		numero=0;
		minuscula=0;
		mayuscula=0;
		for (int i = 0; i < contra.length(); i++) {
			
			char caracter = contra.charAt(i);
			for (int j = 0; j < abecedario.length; j++) {
				if (caracter == abecedario[j]) {
					if (j <26) {
						this.minuscula++;
						break;
					}
					else if (j >25 && j <52) {
						this.mayuscula++;
						break;
					}
					else {
						this.numero++;
					}
				}
			}
		}
		if (this.numero>4 && this.minuscula>1 && this.mayuscula>2) {
			return "Contraseña segura";
		}
		else {
			return "Contraseña no segura";
		}
	}
}
