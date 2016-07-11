package genericostipo;

/**
 * Created by Aditya on 30/06/2016.
 */
public class OperacoesVetor <E> {
    private E[] obj;
    private int posicao;

    public OperacoesVetor( int limite){
        obj = (E[]) new Object[limite];
    }

    //metodo para incluir um item no vetor
    public void inserirItem(E valor){
        obj[posicao] = valor;
        posicao++;
    }
    //excluir ultimo item
    public E excluirUltimo(){
        --posicao;
        E elemento = obj[posicao];
        obj[posicao] = null;
        return elemento;
    }
    //excluir tudo
    public void limpar(){
        while (posicao > 0){
            --posicao;
            obj[posicao] = null;
        }
    }

    // listar todos os objetos
    public String listarElementos(){
        String txt = "";
        for(E elemento : obj){
            if (elemento == null)
                break;
            txt += elemento + "\n";
        }
        return txt;
    }

    public E verUltimoElemento(){
        return obj[posicao - 1];
    }

    // Verificar se a lista esta cheia
    public boolean estaCheio(){
        return obj.length == posicao;
    }

    //Verifica se esta vazio
    public boolean estaVazio(){
        return posicao == 0;
    }
}
