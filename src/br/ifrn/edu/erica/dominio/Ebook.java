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
public class Ebook extends Acervo implements Serializable {
    
    String asin;
    int tamanho;
    
    public Ebook(String titulo, String autor, String genero, float preco, String asin, int tamanho) {
        super(titulo, autor, genero, preco);
        this.asin = asin;
        this.tamanho = tamanho;
    }
    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin;
    }

    public int getTamanho() {
        return tamanho;
    }

    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString() {
        String toStringEbook = "Ebook: ";
        toStringEbook += super.toString();
	toStringEbook += ", ASIN: " + asin + 
                ", Tamanho: " + tamanho + " KB" ;
	
        return toStringEbook;
    }
    
    @Override
    public void imprimirMensagem() {
        System.out.println("Ebook cadastrado com sucesso!");
        
    }
    
    
}
