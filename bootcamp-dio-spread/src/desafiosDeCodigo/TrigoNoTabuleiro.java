package desafiosDeCodigo;

import java.util.Scanner;

//Uma rainha requisitou os servi�os de um monge e disse-lhe que
//pagaria qualquer pre�o. O monge, necessitando de alimentos,
//perguntou a rainha se o pagamento poderia ser feito em
//gr�os de trigo dispostos em um tabuleiro de damas, de forma que o
//primeiro quadrado tivesse apenas um gr�o, e os quadrados
//subseq�entes, o dobro do quadrado anterior. A rainha considerou o
//pagamento barato e pediu que o servi�o fosse executado, por�m,
//um dos cavaleiros que estava presente e entendia um pouco de
//matem�tica alertou-a que seria imposs�vel executar o pagamento,
//pois a quantidade de gr�o seria muito alta. Curiosa, a rainha
//solicitou ent�o a este cavaleiro que era bom em c�lculo, que fizesse
//um programa que recebesse como entrada o n�mero de quadrados a serem
//usados em um tabuleiro de damas e apresentasse a quantidade de kg de
//trigo correspondente, sabendo que cada 12 gr�os do cereal correspondem a
//uma grama. Finalmente, o c�lculo da quantidade dever� caber em um valor
//inteiro de 64 bits sem sinal.

public class TrigoNoTabuleiro {
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt(), x;
	        double qtd;
	        
	        while(n-- > 0) {
	        	x = scan.nextInt();
	        	qtd = 1;
	        	
	        	for(int i = 0; i < x; i++) 
	        		qtd *= 2;
	        	
	        		qtd = Math.floor((qtd / 12) / 1000);
	        		System.out.printf("%.0f kg\n", qtd);
	        }
	     }   
  }


