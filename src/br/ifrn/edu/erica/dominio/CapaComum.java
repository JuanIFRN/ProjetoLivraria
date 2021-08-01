/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.erica.dominio;

import java.io.Serializable;

/**
 *
 * @author Erica
 */
public class CapaComum extends Acervo implements Serializable {
    
    String isbn;
    int paginas;
       
    public CapaComum(String titulo, String autor, String genero, float preco, String isbn, int paginas) {
        super(titulo, autor, genero, preco);
        this.isbn = isbn;
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    @Override
    public String toString() {
        String toStringLivro = "Livro(Capa comum): ";
        toStringLivro += super.toString();
	toStringLivro += ", ISBN: " + isbn
                + ", Número de páginas: " + paginas;
	
        return toStringLivro;
    }
    
    public void imprimirMensagem() {
        System.out.println("Livro(Capa comum) cadastrado com sucesso!");
    }
    
    
    
}
