package arqdatflu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Aditya on 29/06/2016.
 */
public class LerTexto {

    public static String ler(File arq){
        StringBuffer sb = new StringBuffer();

        try{

            FileReader reader = new FileReader(arq);
            int c;
            do{
                c = reader.read();
                if (c != -1) {
                    sb.append((char) c);
                }
            } while ( c != -1);
            reader.close();

        }
        catch(IOException err){
            err.getMessage();
            err.printStackTrace();

        }
        return sb.toString();
    }
}
