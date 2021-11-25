package com.lacosDeRepeticao;

public class Exercicio8 { 
	
	//Faça um programa que leia 5 números e informe a soma e a média dos números.
	
	public static void main(String[] args) {
		
		int[] nums = {12, 20, 14, 33, 43};
		
		int contador = 0;
		int total = 0;
		
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
			contador++;
		}
		
		double media = total / contador;
		
		System.out.printf("A média ficou = %.1f ", media);
		
		
	}
}
