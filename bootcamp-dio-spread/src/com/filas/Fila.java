package com.filas;

public class Fila { 
	
	private No refeNoEntradaFila;

	public Fila() {
		this.refeNoEntradaFila = null;
	}
	
	
	public void enqueue(No novoNo) {
		novoNo.setRefeNo(refeNoEntradaFila);
		refeNoEntradaFila = novoNo;
	}
	
	
	public No first() {
		if(!this.isEmpty()) {
			No primeiroNo = refeNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefeNo() != null){
				  primeiroNo = primeiroNo.getRefeNo();	
				}else {
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}
	
	
	public No dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refeNoEntradaFila;
			No noAuxiliar = refeNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefeNo() != null){
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefeNo();	
				}else {
					noAuxiliar.setRefeNo(null);
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}
	
	
	public boolean isEmpty() {
		return refeNoEntradaFila == null ? true : false;
	}


	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refeNoEntradaFila;
		
		if(refeNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No[objeto=" 
			     + noAuxiliar.getObject() + " }] ------->";
				
				if(noAuxiliar.getRefeNo() != null) {
					noAuxiliar = noAuxiliar.getRefeNo();
				} else {
					stringRetorno += "null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		return stringRetorno;
	} 
	
	
	
	

}
