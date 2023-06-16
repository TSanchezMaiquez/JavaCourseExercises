package IntroductoryLanguagePackage;


public class Modificadores {

	public static void main(String[] args) {
		
		Clase3 obj = new Clase3();
		System.out.println(obj.mimensaje);
		System.out.println(obj.mimemsaje3);

	}

	
	
}

class Clase1 {
	
	protected String mensaje = "¿Estamos accediendo a este mensaje?";
}

class Clase2 extends Clase1{
	
	String mimensaje =mensaje;	
}

class Clase3 {
	
	Clase2 mimensaje2 = new Clase2();
	// Al no heredar la unica forma de acceder a las variables es creando un objeto de la clase
	String mimensaje = mimensaje2.mimensaje;
	String mimemsaje3 = mimensaje2.mensaje;
	
	
	
}


