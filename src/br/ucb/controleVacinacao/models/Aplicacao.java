package br.ucb.controleVacinacao.models;

import java.time.LocalDateTime;

public class Aplicacao {
	//Declarção de variaveis da classe
	private Vacina vacina;
	private LocalDateTime dataAplicacao;
	private Pessoa cidadao;
	
	public Aplicacao(Vacina vacina, LocalDateTime dataAplicacao, Pessoa cidadao) {
		super();
		this.vacina = vacina;
		this.dataAplicacao = dataAplicacao;
		this.cidadao = cidadao;
	}
	public Vacina getVacina() {
		return vacina;
	}
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	public LocalDateTime getDataAplicacao() {
		return dataAplicacao;
	}
	public void setDataAplicacao(LocalDateTime dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	public Pessoa getCidadao() {
		return cidadao;
	}
	public void setCidadao(Pessoa cidadao) {
		this.cidadao = cidadao;
	}
	
	

}
