package controleDeFluxo;

import java.util.Scanner;

public class condicionaisSwitch {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int diaSemana;
		String diaSemanaNome = "";
		
		System.out.println("Digite um n�mero de 1 a 7 que representa a semana.");
		diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 1:
			diaSemanaNome = "Domingo";
			break;
		case 2:
			diaSemanaNome = "Segunda-feira";
			break;
		case 3:
			diaSemanaNome = "Ter�a-feira";
			break;
		case 4:
			diaSemanaNome = "Quarta-feira";
			break;
		case 5:
			diaSemanaNome = "Quinta-feira";
			break;
		case 6:
			diaSemanaNome = "Sexta-feria";
			break;
		case 7:
			diaSemanaNome = "Sab�do";
			break;
		default: 
			diaSemanaNome = "N�mero inv�lido";
		} 
		
		System.out.println("Voc� escolheu " + diaSemanaNome);
		
		
		scan.close();
	}

}
