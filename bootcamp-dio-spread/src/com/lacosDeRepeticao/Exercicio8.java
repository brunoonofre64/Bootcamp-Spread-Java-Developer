package com.lacosDeRepeticao;

public class Exercicio8 { 
	
	//Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.
	
	public static void main(String[] args) {
		
		int[] nums = {12, 20, 14, 33, 43};
		
		int contador = 0;
		int total = 0;
		
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
			contador++;
		}
		
		double media = total / contador;
		
		System.out.printf("A m�dia ficou = %.1f ", media);
		
		
	}
}
