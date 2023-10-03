package com.mycompany.boaleitura;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.List;
import java.io.FileInputStream;

public class BoaLeitura {

    public static void main(String[] args) throws IOException,FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.println(":3");
        Path path_estoque = Paths.get("estoque.txt");
        try {
            List<String> linhas = Files.readAllLines(path_estoque);
        } catch (Exception e) {
            System.out.println("Sistema não foi capaz de acessar arquivo de estoque");
            e.printStackTrace();
        }
        finally {
            
        }
        ArrayList<Livro> estoque = new ArrayList<Livro>();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Livro> vendas = new ArrayList<Livro>();
        String choice;
        do {
        System.out.println("Prezado Usuário, qual opção deseja realizar?\n1 - Cadastrar Livro\n2 - Registrar uma Venda\n3 - Verificar histórico de vendas do dia(o array de vendas)\n4 - Verificar Estoque(array estoque)\n5 - Alugar um livro para um Cliente\n6 - Gravar Vendas na máquina\n7 - Encerrar o Sistema");
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
              Livro novoLivro = new Livro(bookName,id,author,editora);
              estoque.add(novoLivro);
              Livro livro = estoque.get(0);
              System.out.println("Título do Livro inserido: " + livro.getTitle());
          break;
          case "7":
              System.out.println("teste case 7");
              Files.writeString(path_estoque, "", StandardOpenOption.TRUNCATE_EXISTING);
          break;
          default:
            System.out.println("Insira um valor válido");
          break;
        }
      } while (!"7".equals(choice));


    }
}
