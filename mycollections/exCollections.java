package com.aditya.mycollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * Created by Aditya on 12/07/2016.
 * An example to test the Collection interface and methods
 * Using the class Cliente which means customer
 */
public class exCollections{

    private static Collection<Cliente> colecao;

    public static void main(String[] args){

        colecao = new ArrayList<Cliente>();

        while(true){
            Cliente cliente = new Cliente();

            String s = JOptionPane.showInputDialog("Digite o nome de cliente: ");

            if (s == null)
                break;

            cliente.setNome(s);



            if(colecao.contains(cliente)){
                JOptionPane.showMessageDialog(null, "Cliente já cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            s = JOptionPane.showInputDialog("Digite o e-mail do cliente: ");
            if ( s == null)
                break;

            cliente.setEmail(s);

            colecao.add(cliente);
        }

        String s = "Lista de Clientes Cadstrados: ";

 //       for(Cliente cli:colecao)
  //          s +="\n" + cli;

        Iterator<Cliente> cli = colecao.iterator();
        while(cli.hasNext())
            s +="\n" + cli;

        JOptionPane.showMessageDialog(null, s);

        if (colecao.isEmpty()){
            JOptionPane.showMessageDialog(null," A lista esta vazia");
        } else {
            JOptionPane.showMessageDialog(null, " Esta lista possui" + colecao.size() + " objetos.");
        }

    }
}

