package com.mycompany.boaleitura;

import java.util.List;

public class Livro implements Vendavel {

    public String title;
    private int id;
    public String autor;
    public String editora;
    private double preco;

    public Livro(String title, int id, String autor, String editora) {
        this.title = title;
        this.autor = autor;
        this.id = id;
        this.editora = editora;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Livro: " + title + " por " + autor;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}