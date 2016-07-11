package arqdatflu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Aditya on 29/06/2016.
 */
public class EscreveTextoBuffer {
    public static void escreve(File arq, String texto) {

        try {

            FileWriter writer = new FileWriter(arq);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(texto);
            bufferedWriter.close();
            writer.close();
        }
        catch( IOException err) {
            err.printStackTrace();
        }
    }
}
