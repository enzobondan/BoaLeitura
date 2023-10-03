package com.mycompany.boaleitura;
public class Livro {

    public String title;
    private int id;
    public String autor;
    public String editora;
    protected Boolean Alugado;
    protected Object clienteDevedor;

    public Livro(String title, int id, String autor, String editora) {
        this.title = title;
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

    public Boolean getAlugado() {
        return Alugado;
    }

    public void setAlugado(Boolean Alugado) {
        this.Alugado = Alugado;
    }

    public Object getClienteDevedor() {
        return clienteDevedor;
    }

    public void setClienteDevedor(Object clienteDevedor) {
        this.clienteDevedor = clienteDevedor;
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

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    public Boolean getAlugado() {
        return Alugado;
    }

    public void setAlugado(Boolean Alugado) {
        this.Alugado = Alugado;
    }

    public Object getClienteDevedor() {
        return clienteDevedor;
    }

    public void setClienteDevedor(Object clienteDevedor) {
        this.clienteDevedor = clienteDevedor;
    }
}
