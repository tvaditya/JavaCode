package arqdatflu;

import javax.swing.JOptionPane;
import java.io.File;

/**
 * Created by Aditya on 29/06/2016.
 */
public class CopiarArqTexto {
    public static void main(String args[]){
        File arq = new File("C:\\ScalaCourse\\saida.txt");
        //String texto = "Este documento pertence a Tantravahi Aditya";
        File saida = new File("C:\\ScalaCourse\\saidacopia3.txt");
       // String texto;
        //Com JOptioPane
       String texto =  JOptionPane.showInputDialog("Digite um texto:" );

        //String texto = LerTexto.ler(arq);
        EscreverTexto.escreve(saida, texto);
    }
}
