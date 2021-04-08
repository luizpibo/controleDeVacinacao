package br.ucb.controleVacinacao.models;

import java.time.LocalDateTime;

public class Vacina {
	//Atributos
	private int id;
	private String tipo;
	private LocalDateTime fabricacao;
	private LocalDateTime aberto = null;
	
	//Construtores
	public Vacina(int id, String tipo, LocalDateTime fabricacao) {
		setId(id);
		setTipo(tipo);
		setFabricacao(fabricacao);
	}
	
	//Gets and Sets
	
	public String getTipo() {
		return tipo;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public void abrirVacina() {
		setAberto(LocalDateTime.now());
	}
	
	public boolean checarValidade12Meses() {
		return getFabricacao().plusMonths(12).isBefore(LocalDateTime.now());
	}
	
}
