package com.aditya.datastruc;

/**
 * Created by Aditya on 06/07/2016.
 */
import genericostipo.Formulario;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
//import javax.swing.event.*;

/**
 * Created by Aditya on 30/06/2016.
 */
public class PilhaString extends Formulario implements ActionListener{
    public static Pilha<String> pilha;

    public PilhaString(){
        btnIncluir.addActionListener(this);
        btnExcluir.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnListar.addActionListener(this);
        btnUltimo.addActionListener(this);

        int lim = Integer.parseInt(txtNumMaximo.getText());
        pilha = new Pilha<String>(lim);
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

    }

    public static void incluir(String txt){
        if (pilha.cheia()){
            JOptionPane.showMessageDialog(null, "A lista esta cheia", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pilha.inserir(txt);
    }

    public static void excluir(){
        if (pilha.vazia())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Removido o item: " + pilha.excluir());

    }

    public static String listar(){
        if (pilha.vazia())
            return "A lista esta vazia";
        else
            return pilha.listarElementos();
    }
    public static void limpartudo(){
        if (pilha.vazia())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            pilha.limpar();

    }

    public static void verUltimo(){
        if (pilha.vazia())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "O ultimo elemento da lista: " + pilha.ultimo());

    }

    public static void main(String args[]){
        new PilhaString().setVisible(true);
    }

}
