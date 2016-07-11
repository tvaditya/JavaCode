package arqdatflu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.FileNotFoundException;

/**
 * Created by Aditya on 29/06/2016.
 */
public class CopiaBinario {

    public static void copia(File entrada, File saida){



        try{
            FileInputStream input = new FileInputStream(entrada);
            FileOutputStream output = new FileOutputStream(saida);
            int c;
            do{
                c= input.read();
                if(c != -1){
                    output.write(c);
                    System.out.println(c);
                }
            }while (c != -1);
            input.close();
            output.close();
        }
        catch (IOException err){
            err.printStackTrace();
        }




    }
}
