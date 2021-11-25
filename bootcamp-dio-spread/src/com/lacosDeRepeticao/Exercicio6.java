package com.lacosDeRepeticao;

public class Exercicio6 {
	
//	    Faça um programa que imprima na tela os números de 1 a 20, um abaixo do 
//		outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
	
	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(" " + nums1[i]);
		}
		
		System.out.println();
		int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		
	}
}
