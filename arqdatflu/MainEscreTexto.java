package arqdatflu;

import java.io.File;

/**
 * Created by Aditya on 29/06/2016.
 */
public class MainEscreTexto {

    public static void main(String args[]){
        File arq = new File("C:\\ScalaCourse\\saida.txt");
        String texto = "Este documento pertence a Tantravahi Aditya";
        EscreverTexto.escreve(arq, texto);
    }
}
