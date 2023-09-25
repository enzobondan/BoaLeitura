package com.mycompany.boaleitura;
import java.util.Scanner;

public class BoaLeitura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(":3");
        Object[] vendas;
        Object[] estoque;
        String choice = "";
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
              System.out.println(String.format("Insira por fim quantos livros do título '%s' Deseja adicionar em estoque", bookName));
              int qntd = scan.nextInt();
              if (estoque.length == 0) {
                id = 1;
              } else {
                for (int i = 0; i < estoque.length; i++) {
                  if (estoque[i].title.equals(bookName)) {
                    id = estoque[i].id;
                  }
                }
              }
              
                return id;
              }
            break;
        
          default:
            break;
        }
      } while (!choice.equals("7"));


    }
}
