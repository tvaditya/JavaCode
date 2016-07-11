package com.aditya.datastruc;

/**
 * Created by Aditya on 11/07/2016.
 */
public class Nodo <E> {
    private Nodo proximo;
    private Nodo anterior;
    private E objeto;

    public Nodo( Nodo proximo, E elemento){
        this.proximo = proximo;
        this.objeto = elemento;
    }

    public Nodo(E elemento){
        this.objeto = elemento;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public E getObjeto() {
        return objeto;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
