package arquivo_txt;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Arquivo_TXT {

    public static void main(String[] args) {
        String textoQueSeraEscrito = "A memória RAM não foi gravada.";
		FileWriter arquivo;
		try {
			arquivo = new FileWriter(new File("Arquivo.txt"));
			arquivo.write(textoQueSeraEscrito);
			arquivo.close();
		} catch (IOException e) {
		} catch (Exception e) {
		}
  }
 
}