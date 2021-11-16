package desafiosDeCodigo;

import java.util.Scanner;

public class Desafio2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int graoInicial = 1;
		int somatorio = 1;
		
		int n = sc.nextInt();
		for(int i=1 ; i < n ; i++) {
			graoInicial = graoInicial * 2;
			somatorio += graoInicial;
		}
		System.out.printf("%d\n", somatorio);   //Complete o código aqui.
		sc.close();
	}

}
