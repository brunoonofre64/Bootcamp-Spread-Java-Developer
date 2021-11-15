package arrays;

import java.util.Random;

public class Exercicio2 {
	
//	programa que leia 20 num inteiro aleatorio,
//	armazernar em um vetor
//	e no final mostre os num e seus sucessores.

	public static void main(String[] args) {
		
		Random random = new Random();		
		
		int[] nums = new int[20];
			
		for(int i = 0; i < (nums.length -1); i++) {
             System.out.println(nums[i] = random.nextInt(100)); 		
             System.out.println("Sucessor -> " + (nums[i] + 1));
  }
		

		
		
		
		
		
		
		
		
		}
}
