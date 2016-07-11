package genericostipo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.event.*;

/**
 * Created by Aditya on 30/06/2016.
 */
public class FormularioString extends Formulario implements ActionListener{
    public static OperacoesVetor<String> cadastro;

    public FormularioString(){
        btnIncluir.addActionListener(this);
        btnExcluir.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnListar.addActionListener(this);
        btnUltimo.addActionListener(this);

        int lim = Integer.parseInt(txtNumMaximo.getText());
        cadastro = new OperacoesVetor<String>(lim);
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
        if (cadastro.estaCheio()){
            JOptionPane.showMessageDialog(null, "A lista esta cheia", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        cadastro.inserirItem(txt);
    }

    public static void excluir(){
        if (cadastro.estaVazio())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Removido o item: " + cadastro.excluirUltimo());

    }

    public static String listar(){
        if (cadastro.estaVazio())
            return "A lista esta vazia";
         else
            return cadastro.listarElementos();
    }
    public static void limpartudo(){
        if (cadastro.estaVazio())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            cadastro.limpar();

    }

    public static void verUltimo(){
        if (cadastro.estaVazio())
            JOptionPane.showMessageDialog(null, "A lista esta vazia", "Erro", JOptionPane.ERROR_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "O ultimo elemento da lista: " + cadastro.verUltimoElemento());

    }

    public static void main(String args[]){
        new FormularioString().setVisible(true);
    }

}
