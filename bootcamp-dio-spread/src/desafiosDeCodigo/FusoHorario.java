package desafiosDeCodigo;

import java.util.Scanner;

public class FusoHorario {
	

	public static void main(String[] args) {
		
		int saida, tempo, fuso, hora;
		
		Scanner scan = new Scanner(System.in);
		
		
		saida = scan.nextInt();
		tempo = scan.nextInt();
		fuso = scan.nextInt();
		
		hora = saida + tempo + fuso;
		   if(hora >= 24) {
			   hora -= 24;
		   } else if(hora < 24 && hora > 12) {
			   hora = hora;
		   } else {
			   hora += 24;
		   }
		   
		   System.out.println(hora);
		
		scan.close();
		
	}

}
