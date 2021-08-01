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
public abstract class Acervo implements Serializable {
    
    private String titulo;
    private String autor;
    private String genero;
    private float preco;
    
    public Acervo(String titulo, String autor, String genero, float preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.preco = preco;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public abstract void imprimirMensagem();

    @Override
    public String toString() {
        return "\nTítulo = " + titulo + ", Autor = " + autor + ", Gênero = " + genero 
                + ", Preço = " + preco;
    }
}
