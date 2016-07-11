package arqdatflu;

import java.io.File;

/**
 * Created by Aditya on 29/06/2016.
 */
public class MainCopiaBinario {
    public static void main(String args[]){
        File entrada = new File("C:\\ScalaCourse\\week1-1.pdf");
        File saida = new File("C:\\ScalaCourse\\week1-1cop.pdf");

        System.out.println("Iniciando a copia do arquivo...");
        CopiaBinario.copia(entrada, saida);
        System.out.println("Copia criada com sucesso");
    }
}
