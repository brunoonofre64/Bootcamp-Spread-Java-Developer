package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	
//	Altere o programa anterior permitindo ao usuário informar as populações 
//	e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.
//	
    
public static void main(String[] args) {
	
		
		int habitantesBrasil;
		int habitantesChile;
		int paisQueCresceuMais = 0;
		
		double pibBrasil;
		double pibChile;
		
		
		Scanner scan = new Scanner(System.in);
	//Brasil
		System.out.println("Digite a quantidade de habitantes do Brasil");
		habitantesBrasil = scan.nextInt();
		
		System.out.println("Digite o PIB do Brasil anual.");
		pibBrasil = scan.nextDouble(); 
		
	//Chile
		System.out.println("Digite a quantidade de habitantes do Chile.");
		habitantesChile = scan.nextInt();
		
		System.out.println("Digite o PIB do Chile anual.");
		pibChile = scan.nextDouble();
		
		
		double crescimentoBrasilPopulacional = (habitantesBrasil * pibBrasil) / 100;
		double crescimentoChilePopulacional = (habitantesChile * pibChile) / 100;
		
	
			//Se o Chile for maior
			if(habitantesChile > habitantesBrasil) {
				
				while(habitantesBrasil <= habitantesChile) {
					habitantesBrasil += crescimentoBrasilPopulacional;
					paisQueCresceuMais++;
				} 
				System.out.println("Faltam " + paisQueCresceuMais + 
						" anos para que o Brasil ultrapasse ou iguale ao Chile em habitantes.");
        	}    
		
			if(habitantesBrasil > habitantesChile) {
				
				while(habitantesChile <= habitantesBrasil) {
					habitantesChile += crescimentoChilePopulacional;
					paisQueCresceuMais++;
				}
				System.out.println("Faltam " + paisQueCresceuMais + 
						" anos para que o Chile ultrapasse ou iguale ao Brasil em habitantes.");
				
			}
			
			
		
		scan.close();
		}
	}	


