package com.estruturadedados;

public class ConceitoNo<T> {
	
	private T conteudo;
	private ConceitoNo<T> proximoNo;
	
	public ConceitoNo(T conteudo) {
		this.proximoNo = null;
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public ConceitoNo<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(ConceitoNo<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return "ConceitoNo [conteudo=" + conteudo + "]";
	}
	

}
