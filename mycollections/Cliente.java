package com.aditya.mycollections;

/**
 * Created by Aditya on 12/07/2016.
 * A class which to represent a customer
 * with his name and email
 */
public class Cliente {

    private String nome;
    private String email;

    public Cliente() {
        this.nome="";
        this.email="";
    }

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return this.nome+ " - " + this.email;
    }

    public boolean equals(Object obj){
        if(obj==null)
            return false;

        if(this.getClass() != obj.getClass())
            return false;

        if(this==obj)
            return true;

        final Cliente novoCliente = (Cliente) obj;

        if(this.nome == null && novoCliente != null)
            return false;

        if(this.nome != null && novoCliente.nome == null)
            return false;

        if(!this.nome.equals(novoCliente.nome))
            return false;

        return true;
    }

    public int hashCode(){
        if(this.nome == null)
            return 11;
        else
            return 11 + this.nome.hashCode();
    }
}
