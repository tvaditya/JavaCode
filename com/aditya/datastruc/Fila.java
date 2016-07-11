package com.aditya.datastruc;

/**
 * Created by Aditya on 09/07/2016.
 */
public class Fila <E> {
    private E[] F;
    private int inicio, fim, numItens;

    public Fila(int limite){
        F = (E[]) new Object[limite];
        inicio = 0;
        fim = -1;
        numItens = 0;
    }

    public void incluir(E objeto){
        if (fim == F.length -1 )
            fim = -1;
        fim++;
        F[fim] =  objeto;
        numItens++;

    }

    public E primeiroElemento(){
        return F[inicio];
    }

    public E ultimoElemento(){
        return F[fim];
    }

    public E excluir(){
        E elementoTemporario = F[inicio];
        F[inicio] = null;
        inicio++;

        if(inicio == F.length)
            inicio = 0;

        numItens--;
        if(numItens == 0){
            inicio = 0;
            fim = -1;
        }
        return elementoTemporario;
    }

    public boolean vazia(){
        if (numItens == 0)
            return true;
        else
            return false;
    }

    public boolean cheia(){
        if (numItens == F.length)
            return true;
        else
            return false;
    }

    public int tamanhoFila(){
        return numItens;
    }

    public int getPosInicio(){
        return inicio;
    }

    public E getInicio(){
        return F[inicio];
    }

    public int getPosFim(){
        return fim;
    }

    public E getFim(){
        return F[fim];
    }

    public String listarTodos(){
        int primeiro = inicio;
        String txt ="";

        for (int i = 0; i < numItens; i++){
            txt += F[primeiro] + "\n";
            primeiro++;

            if (primeiro == F.length)
                primeiro = 0;
        }
        return txt;
    }

    public void limpar(){
        while (numItens > 0){
            --fim;
            F[fim] = null;
        }
    }

}
