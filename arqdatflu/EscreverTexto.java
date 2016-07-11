package arqdatflu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Aditya on 29/06/2016.
 */
public class EscreverTexto {
    public static void escreve(File arq, String texto) {

        try {

            FileWriter writer = new FileWriter(arq);
            char[] c = texto.toCharArray();

            for (int i = 0; i < c.length; i++) {
                writer.write(c[i]);
            }
            writer.close();
        }
        catch( IOException err) {
            err.printStackTrace();
        }
    }
}
