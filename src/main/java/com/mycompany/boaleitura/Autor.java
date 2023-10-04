/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boaleitura;

/**
 *
 * @author asafe
 */
public class Autor extends Pessoa implements Vendavel{
    int id;
    private String livro;
    private double precoLivro;
    
    public Autor(int id, String nome, String CPF, String endereco, String telefone) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    @Override
    public String getNome() {
        return "Autor" + super.getNome();
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public double getPreco() {
        return precoLivro;
    }

    @Override
    public String getDescricao() {
        return "Livro do autor " + nome + ": " + livro;
    }

    @Override
    public void setPreco(double preco) {
        this.precoLivro = preco;
    }
}