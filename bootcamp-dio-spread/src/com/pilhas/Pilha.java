package com.pilhas;

public class Pilha {
	
	private No refeNoEntradaPilha;
	
	public Pilha() {
		this.refeNoEntradaPilha = null;
	}
	
	
	
    public void push(No novoNo) {
    	No refeAuxiliar = refeNoEntradaPilha;
    	this.refeNoEntradaPilha = novoNo;
    	novoNo.setRefeNo(refeAuxiliar);
    }
    
    
    public No pop() {
    	if(!this.isEmpty()) {
    		No noPoped = refeNoEntradaPilha;
    		refeNoEntradaPilha = refeNoEntradaPilha.getRefeNo();
    		return noPoped;
    	}
    	return null;
    }
    
	
	public No top() {
		return refeNoEntradaPilha;
	}
	
	
	public boolean isEmpty() { 
		if(refeNoEntradaPilha == null) {
			return true;
		}
		return false;
	}
	// ou usar o ternário no lugar o if ex: 
	// return refeNoEntradaPilha == null? true : false;
	

}
