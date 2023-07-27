package flujoStreamsDeDatos;

import java.io.FileWriter;
import java.io.IOException;

public class WritingInFile {

	public static void main(String[] args) {
		
	Write writing = new Write();
	writing.writing();
	
	}

}

class  Write {
	
	public void writing () {
		
		String text = "I am writing via data streams 2";
		
		try {									//If the constructor has only 1 argument it will always create a new file.
												// with 2 arguments it will add the new text.
			FileWriter writing = new FileWriter("C:\\Users\\yunni\\Desktop\\Curso Java\\CursoJava\\src\\flujoStreamsDeDatos\\NewStream.txt", true);
		
			for (int i = 0; i < text.length(); i++) {
				writing.write(text.charAt(i));
			}
			writing.write("\n");
			writing.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
