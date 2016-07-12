package com.aditya.mycollections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aditya on 12/07/2016.
 * Another example using ArrayList
 */
public class exArrayList {
    private static List<Cliente> lista;

    public static void main (String[] args){
        lista = new ArrayList<>();

        while(true){
            int i = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Cadastro de cliente", 0, 3,null, new String[]{
                    "Inserir",
                    "Excluir",
                    "Alterar",
                    "Consultar",
                    "Ver a lista"}, "Inserindo dados");

            if (i == -1)
                System.exit(0);
            if (i == 0)
                inserir();
            else if ( i == 1)
                excluir();
            else if ( i == 2)
                alterar();
            else if ( i == 3)
                consultar();
            else if ( i == 4)
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

        lista.add(cliente);
    }

    private static void excluir(){
        Cliente cliente = new Cliente();
        String s = JOptionPane.showInputDialog("Digite o nome do cliente");
        if(s==null)
            return;

        cliente.setNome(s);
        int posicao = lista.indexOf(cliente);

        if(posicao == -1){
            JOptionPane.showMessageDialog(null,"O cliente " + cliente.getNome() + " nao foi localizado.");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "O cliente " + lista.remove(posicao) + " foi removido." );
        }

    }

    private static void alterar(){
        Cliente cliente = new Cliente();
        String s = JOptionPane.showInputDialog("Digite o nome do cliente");
        if(s==null)
            return;

        cliente.setNome(s);
        int posicao = lista.indexOf(cliente);

        if(posicao == -1){
            JOptionPane.showMessageDialog(null,"O cliente " + cliente.getNome() + " nao foi localizado.");
            return;
        } else {
            s = JOptionPane.showInputDialog("Digite o novo e-mail");
            if (s==null)
                return;
            cliente.setEmail(s);
            JOptionPane.showMessageDialog(null, "O  mail cliente " + lista.set(posicao, cliente) + " foi alterado para " + cliente );
        }


    }

    private static void consultar(){
        Cliente cliente = new Cliente();
        String s = JOptionPane.showInputDialog("Digite o nome do cliente");
        if(s==null)
            return;

        cliente.setNome(s);
        int posicao = lista.indexOf(cliente);

        if(posicao == -1){
            JOptionPane.showMessageDialog(null,"O cliente " + cliente.getNome() + " nao foi localizado.");
            return;
        } else {

            JOptionPane.showMessageDialog(null, "O cliente consultado foi " + lista.get(posicao) );
        }
    }

    private static void verLista(){
        String s = "Lista de Clientes";
        for(Cliente cli:lista)
            s +="\n" + cli;

        JOptionPane.showMessageDialog(null, s);
    }
}
