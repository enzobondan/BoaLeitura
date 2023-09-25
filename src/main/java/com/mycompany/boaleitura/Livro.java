package com.mycompany.boaleitura;
public class Livro {

    String title;
    int id;
    String autor;
    String editora;
    int qntd;
    Boolean Alugado;
    Object clienteDevedor;

    public Livro(String title, int id, String autor, String editora, int qntd) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.editora = editora;
        this.qntd = qntd;
    }

}
