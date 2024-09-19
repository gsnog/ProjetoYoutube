package com.mycompany.projetoyoutube;
public class Usuario extends Pessoa{
    private String login;
    private int totAssistido;
    
    //construtor

    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    
    //getters e setter

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Usuario: \n" + super.toString() + "\nlogin: " + login + "\n" + "totAssistido: " + totAssistido;
    }
    
    
    
}
