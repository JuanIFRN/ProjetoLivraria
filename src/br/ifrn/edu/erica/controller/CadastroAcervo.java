/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.erica.controller;

import br.ifrn.edu.erica.dominio.Acervo;
import br.ifrn.edu.erica.io.FileUtil;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Erica
 */
public class CadastroAcervo {
    
    private static ArrayList<Acervo> lista = new ArrayList<Acervo>();
    
    public static void adicionarLivro(Acervo livro) {
        String caminho = "arquivo.txt";
        lista = (ArrayList<Acervo>) FileUtil.recuperarObjeto(caminho);
        lista.add(livro);
        boolean gravou = FileUtil.gravarObjeto(lista, caminho);
        System.out.println(gravou);         
    }

    
    public static void imprimirAcervo() {
        lista = (ArrayList<Acervo>)FileUtil.recuperarObjeto("arquivo.txt");
       
        for(Acervo livro : lista){
            System.out.println(livro);
        }
    }
    
    public static int pesquisarGenero(String genero) {
        lista = (ArrayList<Acervo>) FileUtil.recuperarObjeto("arquivo.txt");
        int qtd = 0;
        for(Acervo livro : lista){
            if(livro.getGenero().equalsIgnoreCase(genero)){
                qtd++;
                System.out.println("Livro: " + qtd);
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Título: " +livro.getTitulo());
            }
        }    
        return qtd;
    }
    
    public static void removerLivro(){
            try{
                lista = (ArrayList<Acervo>) FileUtil.recuperarObjeto("arquivo.txt");
		int indice = 0;
		for(Acervo livro : lista) {
			System.out.println("Indice: " + indice);
			System.out.println(livro);
			System.out.println("***********************************");
			indice++;
		}	
		System.out.println("Digite a posição do item que deseja deletar: ");
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		
		lista.remove(opcao);
		
		FileUtil.gravarObjeto(lista, "arquivo.txt");
            }catch(IndexOutOfBoundsException e){
                System.out.println("O arquivo está vazio ou a posição inserida é invalida. Tente novamente!");
            }
		
    }
   
}
