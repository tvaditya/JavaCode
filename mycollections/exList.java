package com.aditya.mycollections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aditya on 12/07/2016.
 * Example using the interface ArrayList of Collection
 * with the class Cliente
 */
public class exList {
    private static List<Cliente> lista;

    public static void main(String[] args){
        lista = new ArrayList<Cliente>();

        while(true){
            int i = JOptionPane.showOptionDialog(null, "Escolha uma opcao", "Cadstro de cliente", 0, 3,null, new String[]{
                    "Inserir no inicio",
                    "Inserir no final",
                    "Ver a lista"}, "Inserindo dados");

            if (i == -1)
                System.exit(0);
            if (i == 0)
                inserir(0);
                else if ( i == 1)
                    inserir(lista.size());
                else if ( i == 2)
                    verLista();
        }
    }

    private static void inserir(int posicao){

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

            lista.add(posicao, cliente);
    }

    private static void verLista(){
        String s = "Lista de Clientes";
        for(Cliente cli:lista)
                s +="\n" + cli;

        JOptionPane.showMessageDialog(null, s);
    }

}
