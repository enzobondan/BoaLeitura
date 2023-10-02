/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boaleitura;

/**
 *
 * @author asafe
 */
public abstract class Pessoa {
    String nome;
    String endereco;
    String telefone;
    String CPF;
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return CPF; 
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome + "CPF: " + CPF + "Endereço: " + endereco + "Telefone: " + telefone;
    }
}
