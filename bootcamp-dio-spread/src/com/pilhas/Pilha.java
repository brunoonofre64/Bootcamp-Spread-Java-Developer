package com.pilhas;

public class Pilha {
	
	private No referenciaNoEntradaPilha;
	
	public Pilha() {
		this.referenciaNoEntradaPilha = null;
	}
	
	
	public void push(No novoNo) {
		No referenciaAuxiliar = referenciaNoEntradaPilha;
		this.referenciaNoEntradaPilha = novoNo;
		novoNo.setRefeNo(referenciaAuxiliar);
	}
	
	public boolean isEmpty() {
		return referenciaNoEntradaPilha == null ? true : false;
	}
	
	
	public No pop() {
		if(this.isEmpty()) {
			No noPoped = referenciaNoEntradaPilha;
			referenciaNoEntradaPilha = referenciaNoEntradaPilha.getRefeNo();
			return noPoped;
		}
		return null;
	}
	
	public No top() {
		return referenciaNoEntradaPilha;
	}
	
	
	@Override
	public String toString() {
		String stringRetorno = "--------------\n";
		stringRetorno += "       Pilha\n";
		stringRetorno += "--------------\n";
		
		No noAuxiliar = referenciaNoEntradaPilha;
		
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
