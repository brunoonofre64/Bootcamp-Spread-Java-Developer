package com.lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2 { 
	
	// Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual 
	// ao nome do usu�rio, mostrando uma mensagem de erro e voltando a pedir as informa��es.
	
	
	public static void main(String[] args) {
		
	    String NAME = "";
		String SENHA = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		NAME = scan.next();
		
		System.out.println("Digite sua senha: " );
		SENHA = scan.next();
		
		
           while(SENHA.equalsIgnoreCase(NAME)) {
        	   
				if(SENHA.equalsIgnoreCase(NAME) && SENHA != null) {
					
			System.out.println("Erro,senha igual ao nome, digite a senha novamente:");
			    SENHA = scan.next();
		}
      }
		
           System.out.println("Dados salvos com sucesso!");
		scan.close();
		
		
	}

}
