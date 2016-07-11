package genericostipo;

import java.text.NumberFormat;

/**
 * Created by Aditya on 30/06/2016.
 */
public class Cursos {
    private String titulo;
    private double preco;

    public Cursos( String titulo, double preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    public String toString(){
        NumberFormat n = NumberFormat.getCurrencyInstance();
        return titulo + " = " + n.format(preco);
    }
}
