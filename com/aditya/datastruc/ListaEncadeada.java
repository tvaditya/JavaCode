package com.aditya.datastruc;

/**
 * Created by Aditya on 11/07/2016.
 */
public class ListaEncadeada<E> {
    private Nodo primeiro;
    private Nodo ultimo;
    private int totalObjetos;


    public void inserirInicio(E objeto){
        Nodo novoNodo = new Nodo(primeiro, objeto);
        primeiro = novoNodo;

        if (totalObjetos == 0){
            ultimo = primeiro;
        }
        totalObjetos++;
    }

    public void inserir(E objeto){
        if(totalObjetos==0){
            inserirInicio(objeto);
        } else {
            Nodo novoNodo = new Nodo(objeto);
            ultimo = novoNodo;
            totalObjetos++;
        }
    }

    private boolean posicaoPreenchida(int posicao){
        if ((posicao >= 0) && (posicao < totalObjetos))
            return true;
        else
            return false;
    }

    private Nodo pegaNodo(int posicao){
        if(!posicaoPreenchida(posicao))
            throw new IllegalArgumentException("Posicao invalida.");
        Nodo atual = primeiro;
        for (int i = 0; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;

    }

    public void inserir(int posicao, E objeto){
        if (posicao==0){
            inserirInicio(objeto);
        }else if(posicao==totalObjetos){

            inserir(objeto);
        } else {
            Nodo anterior = pegaNodo(posicao-1);
            Nodo novoNodo = new Nodo(anterior.getProximo(), objeto);
            anterior.setProximo(novoNodo);
            totalObjetos++;
        }
    }

    public E verObjeto(int posicao){
        if(!posicaoPreenchida(posicao))
            throw new IllegalArgumentException("Posicao nao preenchida.");
        return (E) pegaNodo(posicao).getObjeto();
    }

    public int tamanhoDaLista(){
        return totalObjetos;
    }

    public void removerInicio(){
        if(!posicaoPreenchida(0))
            throw new IllegalArgumentException("Posicao nao preenchida.");

        primeiro = primeiro.getProximo();
        totalObjetos--;
    }
}
