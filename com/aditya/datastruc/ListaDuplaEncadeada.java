package com.aditya.datastruc;

/**
 * Created by Aditya on 11/07/2016.
 */
public class ListaDuplaEncadeada<E> {
    private Nodo primeiro;
    private Nodo ultimo;
    private int totalObjetos;


    public void inserirInicio(E objeto){
        if (totalObjetos == 0){
            Nodo novoNodo = new Nodo(objeto);
            ultimo = novoNodo;
            primeiro = novoNodo;
        }else{
            Nodo novoNodo = new Nodo(primeiro, objeto);
            primeiro.setAnterior(novoNodo);
            primeiro = novoNodo;
        }
        totalObjetos++;
    }

    public void inserir(E objeto){
        if(totalObjetos==0){
            inserirInicio(objeto);
        } else {
            Nodo novoNodo = new Nodo(objeto);
            novoNodo.setAnterior(ultimo);
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
            Nodo proximo = anterior.getProximo();
            Nodo novoNodo = new Nodo(anterior.getProximo(), objeto);
            novoNodo.setAnterior(anterior);
            anterior.setProximo(novoNodo);
            proximo.setAnterior(novoNodo);
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

    public void removerUltimo(){
        if(!posicaoPreenchida(0))
            throw new IllegalArgumentException("Posicao nao preenchida.");
        if(totalObjetos == 1){
            removerInicio();
        } else {
            Nodo penultimo = ultimo.getAnterior();
            penultimo.setProximo(null);
            ultimo = penultimo;
            totalObjetos--;
        }


    }

    public void remover(int posicao){
        if(!posicaoPreenchida(posicao))
            throw new IllegalArgumentException("Posicao nao preenchida.");

        if (posicao == 0) {
            removerInicio();
        } else if(posicao == totalObjetos - 1) {
            removerUltimo();
        } else {
            Nodo anterior = pegaNodo(posicao - 1);
            Nodo atual = anterior.getProximo();
            Nodo proximo = atual.getProximo();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            totalObjetos--;
        }
    }

    public E getUltimo(){
        return (E) ultimo.getObjeto();
    }

    public boolean vazia(){
        if(totalObjetos == 0)
            return true;
        else
            return false;
    }
}

