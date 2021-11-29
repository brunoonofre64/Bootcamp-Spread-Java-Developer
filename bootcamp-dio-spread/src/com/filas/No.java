package com.filas;

public class No { 
	
	private Object object;
	private No refeNo;
	
	
	public No() {
	}
	
	
	public Object getObject() {
		return object;
	}


	public void setObject(Object object) {
		this.object = object;
	}


	public No getRefeNo() {
		return refeNo;
	}


	public void setRefeNo(No refeNo) {
		this.refeNo = refeNo;
	}


	public No(Object object) {
		this.refeNo = null;
		this.object = object;
	}


	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	

}
