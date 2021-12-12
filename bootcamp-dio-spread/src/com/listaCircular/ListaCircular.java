package com.listaCircular;

public class ListaCircular<T> {
	
	private No<T> cabeca;
	private No<T> cauda;
	private int tamanhoLista;
	
		
	
	public ListaCircular() {
		this.cabeca = null;
		this.cauda = null;
		this.tamanhoLista = 0;
	}



	public int size() {
		return this.tamanhoLista;
	}
	
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if(this.tamanhoLista == 0) {
			this.cabeca = novoNo;
			this.cauda = novoNo;
			this.cabeca.setNoProximo(cauda);
		}else {
			novoNo.setNoProximo(this.cauda);
			this.cabeca.setNoProximo(novoNo);
			this.cauda = novoNo;
		}
		this.tamanhoLista++;
	}
	
	
	
	public void remove(int index) {
		if(index >= this.tamanhoLista)
			throw new IndexOutOfBoundsException("O indice � maior que o tamnho da lista!");
		No<T> noAuxiliar = this.cauda;
		if(index == 0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeca.setNoProximo(this.cauda);
		}else if(index == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		}else {
			for(int i = 0; i < index-1; i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		tamanhoLista--;
	}
	
	
	
	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}
	
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	
	
	private No<T> getNo(int index){
		if(this.isEmpty())
			throw new IndexOutOfBoundsException("A lista est� vazia!");
		if(index == 0) {
			return this.cauda;
		}
		No<T> noAuxiliar = this.cauda;
		for(int i = 0; (i < index) && (this.cauda != null); i++) {
			 noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}



	@Override
	public String toString() {
		String strRetorno = "";
			
		No<T> noAuxiliar = this.cauda;
		for(int i = 0; i < this.size(); i++) {
			strRetorno += "[No[conteudo= " + noAuxiliar.getConteudo() + "}]";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
		return strRetorno ;
	}
	
	

}
