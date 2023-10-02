/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boaleitura;

/**
 *
 * @author asafe
 */
public class Funcionario extends Pessoa {
    private int id;
    private String funcao;
    public String dataContratacao;
    
    public Funcionario(String nome, String CPF, int id, String endereco, String telefone, String funcao, String dataContratacao) {
        this.nome = nome;
        this.CPF = CPF;
        this.id = id;
        this.endereco = endereco;
        this.telefone = telefone;
        this.funcao = funcao;
        this.dataContratacao = dataContratacao;
    }
    public int getId() {
        return id;
    }
    public String getFuncao() {
        return funcao;
    }
    public String getDataContratacao() {
        return dataContratacao;
    }
}
