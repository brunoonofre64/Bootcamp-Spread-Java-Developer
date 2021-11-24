package com.estruturadedados;

public class NoTeste { 
	
	public static void main(String[] args) {
		
		ConceitoNo<String> no1 = new ConceitoNo<>("Conteudo no1");
		
		
		ConceitoNo<String> no2 = new ConceitoNo<>("Conteudo no2");
		no1.setProximoNo(no2);
		
		ConceitoNo<String> no3 = new ConceitoNo<>("Conteudo no3");
		no2.setProximoNo(no3);
		
		ConceitoNo<String> no4 = new ConceitoNo<>("Conteudo no4");
		no3.setProximoNo(no4);
		
		ConceitoNo<String>no5 = new ConceitoNo<>("Teste no5");
		no5.setConteudo("abcde");
		
		
		//no1 -> no2 -> no3 -> no4 -> null
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no2);
		
		System.out.println("----------------------------");
		
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
	
		System.out.println(no5.getConteudo());
		
		
		
		
		
		
		
		
		
		
	}

}
