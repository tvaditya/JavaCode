package com.aditya.mycollections;

import javax.swing.*;
import java.util.LinkedList;


/**
 * Created by Aditya on 12/07/2016.
 * An example using LinkedList interface from Collections
 */
public class exLinkedList {
    private static LinkedList<Cliente> lista;

    public static void main (String[] args){
        lista = new LinkedList<>();

        while(true){
            int i = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Cadastro de cliente", 0, 3,null, new String[]{
                    "Inserir",
                    "Excluir",
                    "Consultar",
                    "Ver a lista"}, "Inserindo dados");

            if (i == -1)
                System.exit(0);
            if (i == 0)
                inserir();
            else if ( i == 1)
                excluir();
            else if ( i == 2)
                consultar();
            else if ( i == 3)
                verLista();
        }
    }

    private static void inserir(){
        Cliente cliente = new Cliente();

        String s = JOptionPane.showInputDialog("Digite o nome de cliente: ");

        if (s == null)
            return;
        cliente.setNome(s);

        if(lista.contains(cliente)){
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        s = JOptionPane.showInputDialog("Digite o e-mail do cliente: ");
        if ( s == null)
            return;
        cliente.setEmail(s);

        int i = JOptionPane.showOptionDialog(null, "Escolha uma opcao de insercao", "Cadastro de cliente", 0, 3,null, new String[]{
                "No inicio",
                "No Final"}, "Inserindo dados");

        if( i == 0)
            lista.addFirst(cliente);
        if(i == 1)
            lista.addLast(cliente);
    }

    private static void excluir(){
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null,"A lista esta vazia!");
            return;
        }
        Cliente cliente = null;

        int i = JOptionPane.showOptionDialog(null, "Escolha uma opcao de exclusao", "Cadastro de cliente", 0, 3,null, new String[]{
                "No inicio",
                "No Final"}, "Inserindo dados");

        if( i == 0)
            lista.removeFirst();
        if(i == 1)
            lista.removeLast();

        if (cliente != null)
            JOptionPane.showMessageDialog(null, "Cliente " + cliente + " excluido ");

    }



    private static void consultar(){
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null,"A lista esta vazia!");
            return;
        }
        Cliente cliente = null;

        int i = JOptionPane.showOptionDialog(null, "Escolha uma opcao de consulta", "Cadastro de cliente", 0, 3,null, new String[]{
                "No inicio",
                "No Final"}, "Inserindo dados");

        if( i == 0)
            lista.getFirst();
        if(i == 1)
            lista.getLast();

        if (cliente != null)
            JOptionPane.showMessageDialog(null, "Cliente consultado: " + cliente );
    }

    private static void verLista(){
        String s = "Lista de Clientes";
        for(Cliente cli:lista)
            s +="\n" + cli;

        JOptionPane.showMessageDialog(null, s);
    }
}

