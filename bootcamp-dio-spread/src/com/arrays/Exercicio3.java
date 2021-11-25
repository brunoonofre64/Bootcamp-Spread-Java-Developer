package com.arrays;

import java.util.Random;

public class Exercicio3 {
	
	// fazer matriz 4x4 num aleatorio de 0 a 9
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		
		Random random = new Random();
		
		System.out.println("Matriz multidimensional...");
		
		for(int i = 0; i < matriz.length; i++) {
 			for(int j = 0; j < matriz[i].length; j++) {
 				int coluna = matriz[i][j] = random.nextInt(9);
				System.out.print(coluna + " ");
			}
 			System.out.println();
		}
	
		System.out.println("\nAgora usando o foreach.....");
		for(int[] linha : matriz) {
			for(int coluna : linha) {
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
		
	}
}
