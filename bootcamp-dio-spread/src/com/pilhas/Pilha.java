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
	
	@Override
	public String toString() {
		String stringRetorno = "--------------\n";
		stringRetorno += "       Pilha\n";
		stringRetorno += "--------------\n";
		
		No noAuxiliar = refeNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefeNo();
			} else {
				break;
			}
		}
		stringRetorno += "================\n";
		return stringRetorno;
	}
	

}
