package com.pilhas;

public class No {
	
	 private int dado;
	 private No refeNo = null;
	 
	 
	public No() {
	}	
	
	public No(int dado) {
		this.dado = dado; 
	}
	 
	public int getDado() {
		return dado;
	}
	
	public void setDado(int dado) {
		this.dado = dado;
	}
	
	public No getRefeNo() {
		return refeNo;
	}
	
	public void setRefeNo(No refeNo) {
		this.refeNo = refeNo;
	}

	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}
	 
	
	 
	 
	 

}
