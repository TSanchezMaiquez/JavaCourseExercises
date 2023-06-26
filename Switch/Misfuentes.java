package Switch;

import java.awt.GraphicsEnvironment;

public class Misfuentes {

	public static void main(String[] args) {
		String [] misFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombreFuentes : misFuentes) {
			System.out.println(nombreFuentes);
		}

	}

}
