package com.aditya.datastruc;

/**
 * Created by Aditya on 11/07/2016.
 */
public class FilaDinamica<E> {
    private ListaDuplaEncadeada<E> lista;

    public FilaDinamica(){
        lista = new ListaDuplaEncadeada<>();
    }

    public void incluir( E objeto){
        lista.inserir(objeto);
    }

    public void excluir(){
        lista.removerUltimo();
    }

    public E consultar(){
        return lista.getUltimo();
    }

    public boolean vazia(){
        return lista.vazia();
    }


}
