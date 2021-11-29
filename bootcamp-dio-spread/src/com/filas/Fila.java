package com.filas;

public class Fila<T> { 
	
	private No<T> refeNoEntradaFila;

	public Fila() {
		this.refeNoEntradaFila = null;
	}
	
	
	public void enqueue(T object) {
		No<T> novoNo = new No<>(object);
		novoNo.setRefeNo(refeNoEntradaFila);
		refeNoEntradaFila = novoNo;
	}
	
	
	public T first() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refeNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefeNo() != null){
				  primeiroNo = primeiroNo.getRefeNo();	
				}else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	
	public T dequeue() {
		if(!this.isEmpty()) {
			No<T> primeiroNo = refeNoEntradaFila;
			No<T> noAuxiliar = refeNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefeNo() != null){
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefeNo();	
				}else {
					noAuxiliar.setRefeNo(null);
					break;
				}
			}
			return (T)primeiroNo.getObject();
		}
		return null;
	}
	
	
	public boolean isEmpty() {
		return refeNoEntradaFila == null ? true : false;
	}


	@Override
	public String toString() {
		String stringRetorno = "";
		No<T> noAuxiliar = refeNoEntradaFila;
		
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
