package IntroductoryLanguagePackage;


public class SubString_y_Equals {

	public static void main(String[] args) {
	
		String frase= "¡En la cabeza no, que estoy estudiando";
		//De una cadena de texto coge la parte que tu le indiques, en este caso a partir de la posición 22
		String frase2= frase.substring(22);
		//Lo mismo que en lo anterior pero en este caso le dices donde empieza y donde acaba
		String frase3= frase.substring(1, 13);
		System.out.println("¿Sabes que? "+ frase2 + ". Por esto tienes que dejar de pergarme... ¡" + frase3+"!");

		String casa= "hogar";
		String casa2="Hogar";
		
		//Compara las dos variables, ignora mayusculas y dice si es true o false
		boolean compara= casa.equalsIgnoreCase(casa2);
		
		System.out.println("A lo que mi madre respondio: \"Eso es "+ compara+ "\"");
	
	}

}
