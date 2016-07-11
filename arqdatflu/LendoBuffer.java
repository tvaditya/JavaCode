package arqdatflu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Aditya on 29/06/2016.
 */
public class LendoBuffer {
    public static String ler(File arq){
        StringBuffer sb = new StringBuffer();

        try{

            FileReader reader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(reader);
           String s;
            do{
                s = bufferedReader.readLine();
                if (s != null) {
                    sb.append(s + "\r\n");
                }
            } while ( s != null);
            bufferedReader.close();
            reader.close();

        }
        catch(IOException err){
            err.getMessage();
            err.printStackTrace();

        }
        return sb.toString();
    }
}
