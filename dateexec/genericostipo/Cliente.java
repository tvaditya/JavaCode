package genericostipo;

/**
 * Created by Aditya on 30/06/2016.
 */
public class Cliente {
    private String codigo;
    private String nome;

    public Cliente(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public String toString(){
        return codigo + " : " + nome;
    }
}
