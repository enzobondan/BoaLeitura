package com.mycompany.boaleitura;
public class Livro {

    public String title;
    private int id;
    public String autor;
    public String editora;
    private int qntd;
    protected Boolean Alugado;
    protected Object clienteDevedor;

    public Livro(String title, int id, String autor, String editora, int qntd) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.editora = editora;
        this.qntd = qntd;
    }

}
