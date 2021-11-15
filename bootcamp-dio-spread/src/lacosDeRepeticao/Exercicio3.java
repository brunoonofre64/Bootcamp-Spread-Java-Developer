package lacosDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {
//	
//    Faça um programa que leia e valide as seguintes informações:
//	Nome: maior que 3 caracteres;
//	Idade: entre 0 e 150;
//	Salário: maior que zero;
//	Sexo: 'f' ou 'm';
//	Estado Civil: 's', 'c', 'v', 'd';
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		char sexo;
		char estadoCivil;
		String estadoCivilString = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = scan.next();
		
		while(nome.length() < 3) {
			System.out.println("Minímo de letras aceitas = 3");
			nome = scan.next();
		}
		
		
		System.out.println("Digite a sua idade:");
		idade = scan.nextInt();
		
		while(idade < 0 || idade > 150) {
			System.out.println("Idade inválida, digite novamente:");
			idade = scan.nextInt();
		}
		
		
		System.out.println("Qual o seu sexo? 'M' ou 'F' .");
		sexo = scan.next().charAt(0);
		
		// condicional para ignorar o case.
		if(sexo == 'M' || sexo ==  'm') {
			sexo = 'M';
		} else if(sexo == 'F' || sexo == 'f') {
			sexo = 'F';
		}
		
		while(sexo != 'F' && sexo != 'M') {
			
			System.out.println("Sexo inválido digite novamente.");
			sexo = scan.next().charAt(0);
		}
		
		
		System.out.println("Digite a inicial do seu estado cívil ('s', 'c', 'v', 'd')");
		estadoCivil = scan.next().charAt(0);
		
		// condicional para ignorar o case.
		if(estadoCivil == 'S' || estadoCivil ==  's') {
			estadoCivil = 'S';
		} else if(estadoCivil == 'C' || estadoCivil == 'c') {
			estadoCivil = 'C';
		} else if(estadoCivil == 'V' || estadoCivil == 'v') {
			estadoCivil = 'V';
		} else if(estadoCivil == 'D' || estadoCivil == 'd') {
			estadoCivil = 'D';
		}	
		
		// não ficou nada abstrato, irei pensar em algo para refatorar e melhorar.
		while(estadoCivil != 'S' && estadoCivil != 'C' 
				&& estadoCivil != 'V' && estadoCivil != 'D') {
			
			System.out.println("Letra inválida, digite novamente:");
			estadoCivil = scan.next().charAt(0);
		} 
		
		// formatei a impressão do estadoCivil melhor legibilidade para o usuário
		if(estadoCivil == 'S') {
			estadoCivilString = "Solteiro(a)";
		} else if(estadoCivil == 'C') {
			estadoCivilString = "Casado(a)";
		} else if(estadoCivil == 'V') {
			estadoCivilString = "Viuvo(a)";
		} else if(estadoCivil == 'D') {
			estadoCivilString = "Divorciado(a)";
		}
		
		
		System.out.println(nome + " tem " + idade + " anos e de" + " sexo " + sexo
				+ " atualmente é um cidadão(a) " + estadoCivilString);
		
		scan.close();
		
	}

}
