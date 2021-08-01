/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifrn.edu.erica.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Erica
 */
public class FileUtil {
   public static boolean gravarObjeto(Object obj, String caminho) {
		File arquivo = new File(caminho);
		
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}
		
		try {
			//abrir conexão
			FileOutputStream fileOutputStream = new FileOutputStream(arquivo);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOutputStream);
			
			// escrevendo no arquivo
			objectOut.writeObject(obj);
			
			
			objectOut.flush();
			fileOutputStream.flush();
			
			objectOut.close();
			fileOutputStream.close();
			
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Este método retorna um objeto/lista de informações gravadas no arquivo.
	 * 
	 * @param caminho
	 * @return
	 */
	public static Object recuperarObjeto(String caminho) {
		File arquivo = new  File(caminho);
		try {
			FileInputStream fileInput = new FileInputStream(arquivo);
			ObjectInputStream objetoInput = new ObjectInputStream(fileInput);
			
			Object returno = objetoInput.readObject();
			
			objetoInput.close();
			fileInput.close();
			
			return returno;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}

