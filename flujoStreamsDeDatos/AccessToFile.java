package flujoStreamsDeDatos;

import java.io.FileReader;
import java.io.IOException;

public class AccessToFile {

	public static void main(String[] args) {
		
		ReadingFile access = new ReadingFile();
		access.fileReader();
	}

}
class ReadingFile {
	
	public void fileReader() {
		
		
		try {
			FileReader enter = new FileReader ("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\flujoStreamsDeDatos\\Nombres.txt");
			
			int character = 0;
			
			while (character!=-1) {
				character= enter.read();
				char letra = (char)character;
				System.out.println(letra);
			}
			enter.close();
		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not found");
		} 
	
	}
	
}