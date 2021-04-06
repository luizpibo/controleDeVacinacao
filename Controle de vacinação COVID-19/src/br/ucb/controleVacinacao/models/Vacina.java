package br.ucb.controleVacinacao.models;

import java.time.LocalDateTime;

public class Vacina {
	//Declarção de variaveis da classe
	private String tipo;
	private String lote;
	private int quantidadeEmEstoque;
	private LocalDateTime fabricacao;
	private LocalDateTime aberto;
	
	//Construtores
	public Vacina(String tipo, String lote, int quantidadeEmEstoque, LocalDateTime fabricacao) {
		super();
		setTipo(tipo);
		setLote(lote);
		setQuantidadeEmEstoque(quantidadeEmEstoque);
		setFabricacao(fabricacao);
	}
	
	//Gets and Sets
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	public LocalDateTime getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(LocalDateTime fabricacao) {
		this.fabricacao = fabricacao;
	}
	public LocalDateTime getAberto() {
		return aberto;
	}
	public void setAberto(LocalDateTime aberto) {
		this.aberto = aberto;
	}
	
	//Metodos
	
}
