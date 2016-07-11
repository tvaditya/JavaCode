package com.aditya.datastruc;


/**
 * Created by Aditya on 10/07/2016.
 */
import genericostipo.Formulario2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.event.*;

/**
 * Created by Aditya on 30/06/2016.
 */
public class FilaString extends Formulario2 implements ActionListener{
    public static Fila<String> fila;

    public FilaString(){
        btnIncluir.addActionListener(this);
        btnExcluir.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnListar.addActionListener(this);
        btnUltimo.addActionListener(this);

        int lim = Integer.parseInt(txtNumMaximo.getText());
        fila = new Fila<String>(lim);
        System.out.println(lim);


    }

    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();

        if(obj == btnIncluir)
            incluir(txtValor.getText());

        if(obj == btnListar)
            taTexto.setText(listar());

        if(obj == btnExcluir)
            excluir();

        if(obj == btnLimpar)
            limpartudo();

        if(obj == btnUltimo)
            verUltimo();

        taTexto.setText(listar());

        lblNumItem.setText("Num itens = " + fila.tamanhoFila());
        lblPosInicio.setText("Pos inicio = " + fila.getPosInicio());
        lblValorInicio.setText("Valor inicio = " + fila.getInicio());
        lblPosfFim.setText("Pos fim = " + fila.getPosFim());

        if (fila.getPosFim() == -1)
         lblValorFim.setText("Valor fim = null");
        else
         lblValorFim.setText("Valor fim = " + fila.getFim());

    }

    public static void incluir(String txt){
        if (fila.cheia()){
            JOptionPane.showMessageDialog(null, "A lista esta cheia", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        fila.incluir(txt);
    }

    public static void excluir(){
        if (fila.vazia())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Removido o item: " + fila.excluir());

    }

    public static String listar(){
        if (fila.vazia())
            return "A lista esta vazia";
        else
            return fila.listarTodos();
    }
    public static void limpartudo(){
        if (fila.vazia())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            fila.limpar();

    }

    public static void verUltimo(){
        if (fila.vazia())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "O ultimo elemento da lista: " + fila.getFim());

    }

    public static void main(String args[]){

        new FilaString().setVisible(true);
    }

}

