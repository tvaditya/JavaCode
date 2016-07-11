package com.aditya.datastruc;

/**
 * Created by Aditya on 10/07/2016.
 */
public class Lista<E> {
    private E[]  L = (E[]) new Object[5];
    private int totalDeObjetos = 0;

    public void inserir(E objeto){
        L[totalDeObjetos]  = objeto;
        totalDeObjetos++;
    }

    public void inserir(int posicao, E objeto){
        if(!posicaoPreenchida(posicao))
            throw new IllegalArgumentException("Posicao invalida.");

        for(int i = totalDeObjetos-1; i >= posicao; i--){
            L[i+1] = L[i];
        }

    }
    public int tamanhoDaLista(){
        return totalDeObjetos;
    }

    public E verObjeto(int posicao){
        if(!posicaoPreenchida(posicao))
            throw new IllegalArgumentException("Posicao nao preenchida.");
        return L[posicao];
    }

    private boolean posicaoPreenchida(int posicao){
        if ((posicao >= 0) && (posicao < totalDeObjetos))
                return true;
        else
            return false;
    }

    public void excluir(int posicao){
        if(!posicaoPreenchida(posicao))
            throw new IllegalArgumentException("Posicao invalida.");

        for(int i = totalDeObjetos-1; i >= posicao; i++){
            L[i] = L[i+1];
        }
        totalDeObjetos--;

    }

    private void dobraTamanho(){
        if(totalDeObjetos == L.length){
            E[] novo = (E[]) new Object[L.length*2];

            for(int i=0;i<L.length;i++){
                novo[i] = L[i];
            }
            L = novo;
        }
    }

}
