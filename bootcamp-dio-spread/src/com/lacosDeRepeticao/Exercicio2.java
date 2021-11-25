package com.lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio2 { 
	
	// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual 
	// ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
	
	
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
