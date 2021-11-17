package desafiosDeCodigo;

import java.util.Locale;
import java.util.Scanner;

public class MacPRONALTS { 
	
//	O MacPRONALTS est� com uma super promo��o, exclusivo para os competidores da primeira Seletiva do MaratonaTEC. S� que teve um problema, 
//	todos os maratonistas foram tentar comprar ao mesmo tempo, com isso gerou uma fila muito grande. O pior � que a mo�a do caixa estava sem 
//	calculadora ou um programa para ajud�-la a calcular com maior agilidade, eis que surge voc� para fazer um programa para ajudar a coitada e 
//	aumentar a renda do MacPRONALTS. Segue o card�pio do dia contendo o n�mero do produto e seu respectivo valor.
//	
//	1001 | R$ 1.50
//	1002 | R$ 2.50
//	1003 | R$ 3.50
//	1004 | R$ 4.50
//	1005 | R$ 5.50
//
//	Entrada
//	A primeira entrada informada � a quantidade de produtos comprados (1 <= p <= 5). Para cada produto segue a quantidade (1 <= q <= 500) que o consumidor comprou.
//
//	Obs.: n�o poder�o ser informados n�meros de produtos repetidos.
//
//	Sa�da
//	Voc� deve imprimir o valor da compra com duas casas decimais.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
		int qtdProduto, qtdComprada, produto;
		double valor , total;
		
		valor = 0;
		total = 0;
		
		
		qtdProduto = scan.nextInt();
		while(qtdProduto-- > 0) {
			qtdComprada = 0;
			
			produto = scan.nextInt();
			qtdComprada = scan.nextInt();
			
			if(produto == 1001) {
				valor = 1.50;
			} else if(produto == 1002) {
				valor = 2.50;
			} else if(produto == 1003) {
				valor = 3.50;
		    } else if(produto == 1004) {
		    	valor = 4.50;
		    } else if(produto == 1005) {
		    	valor = 5.50;
		    }
			
			total +=  valor * qtdComprada;
		}
		
		System.out.printf("%.2f\n", total);
		scan.close();
		}
		
	}


