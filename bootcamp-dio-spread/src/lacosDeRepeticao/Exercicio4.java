package lacosDeRepeticao;

public class Exercicio4 {
	
//	Supondo que a população de um país A seja da ordem de 80000 habitantes com
//	uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes 
//	com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número 
//	de anos necessários para que a população do país A ultrapasse ou iguale a população do
//		país B, mantidas as taxas de crescimento.

	
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