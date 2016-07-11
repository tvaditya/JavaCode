package genericostipo;

import javax.swing.JOptionPane;

/**
 * Created by Aditya on 30/06/2016.
 */
public class AulaGenerico {
    public static <E> void ImprimeArray(E[] nome){
        String msg = "Lista de nomes: ";
        for(E valor:nome)
            msg += "\n - " + valor;

        JOptionPane.showMessageDialog(null, msg);

    }
    public static void main(String args[]){
        String[] arrayDeString = {"Tantravahi", "Venkata","Aditya","Bom","do", "Avalon"};
        Integer[] arrayDeInteger = { 1, 2, 3, 4, 5, 6, 7};
        Character[] arrayDeCaracteres = {'a', 'b', 'c'};
        Double[] arrayDeDouble = { 1.2, 2.3, 4.5, 6.7, 8.9};
        ImprimeArray(arrayDeDouble);

    }
}
