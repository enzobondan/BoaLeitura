/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boaleitura;

/**
 *
 * @author asafe
 */
public class Cliente extends Pessoa {
    private int id;
    
    public Cliente(String nome, String CPF, int id, String endereco, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getCliente() {
        return nome;
    }
    
    public String getCpf() {
        return CPF; 
    }
    
    public int getId() {
        return id;
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
