package com.aditya.datastruc;

/**
 * Created by Aditya on 06/07/2016.
 */
public class Pilha <E> {
    private E[] P;
    private int topo;

    public Pilha(int limite){
        P = (E[]) new Object[limite];
        topo = -1;
    }

    public void inserir( E objeto){
        topo = topo + 1;
        P[topo] = objeto;
    }

    public E excluir(){
        E elemento = P[topo];
        P[topo] = null;
        topo = topo - 1;
        return elemento;
    }

    public boolean vazia(){
        if (topo == -1)
            return true;
        else
            return false;
    }
    public boolean cheia(){
        if (topo == P.length -1)
            return true;
        else
            return false;
    }

    public E ultimo(){
        return P[topo];
    }

    // listar todos os objetos
    public String listarElementos(){
        String txt = "";
        for(E elemento : P){
            if (elemento == null)
                break;
            txt += elemento + "\n";
        }
        return txt;
    }

    public void limpar(){
        while (topo > 0){
            --topo;
            P[topo] = null;
        }
    }
}
