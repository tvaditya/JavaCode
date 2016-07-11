package arqdatflu;

import java.io.File;

/**
 * Created by Aditya on 29/06/2016.
 */
public class MainLendoBuffer {
    public static void main(String args[]){
        File entrada = new File("C:\\ScalaCourse\\arqjav.txt");
        File saida = new File("C:\\ScalaCourse\\arqjav-buffered-copy.txt");

        String s = LendoBuffer.ler(entrada);
        EscreveTextoBuffer.escreve(saida,s);
    }
}
