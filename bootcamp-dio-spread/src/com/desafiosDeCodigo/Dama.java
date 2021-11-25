package com.desafiosDeCodigo;

import java.util.Scanner;

public class Dama {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
	        //se estiver em qualquer outra posi��o, a rainha gastar� 2 movimentos!

	        while (true) {
	           int x1 = sc.nextInt();
	           int y1 = sc.nextInt();
	           int x2 = sc.nextInt();
	           int y2 = sc.nextInt();
	            if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break;
	            if (x1 == x2 && y1 == y2)
	                System.out.println("0");
	            else if (x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2))
	                System.out.println("1");
	            else
	                System.out.println("2");
	            
	           
	        }
	        sc.close();
	}
}
