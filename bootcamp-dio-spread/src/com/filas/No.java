package com.filas;

public class No<T> { 
	
	private T object;
	private No<T> refeNo;
	
	
	public No() {
	}
	
	
	public Object getObject() {
		return object;
	}


	public void setObject(T object) {
		this.object = object;
	}


	public No<T> getRefeNo() {
		return refeNo;
	}


	public void setRefeNo(No<T> refeNo) {
		this.refeNo = refeNo;
	}


	public No(T object) {
		this.refeNo = null;
		this.object = object;
	}


	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	

}
