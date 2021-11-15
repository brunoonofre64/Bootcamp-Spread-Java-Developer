package lacosDeRepeticao;

public class Exercicio7 {
	
	//Faça um programa que leia 5 números e informe o maior número.
       
	
	public static void main(String[] args) {
		
		int[] nums = {22, 42, 55, 2, 11};
		
		int maior = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] >= maior) {
				maior = nums[i];
			}
		}
		
		System.out.println(maior);
	}
}
