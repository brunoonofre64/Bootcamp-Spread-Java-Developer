package arrays;

public class Exercicio1 { 
	
	public static void main(String[] args) {
		
		int[] vetor = {-5, -6, 15, 50, 8, 6};
		
		int count = 0;
		
		System.out.println("Vetor..");
		while(count < (vetor.length)) {
			System.out.println(vetor[count] + " ");
			count++;
	}
		
		
		System.out.println("\nVetor..");
		 for (int i = (vetor.length -1); i >= 0; i--) {
			 System.out.println(vetor[i] + " ");
		}
		
		
}
}
