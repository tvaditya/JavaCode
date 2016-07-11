package arqdatflu;

import javax.swing.JOptionPane;
import java.io.File;

/**
 * Created by Aditya on 29/06/2016.
 */
public class MainLerTexto {

    public static void main(String args[]){
        File arq = new File("C:\\ScalaCourse\\arqjav.txt");
        String s = LerTexto.ler(arq);
        System.out.println(s);

        JOptionPane.showMessageDialog(null, s);
    }
}
