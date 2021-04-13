package br.ucb.controleVacinacao.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vacina {
	//Atributos
	private int id;
	private String tipo;
	private LocalDate fabricacao;
	private LocalDateTime aberto = null;
	
	//Construtores
	public Vacina(int id, String tipo, LocalDate fabricacao) {
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
	public LocalDate getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(LocalDate fabricacao) {
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
	
}
