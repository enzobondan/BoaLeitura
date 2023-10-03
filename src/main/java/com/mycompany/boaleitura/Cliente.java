/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boaleitura;

import java.util.List;

/**
 *
 * @author asafe
 */
public class Cliente extends Pessoa implements CarrinhoDeCompras {
    private int id;
   
    public Cliente(String nome, String CPF, int id, String endereco, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
