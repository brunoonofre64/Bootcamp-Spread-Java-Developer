package com.lacosDeRepeticao;

public class Exercicio9 {

//	Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50.

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			if(i % 2 != 0) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 50; i++) {
			if(i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
		
	}
}
