package desafiosDeCodigo;

import java.util.Scanner;

public class Desafio1 { 
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int L = sc.nextInt();
			int C = sc.nextInt();
			if ((L % 2)     ==0)
				System.out.println(" 0  ");
			else                                               //complete o c�digo nos espa�os em branco
				System.out.println(" 1  ");
			sc.close();
		}
	}


