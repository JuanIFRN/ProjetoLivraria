/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.erica.teste;

import br.ifrn.edu.erica.controller.CadastroAcervo;
import br.ifrn.edu.erica.dominio.Acervo;
import br.ifrn.edu.erica.dominio.CapaComum;
import br.ifrn.edu.erica.dominio.Ebook;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Erica
 */
public class ClasseTeste {
   
    public static void exibirMenu(){
            System.out.println("***** LIVRARIA *****");
            System.out.println("1 - Cadastrar Livro (Capa comum)");
            System.out.println("2 - Cadastrar Ebook");
            System.out.println("3 - Listar todos os livros");
            System.out.println("4 - Pesquisar por gênero");
            System.out.println("5 - Excluir Livro");
            System.out.println("6 - Sair");
            System.out.println("***** Selecione a opção desejada: ");
        }     
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        
       
        int menu;
       
        Acervo objLivro;
        
        String titulo, autor, genero, isbn, asin;
        float preco;
        int tamanho, paginas;
        String caminho = "arquivo.txt";
        
        do{
          exibirMenu(); 
          try{
          menu = entrada.nextInt();
          
          switch(menu){
              
                case 1:
                    System.out.println("***** Cadastrar Capa Comum");
                    System.out.println("Informe o título: ");
                    titulo = entradaString.nextLine();
                    System.out.println("Informe o autor: ");
                    autor = entradaString.nextLine();
                    System.out.println("Informe o gênero: ");
                    genero = entradaString.nextLine();
                    System.out.println("Informe o preço: ");
                    preco = entrada.nextFloat();
                    System.out.println("Informe o ISBN: ");
                    isbn = entradaString.nextLine();
                    System.out.println("Número de páginas: ");
                    paginas = entrada.nextInt();
                    
                    objLivro = new CapaComum(titulo, autor, genero, preco, isbn, paginas);
                    
                   
                    CadastroAcervo.adicionarLivro(objLivro);
                   
                  break;
                case 2:
                    System.out.println("**** Cadastrar Ebook");
                    System.out.println("Informe o título: ");
                    titulo = entradaString.nextLine();
                    System.out.println("Informe o autor: ");
                    autor = entradaString.nextLine();
                    System.out.println("Informe o gênero: ");
                    genero = entradaString.nextLine();
                    System.out.println("Informe o preço: ");
                    preco = entrada.nextFloat();
                    System.out.println("Informe o ASIN: ");
                    asin = entradaString.nextLine();
                    System.out.println("Tamanho do arquivo: ");
                    tamanho = entrada.nextInt();
                   
                    objLivro = new Ebook(titulo, autor, genero, preco, asin, tamanho);
                    
                    CadastroAcervo.adicionarLivro(objLivro);
                  break;
                case 3:
                    System.out.println("**** Listagem de Livros");
                    CadastroAcervo.imprimirAcervo();
                    
                    break;
                case 4:
                    System.out.println("*** Pesquisar por gênero");
                    System.out.println("Informe o gênero desejado: ");
                    genero = entradaString.nextLine();
                    System.out.println("Resultados para o gênero " + genero + ": ");
                    CadastroAcervo.pesquisarGenero(genero);
                    
                  break;
                case 5:
                    try{
                    CadastroAcervo.removerLivro();
                    }catch(InputMismatchException e){
                        System.out.println("Insira apenas o número do índice que deseja excluir");
                    }
                  break;
                case 6:
                    System.out.println("Programa encerrado!");
                    
                  break;
                  
                default:
                    System.out.println("A opção selecionada é inválida.");
          }
        }catch(InputMismatchException e){
              System.out.println("Insira apenas números!");
              break;
        }
            
        }while(menu != 6);
        
        
    }
      
}

