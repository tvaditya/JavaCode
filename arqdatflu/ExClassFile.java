package arqdatflu;

import java.io.File;

/**
 * Created by Aditya on 29/06/2016.
 */
public class ExClassFile {
    public static void main (String args[]) {
        File arq = new File("C:\\ScalaCourse\\arqjav.txt");
        System.out.println( "Nome do arquivo é: " + arq.getName() );
        System.out.println( "Caminho do arquivo é: " + arq.getAbsolutePath() );
        System.out.println( "Classe do arquivo é: " + arq.getClass() );
        System.out.println( "Pai diretorio do arquivo é: " + arq.getParent() );
        System.out.println( "Path do arquivo é: " + arq.getPath() );
        System.out.println( "É um direotrio: " + arq.isDirectory() );
        System.out.println( "o arquivo?: " + arq.isFile());
        System.out.println( "o arquivo tem permissao de escrita: " + arq.canWrite() );
        System.out.println( "o arquivo tem permissao de leitura: " + arq.canRead() );
        System.out.println( "o arquivo tem permissao de execucao: " + arq.canExecute() );

        //Testando separator

        System.out.println( "o separador de caminho: " + File.pathSeparator );
        System.out.println( "o separador de diretorio: " + File.separator );

        File discos[] = File.listRoots();

        for (int i = 0; i < discos.length; i++ ){
            System.out.println( " Disco " + (i+1) + ": " + discos[i]);
        }
    }
}
