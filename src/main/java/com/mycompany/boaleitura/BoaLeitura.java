package com.mycompany.boaleitura;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Iterator;

public class BoaLeitura {

    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println(":3");
        Path path_vendas = Paths.get("vendas.txt");
        Path path_estoque = Paths.get("estoque.txt");
        
        ArrayList<Livro> estoque = new ArrayList<Livro>();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Livro> vendas = new ArrayList<Livro>();
        String choice;
        
        List<String> lines = Files.readAllLines(path_estoque);
        for(String line : lines){
            String[] parts = line.split(",");
            if(parts.length == 4){
                String title = parts[0];
                int id = Integer.parseInt(parts[1]);
                String author = parts[2];
                String editora = parts[3];
                Livro livro = new Livro(title, id, author, editora);
                estoque.add(livro);
            } else {
                System.out.println("Pulando linha inválida: " + line);
            }
        }
        List<String> linesVenda = Files.readAllLines(path_vendas);
        for(String line : linesVenda){
            String[] parts = line.split(",");
            if(parts.length == 4){
                String title = parts[0];
                int id = Integer.parseInt(parts[1]);
                String author = parts[2];
                String editora = parts[3];
                Livro livro = new Livro(title, id, author, editora);
                vendas.add(livro);
            } else {
                System.out.println("Pulando linha inválida: " + line);
            }
        }
        
        
        do {
        System.out.println("\nPrezado Usuário, qual opção deseja realizar?\n1 - Cadastrar Livro\n2 - Registrar uma Venda\n3 - Verificar histórico de vendas do dia(o array de vendas)\n4 - Verificar Estoque(array estoque)\n5 - Limpar arquivo de vendas\n6 - Encerrar o Sistema");
        choice = scan.nextLine();
        switch (choice) {
          case "1":
              int id;
              System.out.println("Insira o nome do Livro a seguir: ");
              String bookName = scan.nextLine();
              System.out.println("Insira agora o nome do Autor: ");
              String author = scan.nextLine();
              System.out.println("Insira a Editora da edição do livro: ");
              String editora = scan.nextLine();
              if (estoque.isEmpty()) {
                id = 1;
              } else {
                id = estoque.size()+ 1;
                }
              Livro novoLivro = new Livro(bookName, id, author, editora);
              estoque.add(novoLivro);
              System.out.println("\nLivro cadastrado: " + novoLivro.getTitle());
          break;
          case "2":
                System.out.println("Qual livro deseja cadastrar a venda?");
                for (Livro estoqlivro : estoque) {
                    System.out.println(estoqlivro.getId() + "-" + estoqlivro.getTitle());
                }
                int sellBook = scan.nextInt();

                Iterator<Livro> iterator = estoque.iterator();
                while (iterator.hasNext()) {
                    Livro sorteado = iterator.next();
                    if (sorteado.getId() == sellBook) {
                        vendas.add(sorteado);
                        iterator.remove();
                    }
                }
          break;
          case "3": 
              System.out.println("Vendas realizadas no dia: ");
              for (Livro vendaslivro : vendas) {
                  System.out.println("Livro: " + vendaslivro.getTitle());
              }
          break;
          case "4":
              System.out.println("\nEstoque disponível:");
              for (Livro estoqlivro : estoque) {
                  System.out.println("Título do Livro: " + estoqlivro.getTitle());
              }
              System.out.println("\nQuantidade total do estoque: " + estoque.size());
          break;
          case "5":
              System.out.println("Limpando arquivo físico... ");
              Files.writeString(path_vendas, "", StandardOpenOption.TRUNCATE_EXISTING);
              
          break;
          case "6":
              System.out.println("\n\nEncerrando Programa...");
              try (OutputStream os = Files.newOutputStream(path_estoque)) {
                  for (Livro livro : estoque) {
                      String livroDetails = livro.getTitle() + "," + livro.getId() + "," + livro.getAutor() + "," + livro.getEditora();
                      os.write(livroDetails.getBytes());
                      os.write(System.lineSeparator().getBytes());
                  }
                  System.out.println("Estoque gravado com sucesso no arquivo!");
              }
              try (OutputStream os = Files.newOutputStream(path_vendas)) {
                  for (Livro livro : vendas) {
                      String livroDetails = livro.getTitle() + "," + livro.getId() + "," + livro.getAutor() + "," + livro.getEditora();
                      os.write(livroDetails.getBytes());
                      os.write(System.lineSeparator().getBytes());
                  }
                  System.out.println("Vendas gravadas com sucesso no arquivo!");
              }
          break;
          default:
              
          break;
        }
      } while (!"6".equals(choice));


    }
}
