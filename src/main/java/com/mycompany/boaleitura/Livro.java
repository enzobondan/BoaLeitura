package com.mycompany.boaleitura;

import java.util.List;

public class Livro {

    public String title;
    private int id;
    public String autor;
    public String editora;

    public Livro(String title, int id, String autor, String editora) {
        this.title = title;
        this.id = id;
        this.autor = autor;
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
}
