package lacosDeRepeticao;

public class Exercicio4 {
	
//	Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com
//	uma taxa anual de crescimento de 3% e que a popula��o de B seja 200000 habitantes 
//	com uma taxa de crescimento de 1.5%. Fa�a um programa que calcule e escreva o n�mero 
//	de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a popula��o do
//		pa�s B, mantidas as taxas de crescimento.

	
	public static void main(String[] args) {
		
		int habitantesBrasil = 200000;
		int habitantesChile = 80000;
		int crescimentoChileAnual = 0;
		
		double pibBrasil = 1.5;
		double pibChile = 3.0;
		
		double crescimentoChilePopulacional = (habitantesChile * pibChile) / 100;
		
		while(habitantesChile <= habitantesBrasil) {
			habitantesChile += crescimentoChilePopulacional;
			crescimentoChileAnual++;
	}
		
		System.out.println("Faltam " + crescimentoChileAnual + 
				" anos para que o Chile ultrapasse ou iguale ao Brasil em habitantes.");
		
		
	}
}