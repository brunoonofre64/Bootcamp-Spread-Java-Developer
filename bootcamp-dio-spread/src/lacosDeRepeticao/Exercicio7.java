package lacosDeRepeticao;

public class Exercicio7 {
	
	//Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
       
	
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
