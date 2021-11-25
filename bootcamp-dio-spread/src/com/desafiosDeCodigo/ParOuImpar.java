package com.desafiosDeCodigo;

import java.util.Scanner;

public class ParOuImpar { 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n, x = 0;
		n = scan.nextInt();
		String par = "EVEN";
		String impar = "ODD";
		
		for(int i = 0; i < n; i++) {
			x = scan.nextInt();
			
           if(x % 2 == 0 && x > 0) {
        	   System.out.println(par + " POSITIVE");
           } else if(x % 2 != 0 && x > 0) {
        	   System.out.println(impar + " POSITIVE");
           } else if(x % 2 == 0 && x < 0) {
        	   System.out.println(par + " NEGATIVE");
           } else if(x % 2 != 0 && x < 0) {
        	   System.out.println(impar + " NEGATIVE");
           } else if(x == 0) {
        	   System.out.println("NULL");
           }
		}
		
		scan.close();
	}
}
