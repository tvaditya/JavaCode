package com.aditya.datastruc;

/**
 * Created by Aditya on 11/07/2016.
 */
public class PilhaDinamica<E> {
    private ListaDuplaEncadeada<E> lista;

    public PilhaDinamica(){
        lista = new ListaDuplaEncadeada<>();
    }

    public void incluir( E objeto){
        lista.inserir(objeto);
    }

    public void excluir(){
        lista.removerInicio();
    }

    public E consultar(){
        return lista.getUltimo();
    }

    public boolean vazia(){
       return lista.vazia();
    }

    public int tamanhoDaLista(){
        return lista.tamanhoDaLista();
    }

    public E verOBjeto(int posicao){
        return lista.verObjeto(posicao);
    }


}
