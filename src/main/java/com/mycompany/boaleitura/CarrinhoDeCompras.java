/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.boaleitura;
import java.util.List;

/**
 *
 * @author asafe
 */
public interface CarrinhoDeCompras {
    void adicionarAoCarrinho(Livro livro);
    void removerDoCarrinho(Livro livro);
    List<Livro> listarItensNoCarrinho();
    double calcularTotal();
    void finalizarCompra(Cliente cliente);
}
